package com.norman.mini.dto.response;

public class MiniEntity {
    /** 视频id */
    public String vid;
    /** 视频title */
    public String title;
    /** 视频封面 */
    public String image;
    /** 小视频video url */
    public String videoUrl;
    /** 视频时长 */
    public String duration;
    /** 小视频大小 */
    public String videoSize;
    /** 播放次数 */
    public String playcntText;
    /** 小视频点赞 */
    public String likeNum;
    /** 视频评论数量 */
    public String commentNum;

    /** 作者头像地址 */
    public String authorIcon;
    /** 作者名称 */
    public String authorName;

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getVideoSize() {
        return videoSize;
    }

    public void setVideoSize(String videoSize) {
        this.videoSize = videoSize;
    }

    public String getPlaycntText() {
        return playcntText;
    }

    public void setPlaycntText(String playcntText) {
        this.playcntText = playcntText;
    }

    public String getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(String likeNum) {
        this.likeNum = likeNum;
    }

    public String getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(String commentNum) {
        this.commentNum = commentNum;
    }

    public String getAuthorIcon() {
        return authorIcon;
    }

    public void setAuthorIcon(String authorIcon) {
        this.authorIcon = authorIcon;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
