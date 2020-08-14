package com.norman.comment.repository.entity;

import org.json.JSONObject;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * server返回的单条评论详细数据
 */

public class CommentModel {
    /**
     * 评论类型——ugc转发评论
     */
    public static final String COMMENT_TYPE_UGC_FORWARD = "2";
    /**
     * 评论类型——ugc转发评论
     */
    public static final String COMMENT_TYPE_LOCAL_PIC = "3";
    /**
     * 评论类型——ugc转发评论
     */
    public static final String COMMENT_TYPE_GIF = "4";
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
     * portrait
     */
    private String mPortrait;
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
     * 用户uk
     */
    private String mUk;
    /**
     * 用户头像地址
     * https://gss0.bdstatic.com/7Ls0a8Sm1A5BphGlnYG/sys/portrait/item/5d793135313332343331383233530e.jpg
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
    private List<CommentModel> mReplyList;
    /**
     * 是否是百家号的作者
     * tips：只有是百家号作者才会下发此字段。并且如果是，需要在用户名后面添加"作者"标签
     */
    private boolean isBjhAuthor;
    /**
     * 百家号作者名
     * tips：只有是百家号作者才会下发此字段。
     */
    private String mBjhUname;
    /**
     * 被回复者是否是百家号作者
     * tips：只有被回复者是否是百家号作者才会下发此字段。
     */
    private boolean isReplyedBjhAuthor;
    /**
     * 百家号作者名
     * tips：只有被回复者是否是百家号作者才会下发此字段。
     */
    private String mReplyedBjhUname;
    /**
     * 明星公共数据
     */
    private Star mStar;
    /**
     * 是否被赞过: 0/1
     */
    private String isUped;
    /**
     * 神评schema，【10.2新增字段】
     */
    private String schemaGod;
    /**
     * 是否神评标签，【10.2新增字段】
     */
    private String isGod;
    /**
     * 获取回复列表，server下发的字段
     */
    private String mParentId;
    /**
     * 发表评论的用户是否是明星
     */
    private boolean isStar;
    /**
     * 是否回复了明星
     */
    private boolean isReplyedToStar;

    /**
     * 该条数据是否被展示过
     */
    private boolean isBind;
    /**
     * 评论分享URL
     */
    private String mShareUrl;

    /**
     * 评论发布者的 V标类型
     * 0 无认证; 1 金V; 2蓝V; 3黄V; 10 认证
     */
    private String mVType;
    /**
     * V标 vtype
     * 0 无认证; 1 金V; 2蓝V; 3黄V; 10 认证
     */
    public final String mVTypeNone = "0";
    public final String mVTypeGold = "1";
    public final String mVTypeBlue = "2";
    public final String mVTypeYellow = "3";
    public final String mVTypeAuth = "10";
    /**
     * 被回复者的 V标类型
     * 0 无认证; 1 金V; 2蓝V; 3黄V; 10 认证
     */
    private String mReplyedToVType;

    /**
     * 10.1新增字段 二级评论同步至原文数据结构
     */
    private ReplyToOriginComment mReplyToOriginComment;
    /**
     * 10.1新增字段 在列表页中新插入的那条由二级评论转换构造的一级评论（所谓的评论至原文）
     */
    private CommentModel mSyncReplyComment;
    /**
     * 10.1新增字段 当条评论的作者信息
     */
    private CommentUserInfo mCommentUserInfo;
    /**
     * 10.1新增字段 查看全部 记录当前展开状态
     */
    private boolean mViewAllTextState = false;
    /**
     * 10.1新增字段 查看全部 记录原始评论内容超越最大行与否的处理状态 -1：未处理 0：没超过 1：超过
     */
    private int mExceedMaxLineState = -1;
    /**
     * 10.5新增字段 转发评论
     */
    private ForwardCommentInfo mForwardCommentInfo;
    /**
     * 10.5新增字段 评论类型 2：ugc转发评论
     */
    private String mCommentType;
    /**
     * 10.5 关注需要字段
     */
    private String mFollowType;
    /**
     * 10.5 关注需要字段
     */
    private String mFollowThirdId;
    /**
     * 10.9 作者是否点过赞， 0：不；1：是
     */
    private String mAuthorUped;
    /**
     * 10.9 是否是楼主，0：不是；1：是。服务端已处理是否是作者的判断，既是作者，又是楼主，会返回0
     */
    private String mIsLZ;
    /**
     * 10.10 评论来源，1:普通评论；2：智能评论
     */
    private String mCommentFrom;
    /**
     * 11.0 图片信息
     */
    private CommentImagesData mImagesData;
    /**
     * 11.0 是否显示图片 默认是false，不显示图片。
     * 显示图片和显示查看图片富文本是互斥的，只会出现一种.
     * 列表页中一级评论（不是同步到一级的）显示图片。
     * 详情页中主评论、热门评论、普通二级评论（是回复主评论的）显示图片。
     */
    private boolean mIsShowImage;

    public boolean isShowImage() {
        return mIsShowImage;
    }

    public void setShowImage(boolean showImage) {
        mIsShowImage = showImage;
    }

    public CommentImagesData getImagesData() {
        return mImagesData;
    }

    public void setImagesData(CommentImagesData images) {
        this.mImagesData = images;
    }

    /**
     * 获取isSelf值
     *
     * @return mIsSelf 单条评论本人可见
     */
    public String getIsSelf() {
        return mIsSelf;
    }

    /**
     * 设置isSelf值
     *
     * @param isSelf 单条评论本人可见
     */
    public void setIsSelf(String isSelf) {
        mIsSelf = isSelf;
    }

    /**
     * 10.9 是否对自己可见
     */
    private String mIsSelf;
    /**
     * 10.10 评论家icon
     */
    private String mCommentorIcon;
    /**
     * 10.10 评论家申请页schema
     */
    private String mCommentorSchema;

    public String getCommentIconUrl() {
        return mCommentorIcon;
    }

    public void setCommentorIcon(String commentorIcon) {
        mCommentorIcon = commentorIcon;
    }

    public String getCommentorSchema() {
        return mCommentorSchema;
    }

    public void setCommentorSchema(String commentorSchema) {
        mCommentorSchema = commentorSchema;
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

    public String getUName() {
        return mUName;
    }

    public void setUName(String mUName) {
        this.mUName = mUName;
    }

    public String getPortrait() {
        return mPortrait;
    }

    public void setPortrait(String mPortrait) {
        this.mPortrait = mPortrait;
    }

    public Long getCreateTime() {
        return mCreateTime;
    }

    public void setCreateTime(Long mCreateTime) {
        this.mCreateTime = mCreateTime;
    }

    public int getLikeCount() {
        return mLikeCount;
    }

    public void setLikeCount(int mLikeCount) {
        this.mLikeCount = mLikeCount;
    }

    public int getDisLikeCount() {
        return mDisLikeCount;
    }

    public void setDisLikeCount(int mDisLikeCount) {
        this.mDisLikeCount = mDisLikeCount;
    }

    public String getUk() {
        return mUk;
    }

    public void setUk(String mUk) {
        this.mUk = mUk;
    }

    public String getAvatar() {
        return mAvatar;
    }

    public void setAvatar(String mAvatar) {
        this.mAvatar = mAvatar;
    }

    public String getReplyToUname() {
        return mReplyToUname;
    }

    public void setReplyToUname(String mReplyToUname) {
        this.mReplyToUname = mReplyToUname;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String mContent) {
        this.mContent = mContent;
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

    public void setReplyCount(int mReplyCount) {
        this.mReplyCount = mReplyCount;
    }

    public String getVType() {
        return mVType;
    }

    public void setVType(String mVType) {
        this.mVType = mVType;
    }

    public String getReplyedToVType() {
        return mReplyedToVType;
    }

    public void setReplyedToVType(String mReplyedToVType) {
        this.mReplyedToVType = mReplyedToVType;
    }

    public List<CommentModel> getReplyList() {
        if (mReplyList == null) {
            this.mReplyList = new ArrayList<CommentModel>();
        }
        return mReplyList;
    }

    public void setReplyList(List<CommentModel> mReplyList) {
        this.mReplyList = mReplyList;
    }

    public String getBjhUname() {
        return mBjhUname;
    }

    public void setBjhUname(String mBjhUname) {
        this.mBjhUname = mBjhUname;
    }

    public boolean isBjhAuthor() {
        return isBjhAuthor;
    }

    public void setBjhAuthor(boolean bjhAuthor) {
        isBjhAuthor = bjhAuthor;
    }

    public boolean isReplyedBjhAuthor() {
        return isReplyedBjhAuthor;
    }

    public void setReplyedBjhAuthor(boolean replyedBjhAuthor) {
        isReplyedBjhAuthor = replyedBjhAuthor;
    }

    public String getReplyedBjhUname() {
        return mReplyedBjhUname;
    }

    public void setReplyedBjhUname(String mReplyedBjhUname) {
        this.mReplyedBjhUname = mReplyedBjhUname;
    }

    public Star getStar() {
        return mStar;
    }

    public void setStar(Star mStar) {
        this.mStar = mStar;
    }

    public String isUped() {
        return isUped;
    }

    public void setIsUped(String mIsUped) {
        this.isUped = mIsUped;
    }

    public String getSchemaGod() {
        return schemaGod;
    }

    public void setSchemaGod(String schemaGod) {
        this.schemaGod = schemaGod;
    }

    public String isGod() {
        return isGod;
    }

    public void setIsGod(String isGod) {
        this.isGod = isGod;
    }

    public String getParentId() {
        return mParentId;
    }

    public void setParentId(String mParentId) {
        this.mParentId = mParentId;
    }

    public boolean isBind() {
        return isBind;
    }

    public void setBind(boolean bind) {
        isBind = bind;
    }

    public ReplyToOriginComment getReplyToOriginComment() {
        return mReplyToOriginComment;
    }

    public void setReplyToOriginComment(ReplyToOriginComment replyToOriginComment) {
        mReplyToOriginComment = replyToOriginComment;
    }

    public CommentUserInfo getCommentUserInfo() {
        return mCommentUserInfo;
    }

    public void setCommentUserInfo(CommentUserInfo commentUserInfo) {
        mCommentUserInfo = commentUserInfo;
    }

    public CommentModel getSyncReplyComment() {
        return mSyncReplyComment;
    }

    public void setSyncReplyComment(CommentModel syncReplyComment) {
        mSyncReplyComment = syncReplyComment;
    }

    public boolean getViewAllTextState() {
        return mViewAllTextState;
    }

    public void setViewAllTextState(boolean viewAllTextState) {
        mViewAllTextState = viewAllTextState;
    }

    public int getExceedMaxLineState() {
        return mExceedMaxLineState;
    }

    public void setExceedMaxLineState(int exceedMaxLineState) {
        mExceedMaxLineState = exceedMaxLineState;
    }

    public ForwardCommentInfo getForwardCommentInfo() {
        return mForwardCommentInfo;
    }

    public void setForwardCommentInfo(ForwardCommentInfo forwardCommentInfo) {
        mForwardCommentInfo = forwardCommentInfo;
    }

    public String getCommentType() {
        return mCommentType;
    }

    public void setCommentType(String commentType) {
        mCommentType = commentType;
    }

    public void setFollowType(String followType) {
        this.mFollowType = followType;
    }

    public String getFollowType() {
        return mFollowType;
    }

    public void setFollowThirdId(String followThirdId) {
        this.mFollowThirdId = followThirdId;
    }

    public String getFollowThirdId() {
        return mFollowThirdId;
    }

    public String getAuthorUped() {
        return mAuthorUped;
    }

    public void setAuthorUped(String mAuthorUped) {
        this.mAuthorUped = mAuthorUped;
    }

    public String getIsLZ() {
        return mIsLZ;
    }

    public void setIsLZ(String isLZ) {
        this.mIsLZ = isLZ;
    }

    public String getCommentFrom() {
        return mCommentFrom;
    }

    public void setCommentFrom(String commentFrom) {
        this.mCommentFrom = commentFrom;
    }

    /**
     * 10.1二级评论同步至原文 解析sync_text_comment字段
     *
     * @param jsonObject
     * @return
     */
    public static CommentModel parseForSyncReplyComment(JSONObject jsonObject) {
        if (jsonObject == null) {
            return null;
        }

        if (!jsonObject.has("sync_text_comment")) {
            return null;
        }

        JSONObject syncComment = jsonObject.optJSONObject("sync_text_comment");
        if (syncComment == null) {
            return null;
        }

        CommentModel commentModel = new CommentModel();
        commentModel.mTopicId = syncComment.optString("comment_id", "");
        ;
        commentModel.mContent = syncComment.optString("content", "");
        commentModel.mReplyId = syncComment.optString("reply_id", "");
        commentModel.mParentId = syncComment.optString("parent_id", "");
        commentModel.mCommentUserInfo = CommentUserInfo.parse(syncComment);
        commentModel.mReplyToOriginComment = ReplyToOriginComment.parse(syncComment);
        commentModel.setShareUrl(jsonObject.optString("share_prefix", ""));
        // 11.0 同步至原文图片信息解析
        JSONObject imagesObject = syncComment.optJSONObject("image_list");
        CommentImagesData imagesData = CommentImagesData.parseImagesData(imagesObject);
        commentModel.setImagesData(imagesData);
        // 11.0 解析富文本信息
        commentModel.mForwardCommentInfo = ForwardCommentInfo.parse(syncComment);

        // 下面同步填充剩余字段（为了向前兼容）
        commentModel.setCreateTime(System.currentTimeMillis());
        if (commentModel.mCommentUserInfo != null) {
            commentModel.setBjhAuthor(commentModel.mCommentUserInfo.mIsBjhAuthor);
            commentModel.setAvatar(commentModel.mCommentUserInfo.mAvatar);
            commentModel.setUk(commentModel.mCommentUserInfo.mUk);
            commentModel.setVType(commentModel.mCommentUserInfo.mVtype);
            commentModel.setUName(commentModel.mCommentUserInfo.mUname);
            if (commentModel.mCommentUserInfo.mIsBjhAuthor) {
                commentModel.setBjhUname(commentModel.getUName());
            } else {
                commentModel.setBjhUname("");
            }

            if (commentModel.mReplyToOriginComment != null
                    && commentModel.mReplyToOriginComment.mCommentUserInfo != null) {
                commentModel.setReplyToUname(
                        StringUtils.isEmpty(commentModel.mReplyToOriginComment.mCommentUserInfo.mUname) ? "" :
                                commentModel.mReplyToOriginComment.mCommentUserInfo.mUname);
                commentModel.setReplyedToVType(
                        StringUtils.isEmpty(commentModel.mReplyToOriginComment.mCommentUserInfo.mVtype) ? "" :
                                commentModel.mReplyToOriginComment.mCommentUserInfo.mVtype);
                if (commentModel.mReplyToOriginComment.mCommentUserInfo.mIsBjhAuthor) {
                    commentModel.setReplyedBjhAuthor(true);
                    commentModel.setReplyedBjhUname(commentModel.getReplyToUname());
                } else {
                    commentModel.setReplyedBjhAuthor(false);
                    commentModel.setReplyedBjhUname("");
                }
            } else {
                commentModel.setReplyToUname("");
                commentModel.setReplyedToVType("");
                commentModel.setReplyedBjhAuthor(false);
                commentModel.setReplyedBjhUname("");
            }
        }

        return commentModel;
    }

    /**
     * 10.0评论点赞数字的优化显示,超过一万四舍五入表示
     */
    public String displayLikeCount(String unit) {
        if (this.mLikeCount > 9999) {
            int num = (int) (this.mLikeCount / 1000.0 + 0.5);
            return String.valueOf(num / 10.0 + unit);
        } else {
            return String.valueOf(this.mLikeCount);
        }
    }

    /**
     * server下发的分享url前缀;
     * 这里需要拼接topicId和replyId
     *
     * @return
     */
    public String getShareUrl() {
        return mShareUrl + "&thread_id=" + mTopicId + "&reply_id=" + mReplyId;
    }

    public void setShareUrl(String shareUrl) {
        this.mShareUrl = shareUrl;
    }

    /**
     * 判断user是否含有V标
     *
     * @return
     */
    public boolean isVtype(CommentModel commentModel) {
//        if (commentModel != null && (StringUtils.equals(commentModel.getVType(), mVTypeGold)
//                || StringUtils.equals(commentModel.getVType(), mVTypeBlue)
//                || StringUtils.equals(commentModel.getVType(), mVTypeYellow)
//                || StringUtils.equals(commentModel.getVType(), mVTypeAuth))) {
//            isStar = true;
//        } else {
//            isStar = false;
//        }

        return isStar;
    }

    /**
     * 判断replyeduser是否含有V标
     *
     * @return
     */
    public boolean isReplyedVtype(CommentModel commentModel) {
//        if (commentModel != null && (StringUtils.equals(commentModel.getReplyedToVType(), mVTypeGold)
//                || StringUtils.equals(commentModel.getReplyedToVType(), mVTypeBlue)
//                || StringUtils.equals(commentModel.getReplyedToVType(), mVTypeYellow)
//                || StringUtils.equals(commentModel.getReplyedToVType(), mVTypeAuth))) {
//            isReplyedToStar = true;
//        } else {
//            isReplyedToStar = false;
//        }

        return isReplyedToStar;
    }

    /**
     * 如果是 1.明星发表的评论 / 2.回复明星的评论，服务器会下发此字段。
     */
    public class Star {
        /**
         * 明星发表评论的字段
         */
        // 明星类型
        public String mType;
        // 明星用户名
        public String mUname;
        // 明星ID
        public String mmRId;
        // 明星头像
        public String mAvatar;

        /**
         * 回复明星评论的字段
         */
        // 被回复明星类型
        public String mReplyedType;
        // 被回复明星的姓名
        public String mReplyedUname;
        // 被回复明星的头像
        public String mRepyledAvatar;
    }
}