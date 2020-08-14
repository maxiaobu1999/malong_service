package com.norman.comment.repository.entity;

import org.json.JSONObject;

/**
 * 评论中，存储缩略图和原图信息。
 */
public class CommentImagesData {
    /** 11.0 缩略图信息，静态图时使用 */
    private CommentImageInfo mThumb;
    /** 11.0 原图信息 */
    private CommentImageInfo mLarge;
    /** 11.0 图片类型 0：普通图片；1：gif；2：长图 */
    private String mType;
    private static final String TYPE_COMMON_PIC = "0";
    private static final String TYPE_GIF = "1";
    private static final String TYPE_LONG_PIC = "2";

    public CommentImageInfo getThumb() {
        return mThumb;
    }

    public void setThumb(CommentImageInfo thumb) {
        this.mThumb = thumb;
    }

    public CommentImageInfo getLarge() {
        return mLarge;
    }

    public void setLarge(CommentImageInfo large) {
        this.mLarge = large;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        this.mType = type;
    }

    public boolean isGIF() {
        return TYPE_GIF.equals(mType);
    }

    public boolean isCommonPic() {
        return TYPE_COMMON_PIC.equals(mType);
    }

    public boolean isLongPic() {
        return TYPE_LONG_PIC.equals(mType);
    }

    /**
     * 解析图集信息
     * @param imagesObject 图集json对象
     * @return 返回图集数据
     */
    public static CommentImagesData parseImagesData(JSONObject imagesObject) {
        CommentImagesData imagesData = null;
        if (imagesObject != null) {
            imagesData = new CommentImagesData();
            imagesData.setType(imagesObject.optString("type"));
            // 解析缩略图
            JSONObject thumbObject = imagesObject.optJSONObject("thumb");
            CommentImageInfo thumbInfo = CommentImageInfo.parseImageInfo(thumbObject);
            imagesData.setThumb(thumbInfo);
            // 解析原图
            JSONObject largeObject = imagesObject.optJSONObject("large");
            CommentImageInfo largeInfo = CommentImageInfo.parseImageInfo(largeObject);
            imagesData.setLarge(largeInfo);
        }
        return imagesData;
    }
}
