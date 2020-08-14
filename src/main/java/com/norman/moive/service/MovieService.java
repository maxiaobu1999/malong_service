package com.norman.moive.service;

import com.norman.moive.dto.response.Movie;
import com.norman.moive.dto.response.TypeEntity;

import java.util.List;

public interface MovieService {
    /** 根据影片名称查询影片 */
    Movie queryByName(String name);

    /**
     * 根据类别查询影片
     * 国产动漫
     * 日韩动漫
     * 欧美动漫
     * 港台动漫
     * 海外动漫
     */
    List<Movie> queryByType(String type);

    /** 随机获取n条 */
    List<Movie> queryByNum(int num);

    /** 获取筛选数据 */
    List<TypeEntity> queryFilter();

    /**
     * 根据条件筛选(多条件查询)
     *
     * @param custom   热播榜
     * @param type     恐怖
     * @param region   美国
     * @param time     2019
     * @param language 中文
     */
    List<Movie> findByFilter(String custom, String type, String region,
                             String time, String language, int start, int pageSize);
}
