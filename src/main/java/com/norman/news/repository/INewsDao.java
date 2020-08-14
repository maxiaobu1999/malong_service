package com.norman.news.repository;

import com.norman.news.repository.entity.NewsEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/** 新闻 */
@Repository
public interface INewsDao {
    /**
     * 增加一条
     *
     * @param item 视频
     */
    @Insert("insert into news(item_id," +
            "content," +
            "channelCode," +
            "channel)" +
            "values(#{item_id}" +
            ",#{content}" +
            ",#{channelCode}" +
            ",#{channel})")
    void insertItem(NewsEntity item);

    /**
     * 获取all
     */
    @Select("SELECT * FROM news")
    List<NewsEntity> getAll();

    /**
     * 随机获取n条
     */
    @Select("SELECT * FROM news  ORDER BY  RAND() LIMIT #{num} ")
    List<NewsEntity> findByNum(int num);

    /**
     * 随机获取n条
     */
    @Select("SELECT * FROM news where channelCode=#{channelCode} ORDER BY  RAND() LIMIT #{num} ")
    List<NewsEntity> findByChannel(int num,String channelCode);

}
