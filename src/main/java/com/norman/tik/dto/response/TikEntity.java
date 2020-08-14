package com.norman.tik.dto.response;

public class TikEntity {
    /** 视频id */
    public String vid;
    /** 视频高宽比 */
    public String HW;
    public String width;
    public String height;
    /** 视频封面 */
    public String image;
    /** 播放次数 */
    public String playNum;
    /** 小视频点赞 */
    public String likeNum;
    /** 小视频video url */
    public String videoUrl;
    /** 小视频大小 */
    public String videoSize;
    /** 小视频bps */
    public String videoBps;


    /** 作者头像地址 */
    public String authorIcon;
    /** 作者名称 */
    public String authorName;
    /** 作者副标题 */
    public String authorDescribe;
    /** 作者作品数 */
    public String productionNum;
    /** 作者粉丝数 */
    public int fansNum;
    /** 视频title */
    public String title;
    /** 话题 */
    public String topic;
    /** 关注状态 */
    public int followStatus;
    /** 关注气泡引导内容 */
    public String followGuide;
    /** 关注吸睛效果次数 */
    public int followAnimNum;

    /** 音乐名称 */
    public String musicName;
    /** 音乐封面 */
    public String musicPoster;
    /** CD转盘是否展示开关 1开 */
    public int musicCDSwitch;
    /** 音乐标题是否展示开关 1开 */
    public int musicTitleSwitch;
    /** 跳转地址 */
    public String musicCmd;

    /** 直播状态 0/1表示是否开播 */
    public int anchorStatus;
    /** 跳转scheme */
    public String anchorCmd;

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getHW() {
        return HW;
    }

    public void setHW(String HW) {
        this.HW = HW;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPlayNum() {
        return playNum;
    }

    public void setPlayNum(String playNum) {
        this.playNum = playNum;
    }

    public String getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(String likeNum) {
        this.likeNum = likeNum;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoSize() {
        return videoSize;
    }

    public void setVideoSize(String videoSize) {
        this.videoSize = videoSize;
    }

    public String getVideoBps() {
        return videoBps;
    }

    public void setVideoBps(String videoBps) {
        this.videoBps = videoBps;
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

    public String getAuthorDescribe() {
        return authorDescribe;
    }

    public void setAuthorDescribe(String authorDescribe) {
        this.authorDescribe = authorDescribe;
    }

    public String getProductionNum() {
        return productionNum;
    }

    public void setProductionNum(String productionNum) {
        this.productionNum = productionNum;
    }

    public int getFansNum() {
        return fansNum;
    }

    public void setFansNum(int fansNum) {
        this.fansNum = fansNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getFollowStatus() {
        return followStatus;
    }

    public void setFollowStatus(int followStatus) {
        this.followStatus = followStatus;
    }

    public String getFollowGuide() {
        return followGuide;
    }

    public void setFollowGuide(String followGuide) {
        this.followGuide = followGuide;
    }

    public int getFollowAnimNum() {
        return followAnimNum;
    }

    public void setFollowAnimNum(int followAnimNum) {
        this.followAnimNum = followAnimNum;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getMusicPoster() {
        return musicPoster;
    }

    public void setMusicPoster(String musicPoster) {
        this.musicPoster = musicPoster;
    }

    public int getMusicCDSwitch() {
        return musicCDSwitch;
    }

    public void setMusicCDSwitch(int musicCDSwitch) {
        this.musicCDSwitch = musicCDSwitch;
    }

    public int getMusicTitleSwitch() {
        return musicTitleSwitch;
    }

    public void setMusicTitleSwitch(int musicTitleSwitch) {
        this.musicTitleSwitch = musicTitleSwitch;
    }

    public String getMusicCmd() {
        return musicCmd;
    }

    public void setMusicCmd(String musicCmd) {
        this.musicCmd = musicCmd;
    }

    public int getAnchorStatus() {
        return anchorStatus;
    }

    public void setAnchorStatus(int anchorStatus) {
        this.anchorStatus = anchorStatus;
    }

    public String getAnchorCmd() {
        return anchorCmd;
    }

    public void setAnchorCmd(String anchorCmd) {
        this.anchorCmd = anchorCmd;
    }




    /** 音乐信息 */
    public MusicInfo musicInfo;
    /** 直播信息 */
    public Anchor anchorInfo;


    /** 音乐信息, 0/1 关/开 */
    public static class MusicInfo {
        /** 音乐名称 */
        public String musicName;
        /** 音乐封面 */
        public String musicPoster;
        /** CD转盘是否展示开关 1开 */
        public int musicCDSwitch;
        /** 音乐标题是否展示开关 1开 */
        public int musicTitleSwitch;
        /** 跳转地址 */
        public String cmd;
    }

    /** 直播 */
    public static class Anchor {
        /** 直播状态 0/1表示是否开播 */
        public int mStatus;
        /** 跳转scheme */
        public String mCmd;
    }

}
