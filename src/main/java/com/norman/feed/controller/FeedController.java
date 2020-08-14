package com.norman.feed.controller;

import com.google.gson.Gson;
import com.norman.common.BaseResponse;
import com.norman.common.controller.BaseController;
import com.norman.config.annotation.SkipTokenValidate;
import com.norman.feed.dto.response.BaseFeedResponse;
import com.norman.feed.repository.IFeedTabDao;
import com.norman.feed.repository.entity.TabItemInfo;
import com.norman.mini.dto.response.MiniEntity;
import com.norman.mini.service.MiniService;
import com.norman.moive.dto.response.Movie;
import com.norman.moive.service.MovieService;
import com.norman.news.dto.response.NewsListEntity;
import com.norman.news.service.NewsService;
import com.norman.tik.dto.response.TikEntity;
import com.norman.tik.service.TikService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.http.util.TextUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * feed流
 */
@SuppressWarnings("Duplicates")
@RestController // 相当于@ResponseBody和@Controller
@RequestMapping(value = "/feed")// 配置url映射,一级
public class FeedController  extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(FeedController.class);
    @Resource
    private IFeedTabDao mFeedTabDao;
    @Resource
    NewsService mNewsService;
    @Resource
    MiniService mMiniService;
    @Resource
    private TikService mTikService;
    @Resource
    private MovieService mMovieService;

    /** 未知关注状态 */
    public static final int FLOLLOW_STATE_NONE = 0;
    /** 关注状态：正在关注 */
    public static final int FOLLOW_STATE_ADDING = 1;
    /** 关注状态：正在取消关注 */
    public static final int FOLLOW_STATE_DELETING = 2;
    /** 关注状态：没有关注 */
    public static final int FOLLOW_STATE_DELETED = 3;
    /** 关注状态：已经关注 */
    public static final int FOLLOW_STATE_ADDED = 4;
    /** 标题最多展示行数 */
    public static final int UGC_TITLE_MAXT_LINE = 2;

    /**
     * http://localhost:8088/feed/queryByNum?num=10
     *
     * @param num 多少条
     * @return n条数据
     */
    @ApiOperation(value = "获取数据", notes = "随机获取n条数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "num", value = "获取多少条新闻数据", required = true, paramType = "query", dataType = "String", defaultValue = "10"),
    })
    @SkipTokenValidate
    @RequestMapping(value = {"/queryByNum"}, method = {RequestMethod.GET})
    public BaseResponse<List<BaseFeedResponse>> queryByNum(@RequestParam String num) {
        BaseResponse<List<BaseFeedResponse>> responseEntity;
        List<BaseFeedResponse> feedList = new ArrayList<>();
        Gson gson = new Gson();
        try {
            // 新闻
            List<NewsListEntity> newsList = mNewsService.queryByNum(Integer.parseInt(num)-3, null);
            for (NewsListEntity item : newsList) {
                BaseFeedResponse feedResponse = new BaseFeedResponse();
                feedResponse.mData = gson.toJson(item);
                feedResponse.mType = item.layoutType;
                feedList.add(feedResponse);
            }

            // 横版视频
            List<MiniEntity> miniList = mMiniService.queryByNum(String.valueOf(1));
            for (MiniEntity item : miniList) {
                BaseFeedResponse feedResponse = new BaseFeedResponse();
                feedResponse.mData = gson.toJson(item);
                feedResponse.mType = 4;
                feedList.add(feedResponse);
            }

            // 竖版视频
            List<TikEntity> tikList = mTikService.queryByNum(2);

            List<Movie> movieList = mMovieService.queryByNum(2);

            for (int i = 0; i < tikList.size(); i++) {
                TikEntity model = tikList.get(i);

                Movie movie = movieList.get(i);
                model.authorIcon = movie.getCover_url();
                model.authorName = movie.getDirector();
                model.authorDescribe = movie.getSummary();
                if (0 != movie.getScore_num()) {
                    model.productionNum = movie.getScore_num() + "个作品";
                }
                if (TextUtils.isEmpty(model.title)) {
                    model.title = movie.getName();
                }
                model.topic = movie.getAlias();
                model.followStatus = Math.random() > 0.3 ? FOLLOW_STATE_DELETED : FOLLOW_STATE_ADDED;
                model.followGuide = Math.random() > 0.8 ? "老铁双击666" : "";
                TikEntity.MusicInfo musicInfo = new TikEntity.MusicInfo();
                model.followAnimNum = (int) (Math.random() * 5);
                int switcher = Math.random() > 0.3 ? 1 : 0;
                musicInfo.musicTitleSwitch = switcher;
                musicInfo.musicCDSwitch = switcher;
                musicInfo.musicName = movie.getAlias();
                musicInfo.musicPoster = movie.getCover_url();
                model.musicInfo = musicInfo;
                TikEntity.Anchor anchor = new TikEntity.Anchor();
                anchor.mStatus = Math.random() > 0.8 ? 1 : 0;
                model.anchorInfo = anchor;
            }


            for (TikEntity item : tikList) {
                BaseFeedResponse feedResponse = new BaseFeedResponse();
                feedResponse.mData = gson.toJson(item);
                feedResponse.mType = 5;
                feedList.add(feedResponse);
            }

            Collections.shuffle(feedList); //随机排序


            responseEntity = new BaseResponse<>(0, "成功");
            responseEntity.setData(feedList);
        } catch (Exception e) {
            e.printStackTrace();
            responseEntity = new BaseResponse<>(-1, "失败");
        }

        return responseEntity;
    }




    /**
     * http://localhost:8088/feed/queryChannel
     * feed频道数据
     */
    @SkipTokenValidate
    @RequestMapping("/queryChannel")
    public BaseResponse<List<TabItemInfo>> queryChannel(String token) {
        List<TabItemInfo> tabItemInfos = mFeedTabDao.queryAll();
        BaseResponse<List<TabItemInfo>> responseEntity;
        responseEntity = new BaseResponse<>(0, "成功");
        responseEntity.setData(tabItemInfos);
        return responseEntity;
    }
    /**
     * http://localhost:8088/feed/queryAdded
     * 查询全部添加的频道信息
     */
    @SkipTokenValidate
    @RequestMapping("/queryAdded")
    public BaseResponse<List<TabItemInfo>> queryAdded(String token) {
        List<TabItemInfo> tabItemInfos = mFeedTabDao.queryAdded();
        BaseResponse<List<TabItemInfo>> responseEntity;
        responseEntity = new BaseResponse<>(0, "成功");
        responseEntity.setData(tabItemInfos);
        return responseEntity;
    }

    /**
     * http://localhost:8088/feed/updateChannel
     * feed频道数据
     */
    @SkipTokenValidate
    @RequestMapping(value = {"/updateChannel"}, method = {RequestMethod.POST}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public BaseResponse<String> updateChannel(@RequestBody List<TabItemInfo> tabInfoList, String token) {
        mFeedTabDao.updateAll(tabInfoList);
        BaseResponse<String> responseEntity;
        responseEntity = new BaseResponse<>(0, "feed频道数据更新成功");
        responseEntity.setData("");
        return responseEntity;
    }

    private static String CHANNEL_CONTENT = "{\n" +
            "    \"tabs\": [\n" +
            "        {\n" +
            "            \"id\": \"1\",\n" +
            "            \"name\": \"推荐\",\n" +
            "            \"canDelete\": \"0\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"0\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"7\"\n" +
            "            },\n" +
            "            \"newTip\": {\n" +
            "                \"tip\": \"1\",\n" +
            "                \"start\": \"1506398400\",\n" +
            "                \"end\": \"1507608000\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"2\",\n" +
            "            \"name\": \"热点\",\n" +
            "            \"canDelete\": \"0\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"3\",\n" +
            "            \"name\": \"社会\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"4\",\n" +
            "            \"name\": \"娱乐\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"5\",\n" +
            "            \"name\": \"科技\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"6\",\n" +
            "            \"name\": \"汽车\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"0\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"Novel\",\n" +
            "                \"bundleVersion\": \"0\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"7\",\n" +
            "            \"name\": \"体育\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"6\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"8\",\n" +
            "            \"name\": \"财经\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"9\",\n" +
            "            \"name\": \"军事\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"10\",\n" +
            "            \"name\": \"国际\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"11\",\n" +
            "            \"name\": \"时尚\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"12\",\n" +
            "            \"name\": \"游戏\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"13\",\n" +
            "            \"name\": \"旅游\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"14\",\n" +
            "            \"name\": \"历史\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"15\",\n" +
            "            \"name\": \"探索\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"16\",\n" +
            "            \"name\": \"美食\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"17\",\n" +
            "            \"name\": \"育儿\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"18\",\n" +
            "            \"name\": \"养生\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"19\",\n" +
            "            \"name\": \"故事\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"21\",\n" +
            "            \"name\": \"MVP\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"20\",\n" +
            "            \"name\": \"美文\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"0\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        }\n" +
            "    ],\n" +
            "    \"unadded\": [\n" +
            "        {\n" +
            "            \"id\": \"7\",\n" +
            "            \"name\": \"图片\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"8\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"5\",\n" +
            "            \"name\": \"时尚\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"0\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"72\",\n" +
            "            \"name\": \"新华社\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"6\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"2\",\n" +
            "            \"name\": \"视频\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"0\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"6\",\n" +
            "            \"name\": \"国际\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"12\",\n" +
            "            \"name\": \"汽车\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"Xcar\",\n" +
            "                \"bundleVersion\": \"6\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"13\",\n" +
            "            \"name\": \"军事\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"14\",\n" +
            "            \"name\": \"科技\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"15\",\n" +
            "            \"name\": \"财经\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"27\",\n" +
            "            \"name\": \"问答\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"33\",\n" +
            "            \"name\": \"动漫\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"0\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"Comic\",\n" +
            "                \"bundleVersion\": \"0\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"28\",\n" +
            "            \"name\": \"搞笑\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"34\",\n" +
            "            \"name\": \"美食\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"8\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"18\",\n" +
            "            \"name\": \"历史\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"16\",\n" +
            "            \"name\": \"游戏\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"17\",\n" +
            "            \"name\": \"女人\",\n" +
            "            \"canDelete\": \"1\",\n" +
            "            \"canDegrade\": \"1\",\n" +
            "            \"canTTS\": \"1\",\n" +
            "            \"rnInfo\": {\n" +
            "                \"bundleId\": \"box.rnplugin.feedhn\",\n" +
            "                \"moduleName\": \"FeedHN\",\n" +
            "                \"bundleVersion\": \"2\"\n" +
            "            }\n" +
            "        }\n" +
            "    ]\n" +
            "}";

}
