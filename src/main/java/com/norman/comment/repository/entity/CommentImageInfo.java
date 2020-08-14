package com.norman.comment.repository.entity;

import org.json.JSONObject;

/**
 * 保持图片信息：url和图片宽高。
 */
public class CommentImageInfo {
    /** 11.0 图片URL*/
    private String mURL;
    /** 11.0 图片宽*/
    private int mWidth;
    /** 11.0 图片高*/
    private int mHeight;

    public String getURL() {
        return mURL;
    }

    public void setURL(String url) {
        this.mURL = url;
    }

    public int getWidth() {
        return mWidth;
    }

    public void setWidth(int width) {
        this.mWidth = width;
    }

    public int getHeight() {
        return mHeight;
    }

    public void setHeight(int height) {
        this.mHeight = height;
    }

    /**
     * 解析图片信息
     * @param object 图片json对象
     * @return 图片信息ImageInfo对象
     */
    public static CommentImageInfo parseImageInfo(JSONObject object) {
        CommentImageInfo info = null;
        if (object != null) {
            info = new CommentImageInfo();
            info.setURL(object.optString("url"));
            info.setWidth(object.optInt("width"));
            info.setHeight(object.optInt("height"));
        }
        return  info;
    }
}
