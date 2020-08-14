package com.norman.ad.controller;

import com.norman.common.BaseResponse;
import com.norman.common.controller.BaseController;
import com.norman.config.annotation.SkipTokenValidate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 评论
 */
@RestController // 相当于@ResponseBody和@Controller
@RequestMapping(value = "/ad")// 配置url映射,一级
public class AdController extends BaseController {

    /**
     * http://localhost:8088/ad/splash
     *
     * @return 获取闪屏广告数据
     */
    @SkipTokenValidate
    @RequestMapping(value = {"/splash"}, method = {RequestMethod.GET})// 配置url映射,二级
    public BaseResponse<String> splash(String token) {
        BaseResponse<String> responseEntity;
        try {
            responseEntity = new BaseResponse<>(0, "成功");
            responseEntity.setData(content);
        } catch (Exception e) {
            e.printStackTrace();
            responseEntity = new BaseResponse<>(-1, "失败，为啥不知道");
        }
        return responseEntity;
    }

    private static String ossPath = "https://maqinglong-1253423006.cos.ap-beijing-1.myqcloud.com/oss/";
    private static String content = "[\n" +
            "    {\n" +
            "        \"act_id\": \"13728538636840277384\",\n" +
            "        \"sourceType\": 1,\n" +
            "        \"sourceUrl\": \"" + ossPath + "image/2432a05e-06ec-424c-b7d6-4c8e996b2814_1440_2416_ad.jpg\",\n" +
            "        \"sourceSize\": 2,\n" +
            "        \"labelName\": \"\",\n" +
            "        \"sum\": \"5b8a631b9530d30fd11c7a8442e5215e\",\n" +
            "        \"remain\": 3,\n" +
            "        \"skip\": true,\n" +
            "        \"rate\": 2,\n" +
            "        \"startTime\": 1572192000,\n" +
            "        \"endTime\": 2572278399,\n" +
            "        \"command\": \"{\\\"mode\\\":\\\"0\\\",\\\"intent\\\":\\\"intent:#Intent;S.bdsb_light_start_url=https%3A%2F%2Fwww.apple.com.cn%2Fcn%2Fiphone-11%2F;end\\\",\\\"class\\\":\\\"BrowserActivity\\\",\\\"min_v\\\":\\\"16786176\\\"}\",\n" +
            "        \"sample\": 1,\n" +
            "        \"curRate\": 0,\n" +
            "        \"sort\": 1,\n" +
            "        \"networkType\": 0,\n" +
            "        \"realtj\": 1,\n" +
            "        \"splitTime\":1,\n" +
            "        \"countDownable\": 1,\n" +
            "        \"key\": \"\",\n" +
            "        \"title\": \"苹果\",\n" +
            "        \"videoVoice\": \"\",\n" +
            "        \"isshake\": 0,\n" +
            "        \"shakecommand\": \"\",\n" +
            "        \"time_stamp\": 0\n" +
            "    }\n" +
            "]";
}
