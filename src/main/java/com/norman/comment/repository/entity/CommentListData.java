package com.norman.comment.repository.entity;

import java.util.List;

/**
 * server返回的评论列表
 */

public class CommentListData {
    /** 错误码 */
    private String mErrno;
    /** 时间戳 */
    private Long mTimeStamp;
    /** 主题ID */
    private String mTopicId;
    /** 评论ID */
    private String mReplyId;
    /** 是否还有更多 */
    private boolean isOver;
    /** 下次请求的偏移量，需要先判断isOver */
    private int mStart;
    /** 分享url前缀 */
    private String mSharePrefix;
    /** 评论总数 */
    private int mTotalCount;
    /** 本次请求列表的logid */
    private String mLogId;
    /** 9.0新增字段，文案配置 */
    private Tips mTips;
    /** 9.3新增字段，精句标签,存在精句标签时，才下发此字段 */
    private List<FavTagModel> mFavTagList;
    /** 9.3新增字段，根据mFavTagList返回结果确定精句标签是否需要展示 */
    private boolean isFavtagShow;
    /** 评论列表 */
    private List<CommentModel> mCommentList;
    /** v10.2新增，彩蛋文案配置需求 */
    private CommentSurpriseInfo mCommentSurpriseInfo;
    /** 10.3 评论活动运营入口 */
    private CommentActiveData mCommentActiveData;
    /** 10.9 是否关闭评论. 0:打开评论； 1：关闭评论；3：评论自己可见；*/
    private int mIsShow;
    /** 11.0 评论框配置信息；*/
    private String mCommentConf;

    public String getCommentConf() {
        return mCommentConf;
    }

    public void setCommentConf(String commentConf) {
        mCommentConf = commentConf;
    }

    public int getIsShow() {
        return mIsShow;
    }

    public void setIsShow(int isShow) {
        mIsShow = isShow;
    }

    public String getTopicId() {
        return mTopicId;
    }

    public void setTopicId(String mTopicId) {
        this.mTopicId = mTopicId;
    }

    public String getReplyId() {
        return mReplyId;
    }

    public void setReplyId(String mReplyId) {
        this.mReplyId = mReplyId;
    }

    public boolean isOver() {
        return isOver;
    }

    public void setOver(boolean over) {
        isOver = over;
    }

    public int getStart() {
        return mStart;
    }

    public void setStart(int mStart) {
        this.mStart = mStart;
    }

    public int getTotalCount() {
        return mTotalCount;
    }

    public void setTotalCount(int mTotalCount) {
        this.mTotalCount = mTotalCount;
    }

    public String getLogId(){
        return mLogId;
    }

    public void setLogId(String logId){
        this.mLogId = logId;
    }

    public Tips getTips() {
        return mTips;
    }

    public void setTips(Tips mTips) {
        this.mTips = mTips;
    }

    public String getSharePrefix() {
        return mSharePrefix;
    }

    public void setSharePrefix(String sharePrefix) {
        this.mSharePrefix = sharePrefix;
    }

    public List<CommentModel> getCommentList() {
        return mCommentList;
    }

    public void setCommentList(List<CommentModel> mCommentList) {
        this.mCommentList = mCommentList;
    }

    public String getErrno() {
        return mErrno;
    }

    public void setErrno(String mErrno) {
        this.mErrno = mErrno;
    }

    public Long getTimeStamp() {
        return mTimeStamp;
    }

    public void setTimeStamp(Long mTimeStamp) {
        this.mTimeStamp = mTimeStamp;
    }

    public List<FavTagModel> getFavTagList() {
        return mFavTagList;
    }

    public void setFavTagList(List<FavTagModel> favTagList) {
        mFavTagList = favTagList;
    }

    public boolean isFavtagShow() {
        return isFavtagShow;
    }

    public void setFavtagShow(boolean favtagShow) {
        isFavtagShow = favtagShow;
    }

    public CommentSurpriseInfo getCommentSurpriseInfo() {
        return mCommentSurpriseInfo;
    }

    public void setCommentSurpriseInfo(CommentSurpriseInfo commentSurpriseInfo) {
        mCommentSurpriseInfo = commentSurpriseInfo;
    }

    public CommentActiveData getCommentActiveData() {
        return mCommentActiveData;
    }

    public void setCommmentActiveData(CommentActiveData commentActiveData) {
        this.mCommentActiveData = commentActiveData;
    }

    /**
     * 文案配置
     */
    public class Tips {
        /**
         * 文章和评论没有回复时出现此tip
         */
        public String mEmptyMsg;
        /**
         * 评论精句标签，n条评论时出现此tip，n由服务端控制
         */
        public String mEmptyMsgNum;
        /**
         * 评论底bar出现此tip
         */
        public String mToolbarPlaceholderList;
        /**
         * 点击评论框在空白评论框出现此tip
         */
        public String mCommentBoxPlaceholderList;
        /**
         * 进入回复详情页底bar显示此tip
         */
        public String mToolbarPlaceholderDetail;
    }

}

