package com.norman.comment.repository.entity;
/**
 * server返回的单条评论详细数据
 *
 */

public class FavTagModel {
    /**
     * 精句标签id
     */
    public String mId;
    /**
     * 精句标签内容
     */
    public String mContent;

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }
}
