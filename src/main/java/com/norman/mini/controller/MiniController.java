package com.norman.mini.controller;

import com.norman.common.BaseResponse;
import com.norman.common.controller.BaseController;
import com.norman.config.annotation.SkipTokenValidate;
import com.norman.mini.dto.response.MiniEntity;
import com.norman.mini.service.MiniService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController // 相当于@ResponseBody和@Controller
@RequestMapping(value = "/mini")// 配置url映射,一级
public class MiniController  extends BaseController {
    @Resource
    MiniService mMiniService;

    /**
     * http://localhost:8088/mini/queryByNum?num=10
     *
     * @param num 多少条
     * @return n条视频数据
     */
    @SkipTokenValidate
    @RequestMapping("/queryByNum")
    @ResponseBody
    public BaseResponse<List<MiniEntity>> queryByNum(String num) {
        BaseResponse<List<MiniEntity>> responseEntity;
        try {
            List<MiniEntity> list = mMiniService.queryByNum(num);
            responseEntity = new BaseResponse<>(0, "成功");
            responseEntity.setData(list);
        } catch (Exception e) {
            responseEntity = new BaseResponse<>(-1, "失败");
        }
        return responseEntity;
    }
}
