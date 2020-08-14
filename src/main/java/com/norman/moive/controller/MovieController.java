package com.norman.moive.controller;

import com.norman.common.BaseResponse;
import com.norman.common.controller.BaseController;
import com.norman.config.annotation.SkipTokenValidate;
import com.norman.moive.dto.response.Movie;
import com.norman.moive.dto.response.TypeEntity;
import com.norman.moive.service.MovieService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController // 相当于@ResponseBody和@Controller
@RequestMapping(value = "/movie")// 配置url映射,一级
public class MovieController extends BaseController {
    @Resource
    MovieService mMovieService;

    /**
     * http://localhost:8088/movie/queryByName?name=吃鸡大作战第二季
     *
     * @param name 影片名称
     * @return n条视频数据
     */
    @SkipTokenValidate
    @RequestMapping("/queryByName")
    @ResponseBody
    public Movie queryByName(String name) {
        return mMovieService.queryByName(name);
    }

    /**
     * http://172.24.200.253:8088/movie/queryByName?name=吃鸡大作战第二季
     * http://localhost:8088/movie/queryByType?type=福利片
     * http://172.24.201.30:8088/movie/queryByType?type=国产动漫
     * http://172.24.108.153:8088/movie/queryByType?type=国产动漫
     * 172.24.108.153
     *
     * @param type 国产动漫
     *             * 日韩动漫
     *             * 欧美动漫
     *             * 港台动漫
     *             * 海外动漫
     * @return n条视频数据
     */
    @SkipTokenValidate
    @RequestMapping("/queryByType")
    @ResponseBody
    public BaseResponse<List<Movie>> queryByType(String type) {
        List<Movie> movieList = mMovieService.queryByType(type);
        BaseResponse<List<Movie>> responseEntity =
                new BaseResponse<>(0, "成功");
        responseEntity.setData(movieList);
        return responseEntity;
    }


    /**
     * 随机获取n条数据
     * <p>
     * http://localhost:8088/movie/queryByNum?count=20
     *
     * @param count 几条
     */
    @SkipTokenValidate
    @RequestMapping("/queryByNum")
    @ResponseBody
    public BaseResponse<List<Movie>> queryByNum(String count) {
        BaseResponse<List<Movie>> responseEntity;
        try {
            responseEntity = new BaseResponse<>(0, "成功");
            int num = Integer.parseInt(count);
            List<Movie> movieList = mMovieService.queryByNum(num);
            responseEntity.setData(movieList);
        } catch (Exception e) {
            responseEntity = new BaseResponse<>(2, "失败:不知道为啥");

        }
        return responseEntity;
    }


    /**
     * 获取筛选数据
     * <p>
     * http://localhost:8088/movie/queryFilter
     */
    @SkipTokenValidate
    @RequestMapping("/queryFilter")
    @ResponseBody
    public BaseResponse<List<TypeEntity>> queryFilter() {
        BaseResponse<List<TypeEntity>> responseEntity;
        try {
            List<TypeEntity> typeEntityList = mMovieService.queryFilter();
            responseEntity = new BaseResponse<>(0, "成功");
            responseEntity.setData(typeEntityList);
        } catch (Exception e) {
            responseEntity = new BaseResponse<>(2, "失败:不知道为啥");

        }
        return responseEntity;
    }


    /**
     * 根据条件筛选
     * <p>
     * http://localhost:8088/movie/findByFilter?type=韩国剧&region=韩国&time=2007&language=韩语&start=0&pageSize=10
     *
     * @param custom   热播榜
     * @param type     恐怖
     * @param region   美国
     * @param time     2019
     * @param language 中文
     */
    @SkipTokenValidate
    @RequestMapping("/findByFilter")
    @ResponseBody
    public BaseResponse<List<Movie>> findByFilter(String custom, String type
            , String region, String time, String language, String start, String pageSize) {
        BaseResponse<List<Movie>> responseEntity;
        try {
            List<Movie> movieList = mMovieService.findByFilter(custom, type,
                    region, time, language, Integer.parseInt(start),
                    Integer.parseInt(pageSize));
            responseEntity = new BaseResponse<>(0, "成功");
            responseEntity.setData(movieList);
        } catch (Exception e) {
            e.printStackTrace();
            responseEntity = new BaseResponse<>(2, "失败:不知道为啥");
        }
        return responseEntity;
    }
}
