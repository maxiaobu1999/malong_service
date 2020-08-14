package com.norman.tik.controller;

import com.norman.common.BaseResponse;
import com.norman.common.controller.BaseController;
import com.norman.config.annotation.SkipTokenValidate;
import com.norman.moive.dto.response.Movie;
import com.norman.moive.service.MovieService;
import com.norman.tik.dto.response.TikEntity;
import com.norman.tik.service.TikService;
import org.apache.http.util.TextUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController // 相当于@ResponseBody和@Controller
@RequestMapping(value = "/tik")// 配置url映射,一级
public class TikController extends BaseController {
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



    @Resource
    private TikService mTikService;
    @Resource
    MovieService mMovieService;

    /**
     * http://localhost:8088/tik/queryByNum?num=10
     *
     * @param num 多少条
     * @return n条视频数据
     */
    @SkipTokenValidate
    @RequestMapping(value = {"/queryByNum"}, method = {RequestMethod.GET})
    public BaseResponse<List<TikEntity>> queryByNum(@RequestParam  String num) {
        BaseResponse<List<TikEntity>> responseEntity;
        try {
            int count = Integer.parseInt(num);
            List<TikEntity> data = mTikService.queryByNum(count);
            List<Movie> movieList = mMovieService.queryByNum(count);

            for (int i = 0; i < data.size(); i++) {
                TikEntity model = data.get(i);

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



            responseEntity = new BaseResponse<>(0, "成功");
            responseEntity.setData(data);
        } catch (Exception e) {
            responseEntity = new BaseResponse<>(-1, "失败");
        }

        return responseEntity;
    }
}
