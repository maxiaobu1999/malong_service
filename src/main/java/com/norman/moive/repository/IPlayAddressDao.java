package com.norman.moive.repository;

import com.norman.moive.dto.response.PlayAddress;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPlayAddressDao {
    /**
     * 保存播放地址
     *
     * @param playAddress 播放地址
     */
    @Insert("insert into play_address(movie_id,media_type,url " +
            ",title)" +
            "values(#{movie_id},#{media_type},#{url}" +
            ",#{title})")
    void savePlayAddress(PlayAddress playAddress);


    /**
     * 根据影片id查询链接
     */
    @Select("select * from play_address  where movie_id=#{movie_id} ")
    List<PlayAddress> findByMovieId(int movie_id);

}
