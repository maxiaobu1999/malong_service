package com.norman.moive.repository;

import com.norman.moive.dto.response.Movie;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMovieDao {

    /**
     * 保存影片
     *
     * @param movie 视频
     */
    @Insert("insert into movie(name,title_tip,type,tag ,cover_url,score,score_total,score_num,alias" +
            ",director,actors,language,region" +
            ",release_time" +
            ",length" +
            ",update_time,views_total,views_today" +
            ",summary)" +
            "values(#{name},#{title_tip},#{type},#{tag},#{cover_url},#{score},#{score_total},#{score_num},#{alias}" +
            ",#{director},#{actors},#{language},#{region}" +
            ",#{release_time}" +
            ",#{length}" +
            ",#{update_time},#{views_total},#{views_today}" +
            ",#{summary})")
    void saveMovie(Movie movie);

    /**
     * 根据名称修改影片
     */
    @Update("update movie set name=#{name},title_tip=#{title_tip}" +
            ",type=#{type},tag=#{tag},cover_url=#{cover_url},score=#{score},score_total=#{score_total}" +
            ",score_num=#{score_num},alias=#{alias},director=#{director},actors=#{actors}," +
            "language=#{language},region=#{region},release_time=#{release_time},length=#{length},update_time=#{update_time}," +
            "views_total=#{views_total},views_today=#{views_today},summary=#{summary} where name=#{name}")
    void updateMovie(Movie movie);

    /**
     * 查询所有视频
     */
    @Select("select * from movie")
    List<Movie> findAll();

    /**
     * 根据影片名称查询影片
     */
    @Select("select * from movie  where name=#{name} ")
//    @ResultMap("movieMap")
    List<Movie> findByName(String name);

    /**
     * 根据影片id查询影片
     */
    @Select("select * from movie  where id=#{id} ")
    Movie findById(int id);

    /**
     * 根据类别查询影片
     * 国产动漫
     * 日韩动漫
     * 欧美动漫
     * 港台动漫
     * 海外动漫
     */
    @Select("select * from movie where type=#{type}")
    List<Movie> findByType(String type);

    /**
     * 根据条件筛选(多条件查询)
     *
     * @param custom   热播榜
     * @param type     恐怖
     * @param region   美国
     * @param time     2019
     * @param language 中文
     */
//    @Select("select * from movie where type=#{type}")
    @Select("<script> " +
            "SELECT * from movie\n" +
            "<where>\n" +
            "1+1"+
            "<if test=\"type!=null\">\n" +
            "    and type=#{type}\n" +
            "</if>\n" +
            "<if test=\"region!=null\">\n" +
            "    and region=#{region}\n" +
            "</if>\n" +
            "<if test=\"time!=null\">\n" +
            "   and  release_time=#{time}\n" +
            "</if>\n" +
            "<if test=\"language!=null\">\n" +
            "    and language=#{language}\n" +
            "</if>\n" +
            "</where>" +
            "<if test=\"start!=null and pageSize!=null\">"+
            "     LIMIT #{start},#{pageSize}"+
            "</if>\n" +
            "</script>")
    List<Movie> findByFilter(String custom, String type, String region,
                             String time, String language,int start,int pageSize);

    /** 随机获取n条 */
    @Select("SELECT * FROM movie  ORDER BY  RAND() LIMIT #{num} ")
    List<Movie> findByNum(int num);

    /** 获取电影类型：恐怖片 */
    @Select("SELECT DISTINCT type FROM movie   ")
    List<String> queryAllType();

    /** 获取电影地区：香港 */
    @Select("SELECT DISTINCT region FROM movie  ")
    List<String> queryAllRegion();

    /** 获取电影语言：中文 */
    @Select("SELECT DISTINCT language FROM movie  ")
    List<String> queryAllLanguage();
}
