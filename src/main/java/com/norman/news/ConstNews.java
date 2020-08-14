package com.norman.news;

public class ConstNews {
    // 新闻图片路径
    public static final String NEWS_IMAGE_PATH = "/static/news_image/";
    // 新闻html路径
    public static final String NEWS_HTML_PATH = "/static/news_html/";

    /** 纯文字布局(文章、广告) */
    public static final int TYPE_TEXT_NEWS = 0;
    /** 居中大图布局(1.单图文章；2.单图广告；3.视频，中间显示播放图标，右侧显示时长) */
    public static final int TYPE_CENTER_PIC = 1;
    /** 右侧小图布局(1.小图新闻；2.视频类型，右下角显示视频时长) */
    public static final int TYPE_RIGHT_PIC = 2;
    /** 三张图片布局(文章、广告) */
    public static final int TYPE_THREE_PIC = 3;
}
