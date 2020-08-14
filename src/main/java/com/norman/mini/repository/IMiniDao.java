package com.norman.mini.repository;

import com.norman.mini.dto.response.MiniEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 小视频
 */
@Repository
public interface IMiniDao {



    /**
     * 随机获取n条
     */
    @Select("SELECT * FROM haokan  ORDER BY  RAND() LIMIT #{num} ")
    List<MiniEntity> findByNum(int num);

    /**
     * 增加一条
     *
     * @param item 视频
     */
    @Insert("insert into haokan(vid,title,image,videoUrl,duration," +
            "videoSize,playcntText," +
            "likeNum," +
            "commentNum," +
            "authorIcon," +
            "authorName)" +
            "values(#{vid},#{title},#{image},#{videoUrl},#{duration}" +
            ",#{videoSize},#{playcntText}" +
            ",#{likeNum}" +
            ",#{commentNum}" +
            ",#{authorIcon}" +
            ",#{authorName})")
    void insertItem(MiniEntity item);


    /**
     * 获取all
     */
    @Select("SELECT * FROM haokan")
    List<MiniEntity> getAll();



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
