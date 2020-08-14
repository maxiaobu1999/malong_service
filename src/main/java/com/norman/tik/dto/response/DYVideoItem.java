package com.norman.tik.dto.response;

public class DYVideoItem {
    /**
     * 视频高宽比
     */
    public String HW;
    /**
     * 视频封面
     */
    public String image;
    /**
     * 达人播放次数
     */
    public String playNum;
    /**
     * 小视频详细数据
     */
    /** 10.0 新增字段 */
    public String vid;
    public String pd;
    public String searchID;
    public String authorID;
    public String tab;
    public String width;
    public String height;

    /** 小视频详细数据 */
    public Object miniVideoData;
    /**
     * 小视频播放次数
     */
    public String playcnt;
    /**
     * 话题模板视频个数
     */
    public String videoCnt;
    /**
     * 话题模板参与话题人数
     */
    public String joinCnt;
    /**
     * 小视频点赞
     */
    public String likeNum;
    /**
     * 显示x 关闭小叉，1 展示，0 不展示
     */
    public String close;
    /**
     * 显示分享
     */
    public String mask;
    /**
     * 显示分享
     */
    public String share;
    /** 小视频落地页数据预取 */
    public String miniLandPrefetch;
    /** 小视频落地页封面图 */
    public String miniLandPoster;
    /** 小视频video url*/
    public String videoUrl;

    /** v10.5.0 运营模板 类型activity  */
    public String mode;

    /** v10.10.0 动态图 */
    public String dynamicImageUrl;
    /** v10.10 小视频是否需要泛化 默认是需要的 */
    public String needGeneralize;
    /** v10.10 小视频当前的位置 */
    public String currentPosition;
    /** v10.10 是否是泛化数据 */
    public String isGeneralizeData;

    /** 视频对应的角标互选广告 */
    public String miniVideoAdCornerItemData;
    /** v10.14 新增用于判断视频是否有互选广告 */
    public String nativeads;

    @Override
    public String toString() {
        String string = "Movie{" +
                "videoUrl=" + videoUrl +
                ", image='" + image + '\'';
        string += '}';
        return string;
    }
}
