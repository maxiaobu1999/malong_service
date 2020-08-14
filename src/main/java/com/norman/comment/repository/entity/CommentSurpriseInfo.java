package com.norman.comment.repository.entity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 10.2 新增彩蛋文案配置需求， 使用gcp配置平台
 */

public class CommentSurpriseInfo {
    /** 文字文案 上滑彩蛋需要展示的文字 3-5句 */
    public List<String> mMsgList;

    public static CommentSurpriseInfo parse(JSONObject jsonObject) {
        if (jsonObject == null) {
            return null;
        }

        if (!jsonObject.has("color_bar")) {
            return null;
        }

        JSONObject commentSurpriseObj = jsonObject.optJSONObject("color_bar");
        if (commentSurpriseObj == null) {
            return null;
        }

        CommentSurpriseInfo commentSurpriseInfo = new CommentSurpriseInfo();
        JSONArray msgJSONArray = commentSurpriseObj.optJSONArray("message");
        if (msgJSONArray != null && msgJSONArray.length() > 0) {
            try {
                for (int i = 0; i < msgJSONArray.length(); i++) {
                    if (commentSurpriseInfo.mMsgList == null) {
                        commentSurpriseInfo.mMsgList = new ArrayList<>();
                    }

                    JSONObject tmpObj = msgJSONArray.getJSONObject(i);
                    if (tmpObj != null && tmpObj.has("text")
                            && !StringUtils.isEmpty(tmpObj.optString("text", ""))) {
                        commentSurpriseInfo.mMsgList.add(tmpObj.optString("text"));
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return commentSurpriseInfo;
    }

    @Override
    public String toString() {
        return "CommentSurpriseInfo{"
                + "mMsgList=" + mMsgList
                + '}';
    }
}

