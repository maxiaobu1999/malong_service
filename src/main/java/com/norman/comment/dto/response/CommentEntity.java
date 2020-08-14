package com.norman.comment.dto.response;

import java.util.List;

public class CommentEntity {
    /**
     * 主题ID
     */
    private String mTopicId;
    /**
     * 评论ID
     */
    private String mReplyId;
    /**
     * 发表评论的用户名
     */
    private String mUName;
    /**
     * 评论发表时间: "1494375851"
     */
    private Long mCreateTime;
    /**
     * 点赞数
     */
    private int mLikeCount;
    /**
     * 被踩数
     */
    private int mDisLikeCount;
    /**
     * 用户头像地址
     */
    private String mAvatar;
    /**
     * 被回复者的uname
     */
    private String mReplyToUname;
    /**
     * 评论内容
     */
    private String mContent;
    /**
     * 是否是文章的作者
     */
    private boolean isAuthor;
    /**
     * 被回复数量
     */
    private int mReplyCount;
    /**
     * 此条评论外露的回复评论
     */
    private List<CommentEntity> mReplyList;
    /**
     * 是否被赞过: 0/1
     */
    private String isUped;
    /**
     * 评论发布者的 V标类型
     * 0 无认证; 1 金V; 2蓝V; 3黄V; 10 认证
     */
    private String mVType;
    /**
     * 被回复者的 V标类型
     * 0 无认证; 1 金V; 2蓝V; 3黄V; 10 认证
     */
    private String mReplyedToVType;

    public String getTopicId() {
        return mTopicId;
    }

    public void setTopicId(String topicId) {
        mTopicId = topicId;
    }

    public String getReplyId() {
        return mReplyId;
    }

    public void setReplyId(String replyId) {
        mReplyId = replyId;
    }

    public String getUName() {
        return mUName;
    }

    public void setUName(String UName) {
        mUName = UName;
    }

    public Long getCreateTime() {
        return mCreateTime;
    }

    public void setCreateTime(Long createTime) {
        mCreateTime = createTime;
    }

    public int getLikeCount() {
        return mLikeCount;
    }

    public void setLikeCount(int likeCount) {
        mLikeCount = likeCount;
    }

    public int getDisLikeCount() {
        return mDisLikeCount;
    }

    public void setDisLikeCount(int disLikeCount) {
        mDisLikeCount = disLikeCount;
    }

    public String getAvatar() {
        return mAvatar;
    }

    public void setAvatar(String avatar) {
        mAvatar = avatar;
    }

    public String getReplyToUname() {
        return mReplyToUname;
    }

    public void setReplyToUname(String replyToUname) {
        mReplyToUname = replyToUname;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public boolean isAuthor() {
        return isAuthor;
    }

    public void setAuthor(boolean author) {
        isAuthor = author;
    }

    public int getReplyCount() {
        return mReplyCount;
    }

    public void setReplyCount(int replyCount) {
        mReplyCount = replyCount;
    }

    public List<CommentEntity> getReplyList() {
        return mReplyList;
    }

    public void setReplyList(List<CommentEntity> replyList) {
        mReplyList = replyList;
    }

    public String getIsUped() {
        return isUped;
    }

    public void setIsUped(String isUped) {
        this.isUped = isUped;
    }

    public String getVType() {
        return mVType;
    }

    public void setVType(String VType) {
        mVType = VType;
    }

    public String getReplyedToVType() {
        return mReplyedToVType;
    }

    public void setReplyedToVType(String replyedToVType) {
        mReplyedToVType = replyedToVType;
    }
}
