package com.norman.news.service;

import com.norman.comment.dto.response.CommentEntity;
import com.norman.news.dto.response.NewContentEntity;
import com.norman.news.dto.response.NewsListEntity;

import java.util.List;

public interface NewsService {


    /**
     * 随机获取n条数据
     * @param num 几条
     * @param channelId 频道号
     */
    List<NewsListEntity> queryByNum(int num,String channelId);
    /** 根据item_id获取新闻详情 */
    NewContentEntity queryByItemId(String item_id);

    /**
     * 根据item_id获取新闻的评论
     */
    List<CommentEntity> queryCommentByItemId(String item_id, int start, int num);

}
