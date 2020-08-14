package com.norman.tik.service;

import com.norman.tik.dto.response.TikEntity;

import java.util.List;

public interface TikService {


    /**
     * 随机获取n条数据
     * @param num 几条
     */
    List<TikEntity> queryByNum(int num);

}
