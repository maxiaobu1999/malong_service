package com.norman.comment.repository.entity;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 新增数据结构（二级评论同步至原文）
 */

public class ReplyToOriginComment {
    /** 被回复的评论原始 ReplyId */
    public String mReplyId;
    /** 被回复的评论原始 TopicId */
    public String mTopicId;
    /** 被回复的评论原始 ParentId */
    public String mParentId;
    /** 被回复的评论原始 CommentId */
    public String mCommentId;
    /** 被回复的评论原始 内容 */
    public String mContent;
    /** 被回复的评论原始 用户信息 */
    public CommentUserInfo mCommentUserInfo;
    /** 被回复的评论原始 转发评论（10.5新增） */
    public ForwardCommentInfo mForwardCommentInfo;

    public static ReplyToOriginComment parse(JSONObject jsonObject) {
        if (jsonObject == null) {
            return null;
        }

        if (!jsonObject.has("reply_to_comment")) {
            return null;
        }

        JSONArray replyToCommmentArr = jsonObject.optJSONArray("reply_to_comment");
        if (replyToCommmentArr == null || replyToCommmentArr.length() <= 0) {
            return null;
        }

        ReplyToOriginComment originalComment = new ReplyToOriginComment();
        try {
            JSONObject replyToCommment = replyToCommmentArr.getJSONObject(0);
            originalComment.mTopicId = replyToCommment.optString("topic_id", "");
            originalComment.mReplyId = replyToCommment.optString("reply_id", "");
            originalComment.mContent = replyToCommment.optString("content", "");
            originalComment.mParentId = replyToCommment.optString("parent_id", "");
            originalComment.mCommentId = replyToCommment.optString("comment_id", "");
            originalComment.mCommentUserInfo = CommentUserInfo.parse(replyToCommment);
            originalComment.mForwardCommentInfo = ForwardCommentInfo.parse(replyToCommment);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return originalComment;
    }

    @Override
    public String toString() {
        return "ReplyToOriginComment{" +
                "mReplyId='" + mReplyId + '\''
                + ", mTopicId='" + mTopicId + '\''
                + ", mParentId='" + mParentId + '\''
                + ", mCommentId='" + mCommentId + '\''
                + ", mContent='" + mContent + '\''
                + ", mCommentUserInfo=" + mCommentUserInfo
                + ", mForwardCommentInfo=" + mForwardCommentInfo
                + '}';
    }
}