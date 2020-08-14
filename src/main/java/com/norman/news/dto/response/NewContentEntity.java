package com.norman.news.dto.response;

import java.util.List;

public class NewContentEntity {
    /**
     * comment_count : 6
     * detail_source : 经济日报
     * hupu_content_image_urls : [""]
     * high_quality_flag : 0
     * is_original : false
     * media_user : {"no_display_pgc_icon":false,"avatar_url":"http://p1.pstatp.com/thumb/bc2000374269918957f","screen_name":"经济日报","user_auth_info":{"auth_type":"0","auth_info":"《经济日报》官方账号"},"id":"50098460684"}
     * source : 经济日报
     * title : 美方跟中国谈人权和道德 华春莹：想起了《皇帝的新装》
     * url : https://static.jingjiribao.cn/static/jjrbrss/3rsshtml/20191211/212616.html
     * content : <img src="http://p3.pstatp.com/large/pgc-image/RkM3IwBAUr3iyR" img_width="500" img_height="266" inline="0" alt="美方跟中国谈人权和道德 华春莹：想起了《皇帝的新装》" onerror="javascript:errorimg.call(this);"><p>↑资料图。</p><p>在12月11日外交部例行记者会上，有记者问：美国国务卿蓬佩奥昨天再次发表声明，指责中国“压迫”宗教与少数民族人士并“侵害”人民自由，并称若要在爱好自由国家眼中重获其道德权威性，必须重新致力于保护人权与基本自由。你对此有何回应？</p><p>华春莹：美方的这个声明让我再次想起了安徒生童话《皇帝的新装》。这真是莫大的讽刺：明明自己没有穿衣服，还自我感觉好到爆棚。</p><p>今天的美国还真没有什么资格来跟中国谈人权和道德。昨天，我已经详细列举了中国70年来人权事业取得的伟大成就。在中国960万平方公里的土地上没有战乱恐惧和颠沛流离，56个民族和谐相处，8.5亿人摆脱了贫困，14亿人民安居乐业。连续10多年，中国对全球GDP增量贡献率高达30％以上。中国不仅创造了人类发展史上的奇迹，也为世界人权事业发展作出了巨大贡献，得到了世界各国的一致赞许。</p><p>反观美国，不仅国内种族歧视等人权问题泛滥严重，还伸长了手到处干预别国内政，大搞“颜色革命”和政权更迭，不断在伊拉克、叙利亚、阿富汗等国挑起战火、滥杀无辜，假借自由和人权的名义在世界范围内干了多少坏事？！不仅如此，还动用国家力量、滥用所谓的国家安全名义打压特定企业，动辄挥舞着制裁大棒，肆意奉行单边主义、保护主义，屡屡退群毁约，破坏损害国际多边机制，毫无信誉可言。面对世人的侧目，不仅不以为耻，反以为荣；明明已经从山巅之城跌落，还浑然不觉，颐指气使。对此，我们注意到美国国内正在出现越来越多理智的反思和声音。</p><p>自知之明是一种智慧，也是一种做人的境界，希望美方能够认识到这一点。</p>
     * labels : []
     * impression_count : 1647
     * is_pgc_article : true
     * publish_time : 1576074339
     * creator_uid : 50098460684
     * hotwords : [{"stress_type":0,"hot_word":"录明星整容视频勒索"},{"stress_type":1,"hot_word":"宁静再演孝庄"},{"stress_type":0,"hot_word":"日常佩戴13公斤黄金"},{"stress_type":0,"hot_word":"中国化工集团被约谈"},{"stress_type":0,"hot_word":"医生用筷子紧急救人"},{"stress_type":1,"hot_word":"黄渤回应女版黄渤"},{"stress_type":1,"hot_word":"贾跃亭股份被冻结"},{"stress_type":1,"hot_word":"买老鼠夹送香肠"}]
     * logo_show_strategy : normal
     */

    private int comment_count;
    private String detail_source;
    private String high_quality_flag;
    private boolean is_original;
    private MediaUserBean media_user;
    private String source;
    private String title;
    private String url;
    private String content;
    private String impression_count;
    private boolean is_pgc_article;
    private int publish_time;
    private long creator_uid;
    private String logo_show_strategy;
    private List<String> hupu_content_image_urls;
    private List<?> labels;
    private List<HotwordsBean> hotwords;

    public int getComment_count() {
        return comment_count;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }

    public String getDetail_source() {
        return detail_source;
    }

    public void setDetail_source(String detail_source) {
        this.detail_source = detail_source;
    }

    public String getHigh_quality_flag() {
        return high_quality_flag;
    }

    public void setHigh_quality_flag(String high_quality_flag) {
        this.high_quality_flag = high_quality_flag;
    }

    public boolean isIs_original() {
        return is_original;
    }

    public void setIs_original(boolean is_original) {
        this.is_original = is_original;
    }

    public MediaUserBean getMedia_user() {
        return media_user;
    }

    public void setMedia_user(MediaUserBean media_user) {
        this.media_user = media_user;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImpression_count() {
        return impression_count;
    }

    public void setImpression_count(String impression_count) {
        this.impression_count = impression_count;
    }

    public boolean isIs_pgc_article() {
        return is_pgc_article;
    }

    public void setIs_pgc_article(boolean is_pgc_article) {
        this.is_pgc_article = is_pgc_article;
    }

    public int getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(int publish_time) {
        this.publish_time = publish_time;
    }

    public long getCreator_uid() {
        return creator_uid;
    }

    public void setCreator_uid(long creator_uid) {
        this.creator_uid = creator_uid;
    }

    public String getLogo_show_strategy() {
        return logo_show_strategy;
    }

    public void setLogo_show_strategy(String logo_show_strategy) {
        this.logo_show_strategy = logo_show_strategy;
    }

    public List<String> getHupu_content_image_urls() {
        return hupu_content_image_urls;
    }

    public void setHupu_content_image_urls(List<String> hupu_content_image_urls) {
        this.hupu_content_image_urls = hupu_content_image_urls;
    }

    public List<?> getLabels() {
        return labels;
    }

    public void setLabels(List<?> labels) {
        this.labels = labels;
    }

    public List<HotwordsBean> getHotwords() {
        return hotwords;
    }

    public void setHotwords(List<HotwordsBean> hotwords) {
        this.hotwords = hotwords;
    }

    public static class MediaUserBean {
        /**
         * no_display_pgc_icon : false
         * avatar_url : http://p1.pstatp.com/thumb/bc2000374269918957f
         * screen_name : 经济日报
         * user_auth_info : {"auth_type":"0","auth_info":"《经济日报》官方账号"}
         * id : 50098460684
         */

        private boolean no_display_pgc_icon;
        private String avatar_url;
        private String screen_name;
        private UserAuthInfoBean user_auth_info;
        private String id;

        public boolean isNo_display_pgc_icon() {
            return no_display_pgc_icon;
        }

        public void setNo_display_pgc_icon(boolean no_display_pgc_icon) {
            this.no_display_pgc_icon = no_display_pgc_icon;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getScreen_name() {
            return screen_name;
        }

        public void setScreen_name(String screen_name) {
            this.screen_name = screen_name;
        }

        public UserAuthInfoBean getUser_auth_info() {
            return user_auth_info;
        }

        public void setUser_auth_info(UserAuthInfoBean user_auth_info) {
            this.user_auth_info = user_auth_info;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class UserAuthInfoBean {
            /**
             * auth_type : 0
             * auth_info : 《经济日报》官方账号
             */

            private String auth_type;
            private String auth_info;

            public String getAuth_type() {
                return auth_type;
            }

            public void setAuth_type(String auth_type) {
                this.auth_type = auth_type;
            }

            public String getAuth_info() {
                return auth_info;
            }

            public void setAuth_info(String auth_info) {
                this.auth_info = auth_info;
            }
        }
    }

    public static class HotwordsBean {
        /**
         * stress_type : 0
         * hot_word : 录明星整容视频勒索
         */

        private int stress_type;
        private String hot_word;

        public int getStress_type() {
            return stress_type;
        }

        public void setStress_type(int stress_type) {
            this.stress_type = stress_type;
        }

        public String getHot_word() {
            return hot_word;
        }

        public void setHot_word(String hot_word) {
            this.hot_word = hot_word;
        }
    }
}
