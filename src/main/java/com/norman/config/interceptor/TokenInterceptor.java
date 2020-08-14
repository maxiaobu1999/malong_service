package com.norman.config.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.norman.common.BaseResponse;
import com.norman.common.TokenManager;
import com.norman.config.annotation.SkipTokenValidate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 * token拦截器
 * put请求拦截不了，待处理
 */
public class TokenInterceptor implements HandlerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(TokenInterceptor.class);

    //

    /**
     * 在Controller执行之前调用，责任链
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o 响应的处理器，自定义Controller
     * @return 如果返回false，controller不执行。不会继续调用其他的拦截器或处理器，此时需要通过response来产生响应；
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        httpServletRequest.getParameterMap().forEach((s, strings) -> {
            for (String value : strings) {
                logger.info("servletPath:{}, {}={}", httpServletRequest.getServletPath(), s, value);
            }
        });
        // put 请求拦截会转换异常
        if (!(o instanceof HandlerMethod)) {
            return true;
        }

        HandlerMethod method = (HandlerMethod) o;
        if (!method.hasMethodAnnotation(SkipTokenValidate.class)) {
            String userIdStr = httpServletRequest.getParameter("userId");
            String token = httpServletRequest.getParameter("token");
            if (userIdStr != null && token != null && !"".equals(userIdStr.trim()) && !"".equals(token.trim())) {
                int userId = Integer.parseInt(httpServletRequest.getParameter("userId"));
                if (!TokenManager.validateToken(userId, token)) {
                    BaseResponse baseResponse = new BaseResponse();
                    baseResponse.setCode(-1);
                    baseResponse.setMsg("token过期");
                    handleResponse(httpServletResponse, baseResponse);
                    return false;
                }
            } else {
                BaseResponse baseResponse = new BaseResponse();
                baseResponse.setCode(-2);
                baseResponse.setMsg("缺少参数userId或token");
                handleResponse(httpServletResponse, baseResponse);
                return false;
            }
        }
        return true;
    }

    // controller执行之后，且页面渲染之前调用
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    // 页面渲染之后调用，一般用于资源清理操作
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
    /** 结果写入响应体 */
    private void handleResponse(HttpServletResponse httpServletResponse, BaseResponse baseResponse) throws IOException {
        // 解决中文乱码问题
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setHeader("content-type", "text/html;charset=UTF-8");
        // 写入响应体
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpServletResponse.getOutputStream(), StandardCharsets.UTF_8);
        outputStreamWriter.write(JSONObject.toJSONString(baseResponse));
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }
}
