package com.norman.feed.repository;

import com.norman.account.repository.entity.AccountEntity;
import com.norman.feed.repository.entity.TabItemInfo;
import com.norman.mini.dto.response.MiniEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * feed频道
 */
@Repository
public interface IFeedTabDao {
    /** 查询频道信息 */
    @Select("SELECT * FROM feedtab ")
    List<TabItemInfo> queryAll();

    /** 查询全部添加的频道信息 */
    @Select("SELECT * FROM feedtab WHERE added=1 ")
    List<TabItemInfo> queryAdded();

    /**
     * 更新全部频道
     * mysql批量更新多条记录
     *
     * @param items 用户信息
     */
    // mysql数据库采用一下写法即可执行，但是数据库连接必须配置：&allowMultiQueries=true
//    item：将当前遍历出的元素赋值给指定的变量 （相当于for循环中的i）
//    separator:每个元素之间的分隔符
//    open：遍历出所有结果拼接一个开始的字符
//    close:遍历出所有结果拼接一个结束的字符
//    index:索引。遍历list的时候是index就是索引，item就是当前值
//    #{变量名}就能取出变量的值也就是当前遍历出的元素
    @Insert({"<script>" +
            "<foreach item='TabItemInfo' collection='items' index='index' open='' close='' separator=';'>" +
            " UPDATE feedtab SET " +
            "name = #{TabItemInfo.name}," +
            "canDelete = #{TabItemInfo.canDelete}," +
            "added = #{TabItemInfo.added}," +
            "normalColor = #{TabItemInfo.normalColor}," +
            "selectColor = #{TabItemInfo.selectColor}," +
            "indicatorColor = #{TabItemInfo.indicatorColor}," +
            "newTip = #{TabItemInfo.newTip}" +
//            "<if test='#{totalPvuv.sumSuv} != null'>sum_suv = #{totalPvuv.sumSuv}</if>" +
            " WHERE id = #{TabItemInfo.id} " +
            "</foreach>" +
            "</script>" })
    void updateAll(@Param("items") List<TabItemInfo> items);


    /**
     * 根据username获取查询用户信息
     */
    @Select("SELECT * FROM account where username=#{username} ")
    List<AccountEntity> findByUsername(String username);

    /**
     * 根据 phoneNum 获取查询用户信息
     */
    @Select("SELECT * FROM account where phoneNum=#{phoneNum} ")
    List<AccountEntity> findByphoneNum(String phoneNum);

    /**
     * 根据userId，更新token
     */
    @Update("update account set phoneNum=#{phoneNum}," +
            "userName=#{userName}," +
            "password=#{password}," +
            "nickname=#{nickname}," +
            "email=#{email}," +
            "avatar=#{avatar}," +
            "gender=#{gender}," +
            "identifier=#{identifier} where userId=#{userId}")
    void updateByUserId(AccountEntity token);

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
