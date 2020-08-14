package com.norman.news.controller;

import com.norman.comment.dto.response.CommentEntity;
import com.norman.common.BaseResponse;
import com.norman.common.controller.BaseController;
import com.norman.config.annotation.SkipTokenValidate;
import com.norman.news.dto.response.NewContentEntity;
import com.norman.news.dto.response.NewsListEntity;
import com.norman.news.service.NewsService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 评论
 */
@RestController // 相当于@ResponseBody和@Controller
@RequestMapping(value = "/news")// 配置url映射,一级
//@CrossOrigin(origins = "*")// 解决浏览器跨域问题(局部)
public class NewsController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(NewsController.class);
    @Resource
    NewsService mNewsService;

    /**
     * http://localhost:8088/news/queryByNum?num=10&channelId=1
     *
     * @param num 多少条
     * @return n条新闻数据
     */
    @ApiOperation(value = "获取新闻数据", notes = "随机获取n条数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "num", value = "获取多少条新闻数据", required = true, paramType = "query", dataType = "String", defaultValue = "10"),
            @ApiImplicitParam(name = "channelId", value = "所属频道的ID", required = true, paramType = "query", dataType = "String", defaultValue = "1"),
    })
    @SkipTokenValidate
    @RequestMapping(value = {"/queryByNum"}, method = {RequestMethod.GET})
    public BaseResponse<List<NewsListEntity>> queryByNum(@RequestParam String num, @RequestParam(value = "0",required = false) String channelId) {
        BaseResponse<List<NewsListEntity>> responseEntity;
        try {
            List<NewsListEntity> list = mNewsService.queryByNum(Integer.parseInt(num), channelId);
            responseEntity = new BaseResponse<>(0, "成功");
            responseEntity.setData(list);
        } catch (Exception e) {
            e.printStackTrace();
            responseEntity = new BaseResponse<>(-1, "失败");
        }

        return responseEntity;
    }


    /**
     * http://localhost:8088/news/queryNewByItemId?item_id=6769558338263843332
     * 根据item_id获取新闻详情
     *
     * @param item_id 新闻id
     */
    @SkipTokenValidate
    @RequestMapping(value = {"/queryNewByItemId"}, method = {RequestMethod.GET})
    public BaseResponse<NewContentEntity> queryByItemId(@RequestParam String item_id) {
        BaseResponse<NewContentEntity> responseEntity;
        try {
//            NewEntity newEntity = mNewDao.findByItemId(item_id);
//
//            NewContentEntity newContentEntity = new Gson().fromJson(newEntity.content, NewContentEntity.class);
            NewContentEntity newContentEntity = mNewsService.queryByItemId(item_id);

            responseEntity = new BaseResponse<>(0, "成功");
            responseEntity.setData(newContentEntity);
        } catch (Exception e) {
            responseEntity = new BaseResponse<>(-1, "失败");
        }

        return responseEntity;
    }


    /**
     * http://localhost:8088/news/queryCommentByItemId?item_id=6769558338263843332&start=0&num=2
     * 根据item_id获取新闻的评论
     *
     * @param item_id 新闻id
     */
    @SkipTokenValidate
    @RequestMapping(value = {"/queryCommentByItemId"}, method = {RequestMethod.GET})
    public BaseResponse<List<CommentEntity>> queryCommentByItemId(@RequestParam String item_id, @RequestParam int start,@RequestParam int num) {
        BaseResponse<List<CommentEntity>> responseEntity;
        try {
            List<CommentEntity> list = mNewsService.queryCommentByItemId(item_id, start, num);
            responseEntity = new BaseResponse<>(0, "成功");
            responseEntity.setData(list);
        } catch (Exception e) {
            e.printStackTrace();
            responseEntity = new BaseResponse<>(-1, "失败");
        }

        return responseEntity;
    }
}
