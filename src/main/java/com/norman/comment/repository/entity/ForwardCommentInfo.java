package com.norman.comment.repository.entity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * 转发评论（起采用的描述转发评论的结构）
 */

public class ForwardCommentInfo {
    /** TAG */
    private static final String TAG = "ForwardCommentInfo";

    /** 描述集 */
    public List<Description> mDescriptionList;

    public static ForwardCommentInfo parse(JSONObject jsonObject) {
        if (jsonObject == null) {
            return null;
        }

        if (!jsonObject.has("content_rich")) {
            return null;
        }

        JSONArray descriptionArr = jsonObject.optJSONArray("content_rich");
        if (descriptionArr == null) {
            return null;
        }

        ForwardCommentInfo forwardCommentInfo = new ForwardCommentInfo();
        Description description = null;
        for (int i = 0; i < descriptionArr.length(); i++) {
            if (forwardCommentInfo.mDescriptionList == null) {
                forwardCommentInfo.mDescriptionList = new ArrayList<>();
            }
            try {
                description = Description.parse(descriptionArr.getJSONObject(i));
                if (description != null) {
                    forwardCommentInfo.mDescriptionList.add(description);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return forwardCommentInfo;
    }

    @Override
    public String toString() {
        return "ForwardCommentInfo{"
                + "mDescriptionList=" + mDescriptionList
                + '}';
    }

    public static class Description {
        /** 开始位置（utf8编码的字符，起始位为0）*/
        public String mStart;
        /** 字符长度 */
        public String mLength;
        /** 属性类型 1用户|2话题|3链接|4图片 */
        public String mType;
        /** 属性值 */
        public Attribute mAttribute;

        public static Description parse(JSONObject jsonObject) {
            if (jsonObject == null) {
                return null;
            }

            Description description = new Description();
            description.mStart = jsonObject.optString("start", "");
            description.mLength = jsonObject.optString("length", "");
            description.mType = jsonObject.optString("type", "");

            if (!jsonObject.has("attr")) {
                return null;
            }
            JSONObject attrObj = jsonObject.optJSONObject("attr");
            if (attrObj == null) {
                return null;
            }
            description.mAttribute = Attribute.parse(attrObj);

            return description;
        }

        @Override
        public String toString() {
            return "Description{"
                    + "mStart='" + mStart + '\''
                    + ", mLength='" + mLength + '\''
                    + ", mType='" + mType + '\''
                    + ", mAttribute=" + mAttribute
                    + '}';
        }
    }

    public static class Attribute {
        /** uk */
        public String mUk;
        /** 框外协议 */
        public String mScheme;
        /** 框内协议 */
        public String mUrl;
        /** icon类型 1链接|2视频|3投票 */
        public String mIconType;
        /** 11.0 预览图片文本 */
        public String text;
        /** 11.0 预览图片URL */
        public String imageURL;

        public static Attribute parse(JSONObject jsonObject) {
            if (jsonObject == null) {
                return null;
            }

            Attribute attribute = new Attribute();
            attribute.mUk = jsonObject.optString("uk", "");
            attribute.mScheme = jsonObject.optString("scheme", "");
            attribute.mUrl = jsonObject.optString("link", "");
            attribute.mIconType = jsonObject.optString("icon", "");
            attribute.text = jsonObject.optString("text", "");
            attribute.imageURL = jsonObject.optString("url", "");
            return attribute;
        }

        @Override
        public String toString() {
            return "Attribute{"
                    + "mUk='" + mUk + '\''
                    + ", mScheme='" + mScheme + '\''
                    + ", mUrl='" + mUrl + '\''
                    + ", mIconType='" + mIconType + '\''
                    + '}';
        }
    }
}