package com.norman.comment.repository.entity;

import org.json.JSONObject;

/**
 * 评论用户信息（10.1起采用的新描述用户信息的结构）
 */

public class CommentUserInfo {
    /** 被回复的评论原始作者 用户名 */
    public String mUname;
    /** 被回复的评论原始作者 Uk */
    public String mUk;
    /** 被回复的评论原始作者 V标类型 0 无认证; 1 金V; 2蓝V; 3黄V; 10 认证 */
    public String mVtype;
    /** 被回复的评论原始作者 true:是百家号作者， false:不是百家号作者 */
    public boolean mIsBjhAuthor;
    /** 被回复的评论原始作者 头像 */
    public String mAvatar;

    public static CommentUserInfo parse(JSONObject jsonObject) {
        if (jsonObject == null) {
            return null;
        }

        if (!jsonObject.has("user")) {
            return null;
        }

        JSONObject userInfoObj = jsonObject.optJSONObject("user");
        if (userInfoObj == null) {
            return null;
        }

        CommentUserInfo user = new CommentUserInfo();
        user.mUname = userInfoObj.optString("uname", "");
        user.mUk = userInfoObj.optString("uk", "");
        user.mVtype = userInfoObj.optString("vtype", "");
        user.mIsBjhAuthor = userInfoObj.optBoolean("is_bjh_author", false);
        user.mAvatar = userInfoObj.optString("avatar", "");

        return user;
    }

    @Override
    public String toString() {
        return "CommentUserInfo{"
                + "mUname='" + mUname + '\''
                + ", mUk='" + mUk + '\''
                + ", mVtype='" + mVtype + '\''
                + ", mIsBjhAuthor=" + mIsBjhAuthor
                + ", mAvatar='" + mAvatar + '\''
                + '}';
    }
}
