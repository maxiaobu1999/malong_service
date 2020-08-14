package com.norman.mini.service;

import com.norman.mini.dto.response.MiniEntity;

import java.util.List;

public interface MiniService {
    /** 获取n条视频数据 */
    List<MiniEntity>  queryByNum(String num);
}
