package com.norman.comment.repository.entity;

/**
 * 评论活动运营入口 NA评论区顶部文字链
 */

public class CommentActiveData {

    /** 高亮文案 */
    private String mHighLightText;
    /** 黑色文案 */
    private String mBannerText;
    /** 活动链接 */
    private String mActiveLinkUrl;
    /** 本次活动id, 唯一标识活动 */
    private String mActiveId;
    /** 本次活动配置的版本号 */
    private String mActiveVersion;

    public String getHighLightText() {
        return mHighLightText;
    }

    public void setHighLightText(String highLightText) {
        this.mHighLightText = highLightText;
    }

    public String getBannerText() {
        return mBannerText;
    }

    public void setBannerText(String bannerText) {
        this.mBannerText = bannerText;
    }

    public String getActiveLinkUrl() {
        return mActiveLinkUrl;
    }

    public void setAcitveLinkUrl(String activeLinkUrl) {
        this.mActiveLinkUrl = activeLinkUrl;
    }

    public String getActiveId() {
        return mActiveId;
    }

    public void setActiveId(String activeId) {
        this.mActiveId = activeId;
    }

    public String getActiveVersion() {
        return mActiveVersion;
    }

    public void setActiveVersion(String activeVersion) {
        this.mActiveVersion = activeVersion;
    }

}