package com.norman.tik.repository;

import com.norman.tik.dto.response.DYVideoItem;
import com.norman.tik.dto.response.TikEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 小视频
 */
@Repository
public interface ITikDao {

    /**
     * 根据id查询影片
     */
    @Select("select * from mini  where id=#{id} ")
    DYVideoItem findById(int id);

    /**
     * 随机获取n条
     */
    @Select("SELECT * FROM mini_video  ORDER BY  RAND() LIMIT #{num} ")
    List<TikEntity> findByNum(int num);

    /**
     * 增加一条
     *
     * @param item 视频
     */
    @Insert("insert into mini_video(vid,HW,width,height,image" +
            ",playNum,likeNum" +
            ",videoUrl" +
            ",videoSize" +
            ",videoBps" +
            ",authorIcon" +
            ",authorName" +
            ",authorDescribe" +
            ",productionNum" +
            ",fansNum" +
            ",title" +
            ",topic" +
            ",followStatus" +
            ",followGuide" +
            ",followAnimNum" +
            ",musicName" +
            ",musicPoster" +
            ",musicCDSwitch" +
            ",musicTitleSwitch" +
            ",musicCmd" +
            ",anchorStatus" +
            ",anchorCmd)" +
            "values(#{vid},#{HW},#{width},#{height},#{image}" +
            ",#{playNum},#{likeNum}" +
            ",#{videoUrl}" +
            ",#{videoSize}" +
            ",#{videoBps}" +
            ",#{authorIcon}" +
            ",#{authorName}" +
            ",#{authorDescribe}" +
            ",#{productionNum}" +
            ",#{fansNum}" +
            ",#{title}" +
            ",#{topic}" +
            ",#{followStatus}" +
            ",#{followGuide}" +
            ",#{followAnimNum}" +
            ",#{musicName}" +
            ",#{musicPoster}" +
            ",#{musicCDSwitch}" +
            ",#{musicTitleSwitch}" +
            ",#{musicCmd}" +
            ",#{anchorStatus}" +
            ",#{anchorCmd})")
    void insertItem(TikEntity item);



    /**
     * 获取all
     */
    @Select("SELECT * FROM mini_video")
    List<TikEntity> getAll();



    //    @Insert("insert into mini(" +
//            "HW," +
//            "mode," +
//            "miniLandPoster)" +
//            "values(" +
//            "#{HW}," +
//            "#{mode}," +
//            "#{miniLandPoster})")

    //
//    /**
//     * 根据名称修改影片
//     */
//    @Update("update movie set name=#{name},title_tip=#{title_tip}" +
//            ",type=#{type},tag=#{tag},cover_url=#{cover_url},score=#{score},score_total=#{score_total}" +
//            ",score_num=#{score_num},alias=#{alias},director=#{director},actors=#{actors}," +
//            "language=#{language},region=#{region},release_time=#{release_time},length=#{length},update_time=#{update_time}," +
//            "views_total=#{views_total},views_today=#{views_today},summary=#{summary} where name=#{name}")
//    void updateMovie(Movie movie);
//
//    /**
//     * 查询所有视频
//     */
//    @Select("select * from movie")
//    List<Movie> findAll();
//
//    /**
//     * 根据影片名称查询影片
//     */
//    @Select("select * from movie  where name=#{name} ")
////    @ResultMap("movieMap")
//    List<Movie> findByName(String name);
//
//
//    /**
//     * 根据类别查询影片
//     * 国产动漫
//     * 日韩动漫
//     * 欧美动漫
//     * 港台动漫
//     * 海外动漫
//     */
//    @Select("select * from movie where type=#{type}")
//    List<Movie> findByType(String type);
}
