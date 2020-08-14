package com.norman.news.service.impl;

import com.google.gson.Gson;
import com.norman.comment.dto.response.CommentEntity;
import com.norman.comment.temp.CommentMan;
import com.norman.comment.temp.CommentUtil;
import com.norman.comment.repository.entity.CommentListData;
import com.norman.comment.repository.entity.CommentModel;
import com.norman.news.ConstNews;
import com.norman.news.NewsUtil;
import com.norman.news.repository.entity.ImageEntity;
import com.norman.news.repository.entity.News;
import com.norman.news.dto.response.NewContentEntity;
import com.norman.news.dto.response.NewsListEntity;
import com.norman.news.repository.INewDao;
import com.norman.news.repository.INewsDao;
import com.norman.news.repository.entity.NewEntity;
import com.norman.news.repository.entity.NewsEntity;
import com.norman.news.service.NewsService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Primary // 解决 expected single matching bean but found 2: accountServiceImpl,accountService
@Service
public class NewsServiceImpl implements NewsService {
    @Resource
    private INewsDao mNewsDao;
    @Resource
    private INewDao mNewDao;

    @Override
    public List<NewsListEntity> queryByNum(int num,String channelId) {
        String[] split;
        int i = num;
        List<NewsEntity> all;
        if (StringUtils.isEmpty(channelId) || Integer.parseInt(channelId) <= 1) {
            all = mNewsDao.findByNum(i);
        } else {
            List<String> channelCodeList = new NewsUtil().getChannelCode();
            all = mNewsDao.findByChannel(i, channelCodeList.get(Integer.parseInt(channelId) - 1));
        }
        List<NewsListEntity> list = new ArrayList<>();
        NewsListEntity item;
        for (NewsEntity newsEntity : all) {
            News news = new Gson().fromJson(newsEntity.content, News.class);
            item = new NewsListEntity();
            item.itemId = newsEntity.item_id;
            item.channelCode = newsEntity.channelCode;
            item.channel = newsEntity.channel;
            item.title = news.title;
            if (news.user_info != null) {
                item.author = news.user_info.name;
                split = news.user_info.avatar_url.split("/");
                item.avatarUrl = ConstNews.NEWS_IMAGE_PATH + split[split.length - 1];
                item.authorDescription = news.user_info.description;
                item.authorVerified = news.user_info.verified_content;
            }
            item.commentCount = news.comment_count;
            item.behotTime = news.behot_time;
            item.gallaryImageCount = news.gallary_image_count;
            item.url = ConstNews.NEWS_HTML_PATH + item.itemId + ".html";


            // 处理图片与布局
            ArrayList<String> images = new ArrayList<>();
            // 纯文字新闻
            if (!news.has_image) {
                item.layoutType = ConstNews.TYPE_TEXT_NEWS;
            }
            // 图片列表为空，则是右侧图片
            if (news.has_image && (news.image_list == null || news.image_list.size() == 0)) {
                item.layoutType = ConstNews.TYPE_RIGHT_PIC;
                split = news.middle_image.url.split("/");
                images.add(ConstNews.NEWS_IMAGE_PATH + split[split.length - 1]);
            }
            // 三图
            if (news.has_image &&
                    !(news.image_list == null || news.image_list.size() == 0)
                    && news.gallary_image_count == 3) {
                item.layoutType = ConstNews.TYPE_THREE_PIC;
                for (ImageEntity imageEntity : news.image_list) {
                    split = imageEntity.url.split("/");
                    images.add(ConstNews.NEWS_IMAGE_PATH + split[split.length - 1]);
                }
            }
            // 中间大图，右下角显示图数
            if (news.has_image &&
                    !(news.image_list == null || news.image_list.size() == 0) &&
                    news.gallary_image_count != 3) {
                item.layoutType = ConstNews.TYPE_CENTER_PIC;
                for (ImageEntity imageEntity : news.image_list) {
                    split = imageEntity.url.split("/");
                    images.add(ConstNews.NEWS_IMAGE_PATH + split[split.length - 1]);
                }
            }
            item.imageUrlList = images;

            // 详情相关信息
            NewEntity newEntity = mNewDao.findByItemId(newsEntity.item_id);
            NewContentEntity newContentEntity = new Gson().fromJson(newEntity.content, NewContentEntity.class);
            item.content = newContentEntity.getContent();

            list.add(item);
        }
        return list;
    }

    @Override
    public NewContentEntity queryByItemId(String item_id) {
        NewEntity newEntity = mNewDao.findByItemId(item_id);

        NewContentEntity newContentEntity = new Gson().fromJson(newEntity.content, NewContentEntity.class);

        return newContentEntity;
    }

    @Override
    public List<CommentEntity> queryCommentByItemId(String item_id, int start, int num) {
        long fileName = Long.parseLong(item_id) % 2 + 1;
        System.out.println(item_id + "++++++++" + fileName);

        CommentMan commentMan = new CommentMan();
        CommentListData commentListData = commentMan.getCommentListData(String.valueOf(fileName));
        List<CommentModel> commentList = commentListData.getCommentList();
        if ((start + num) > (commentList.size() - 1)) {
            num = commentList.size() - 1 - start;
        }
        List<CommentModel> commentModels = commentList.subList(start, start + num);

        ArrayList<CommentEntity> list = new ArrayList<>();
        for (int i = 0; i < commentModels.size(); i++) {
            CommentModel commentModel = commentModels.get(i);
            CommentEntity entity = CommentUtil.conversion(commentModel);
            list.add(entity);
        }
        return list;
    }
}
