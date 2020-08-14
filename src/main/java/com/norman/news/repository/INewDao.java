package com.norman.news.repository;

import com.norman.news.repository.entity.NewEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/** 新闻 */
@Repository
public interface INewDao {
    /**
     * 增加一条
     *
     * @param item 视频
     */
    @Insert("insert into new(item_id," +
            "content)" +
            "values(#{item_id}" +
            ",#{content})")
    void insertItem(NewEntity item);

    /**
     * 获取all
     */
    @Select("SELECT * FROM new")
    List<NewEntity> getAll();

    /**
     * 根据id查询新闻
     */
    @Select("select * from new  where id=#{id} ")
    NewEntity findById(int id);

    /**
     * 根据id查询新闻
     */
    @Select("select * from new  where item_id=#{item_id} ")
    NewEntity findByItemId(String item_id);
}
