package com.norman.tik.repository.entity;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TikOriginalEntity {


    private String errno;
    private String timestamp;
    private DataBeanX data;

    public String getErrno() {
        return errno;
    }

    public void setErrno(String errno) {
        this.errno = errno;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public static class DataBeanX {


        @SerializedName("210")
        private _$210Bean _$210;

        public _$210Bean get_$210() {
            return _$210;
        }

        public void set_$210(_$210Bean _$210) {
            this._$210 = _$210;
        }

        public static class _$210Bean {
            /**
             * itemlist : {"policies":{"auto_refresh_interval":30,"auto_clear_cache_limit":20,"scroll_feedback_interval":60,"remove_duplicate_switch":1,"preload_position":4,"preload_not_wifi_switch":1,"filter_list":{"ts":0,"item":[]},"ad_policy":[]},"items":[{"id":"sv_3835828622578785753","isUserSelf":0,"layout":"mini_video","data":{"id":"sv_3835828622578785753","mode":"video","title":"","video":"https://vd2.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g1.mp4?auth_key=1575533929-0-0-5fdeabf400ada966a0462bcb70cb98b0&bcevod_channel=searchbox_feed","hw":1.778,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%223835828622578785753%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g100000.jpg@s_2,w_640,h_1137,q_80","videoInfo":{"vid":"3835828622578785753","title":"","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g100000.jpg@s_2,w_640,h_1137,q_80","posterImage":"https://vd7.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g100000.jpg@s_2,w_640,h_1137,q_80","posterImageHistory":"https://timgmb02.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=b08a58be7517163141540b110d3bbfce&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2F78b1cd31da862af66e8324e278144c2e.jpg","duration":11,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=3835828622578785753&shared_cuid=AqqqB","webTitle":"[全民小视频]狙击手请开八倍镜发布的精彩小视频","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd2.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g1.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=3835828622578785753&auth_key=1575449329-0-0-8a9f47a8ad30269ef2ab0244c6031351&bcevod_channel=searchbox_feed","videoBps":1746,"videoSize":2.3,"height":960,"width":540,"maxH":0.6,"prefetchSize":670464,"prefetchPageSize":670464}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/b810f3d2c7e9fcbadf09e1d565933de0.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"11","vid":"3835828622578785753","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd2.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g1.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=3835828622578785753&auth_key=1575449329-0-0-8a9f47a8ad30269ef2ab0244c6031351&bcevod_channel=searchbox_feed","size":670464}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%223835828622578785753%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%223835828622578785753%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%223835828622578785753%22%2C%22title%22%3A%22%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkuu9e17hnzh20g1%5C%2Fmda-jkuu9e17hnzh20g100000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkuu9e17hnzh20g1%5C%2Fmda-jkuu9e17hnzh20g100000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb02.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3Db08a58be7517163141540b110d3bbfce%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252F78b1cd31da862af66e8324e278144c2e.jpg%22%2C%22duration%22%3A11%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D3835828622578785753%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%5Cu72d9%5Cu51fb%5Cu624b%5Cu8bf7%5Cu5f00%5Cu516b%5Cu500d%5Cu955c%5Cu53d1%5Cu5e03%5Cu7684%5Cu7cbe%5Cu5f69%5Cu5c0f%5Cu89c6%5Cu9891%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd2.bdstatic.com%5C%2Fmda-jkuu9e17hnzh20g1%5C%2Fmda-jkuu9e17hnzh20g1.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D3835828622578785753%26auth_key%3D1575449329-0-0-8a9f47a8ad30269ef2ab0244c6031351%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A1746%2C%22videoSize%22%3A2.3%2C%22height%22%3A960%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A670464%2C%22prefetchPageSize%22%3A670464%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2Fb810f3d2c7e9fcbadf09e1d565933de0.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%2211%22%2C%22vid%22%3A%223835828622578785753%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%223835828622578785753%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_3835828622578785753%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:11","close":"1","request_ext":"null"},"feedback":{"ext":"{\"gr_ext\":{\"score\":0.17753066790682,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":0.57170826196671,\"gr_user_type\":64,\"all_recall_type\":[72],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":72,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":0,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":-1,\"audit_final_score\":-1,\"news_vr_attention\":\"休闲游戏|\",\"manual_tags\":\"休闲游戏\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":3933373157,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":2,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[55,14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"3835828622578785753\",\"title\":\"\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g100000.jpg@s_2,w_640,h_1137,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk","tag_list":[]},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]},"datasign":"7c2b3eb912333fa3d69361537c701d76"},{"id":"sv_3796235711496858339","isUserSelf":0,"layout":"mini_video","data":{"id":"sv_3796235711496858339","mode":"video","title":"是不是所有的美女见到帅哥，都是这个表情？","video":"https://vd2.bdstatic.com/mda-jkhwqin3v1t0cn0n/mda-jkhwqin3v1t0cn0n.mp4?auth_key=1575533929-0-0-40e90fc0af1d89369a31b2943c9537b0&bcevod_channel=searchbox_feed","hw":1.763,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%223796235711496858339%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jkhwqin3v1t0cn0n/mda-jkhwqin3v1t0cn0n00000.jpg@s_2,w_640,h_1128,q_80","videoInfo":{"vid":"3796235711496858339","title":"是不是所有的美女见到帅哥，都是这个表情？","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jkhwqin3v1t0cn0n/mda-jkhwqin3v1t0cn0n00000.jpg@s_2,w_640,h_1128,q_80","posterImage":"https://vd7.bdstatic.com/mda-jkhwqin3v1t0cn0n/mda-jkhwqin3v1t0cn0n00000.jpg@s_2,w_640,h_1128,q_80","posterImageHistory":"https://timgmb04.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=958ff3030b66090b7f8d0f92310df353&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2Ff24749c4b14395533216c60c3fe7fb08.jpg","duration":11,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=3796235711496858339&shared_cuid=AqqqB","webTitle":"[全民小视频]是不是所有的美女见到帅哥，都是这个表情？","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd2.bdstatic.com/mda-jkhwqin3v1t0cn0n/mda-jkhwqin3v1t0cn0n.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=3796235711496858339&auth_key=1575449329-0-0-3484904666734672bb7a568b08b1d93a&bcevod_channel=searchbox_feed","videoBps":1111,"videoSize":1.5,"height":952,"width":540,"maxH":0.6,"prefetchSize":426624,"prefetchPageSize":426624}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/358cb0ee7dc7ea5bc5d0c7f9280274f0.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"11","vid":"3796235711496858339","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd2.bdstatic.com/mda-jkhwqin3v1t0cn0n/mda-jkhwqin3v1t0cn0n.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=3796235711496858339&auth_key=1575449329-0-0-3484904666734672bb7a568b08b1d93a&bcevod_channel=searchbox_feed","size":426624}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%223796235711496858339%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%223796235711496858339%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%223796235711496858339%22%2C%22title%22%3A%22%5Cu662f%5Cu4e0d%5Cu662f%5Cu6240%5Cu6709%5Cu7684%5Cu7f8e%5Cu5973%5Cu89c1%5Cu5230%5Cu5e05%5Cu54e5%5Cuff0c%5Cu90fd%5Cu662f%5Cu8fd9%5Cu4e2a%5Cu8868%5Cu60c5%5Cuff1f%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkhwqin3v1t0cn0n%5C%2Fmda-jkhwqin3v1t0cn0n00000.jpg%40s_2%2Cw_640%2Ch_1128%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkhwqin3v1t0cn0n%5C%2Fmda-jkhwqin3v1t0cn0n00000.jpg%40s_2%2Cw_640%2Ch_1128%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb04.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3D958ff3030b66090b7f8d0f92310df353%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252Ff24749c4b14395533216c60c3fe7fb08.jpg%22%2C%22duration%22%3A11%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D3796235711496858339%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%5Cu662f%5Cu4e0d%5Cu662f%5Cu6240%5Cu6709%5Cu7684%5Cu7f8e%5Cu5973%5Cu89c1%5Cu5230%5Cu5e05%5Cu54e5%5Cuff0c%5Cu90fd%5Cu662f%5Cu8fd9%5Cu4e2a%5Cu8868%5Cu60c5%5Cuff1f%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd2.bdstatic.com%5C%2Fmda-jkhwqin3v1t0cn0n%5C%2Fmda-jkhwqin3v1t0cn0n.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D3796235711496858339%26auth_key%3D1575449329-0-0-3484904666734672bb7a568b08b1d93a%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A1111%2C%22videoSize%22%3A1.5%2C%22height%22%3A952%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A426624%2C%22prefetchPageSize%22%3A426624%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2F358cb0ee7dc7ea5bc5d0c7f9280274f0.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%2211%22%2C%22vid%22%3A%223796235711496858339%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%223796235711496858339%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_3796235711496858339%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:11","close":"1","request_ext":"null"},"feedback":{"ext":"{\"gr_ext\":{\"score\":0.21066383833514,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":0.048583511263132,\"gr_user_type\":64,\"all_recall_type\":[402],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":402,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":1,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":-1,\"audit_final_score\":-1,\"news_vr_attention\":\"女人|服饰穿搭|\",\"news_style_super\":\"画风粗劣\",\"manual_tags\":\"女人,服饰穿搭\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":2784037743,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":2,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"3796235711496858339\",\"title\":\"是不是所有的美女见到帅哥，都是这个表情？\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jkhwqin3v1t0cn0n/mda-jkhwqin3v1t0cn0n00000.jpg@s_2,w_640,h_1128,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]},"datasign":"82e957239642891c041dd6f5ddd08bb9"},{"id":"sv_5238213849808179536","isUserSelf":0,"layout":"mini_video","data":{"id":"sv_5238213849808179536","mode":"video","title":"","video":"https://vd2.bdstatic.com/mda-jkemr6drs81nbrk3/mda-jkemr6drs81nbrk3.mp4?auth_key=1575533929-0-0-81dd721e906143e73e6d93e2b7c627a0&bcevod_channel=searchbox_feed","hw":1.763,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%225238213849808179536%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jkemr6drs81nbrk3/mda-jkemr6drs81nbrk300000.jpg@s_2,w_640,h_1128,q_80","videoInfo":{"vid":"5238213849808179536","title":"","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jkemr6drs81nbrk3/mda-jkemr6drs81nbrk300000.jpg@s_2,w_640,h_1128,q_80","posterImage":"https://vd7.bdstatic.com/mda-jkemr6drs81nbrk3/mda-jkemr6drs81nbrk300000.jpg@s_2,w_640,h_1128,q_80","posterImageHistory":"https://timgmb.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=3d75fca6c0ffac08452a7de96b955a0b&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2Fbb838a20994f75ab4875a3ef79d65b78","duration":7,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=5238213849808179536&shared_cuid=AqqqB","webTitle":"[全民小视频]周氏康复理疗馆发布的精彩小视频","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd2.bdstatic.com/mda-jkemr6drs81nbrk3/mda-jkemr6drs81nbrk3.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=5238213849808179536&auth_key=1575449329-0-0-04d612c7ded15226e5f63a1b22c97f95&bcevod_channel=searchbox_feed","videoBps":1096,"videoSize":0.9,"height":952,"width":540,"maxH":0.6,"prefetchSize":420864,"prefetchPageSize":420864}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/79c805bad4b234b3609bee59a546dd22.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"7","vid":"5238213849808179536","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd2.bdstatic.com/mda-jkemr6drs81nbrk3/mda-jkemr6drs81nbrk3.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=5238213849808179536&auth_key=1575449329-0-0-04d612c7ded15226e5f63a1b22c97f95&bcevod_channel=searchbox_feed","size":420864}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%225238213849808179536%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%225238213849808179536%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%225238213849808179536%22%2C%22title%22%3A%22%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkemr6drs81nbrk3%5C%2Fmda-jkemr6drs81nbrk300000.jpg%40s_2%2Cw_640%2Ch_1128%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkemr6drs81nbrk3%5C%2Fmda-jkemr6drs81nbrk300000.jpg%40s_2%2Cw_640%2Ch_1128%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3D3d75fca6c0ffac08452a7de96b955a0b%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252Fbb838a20994f75ab4875a3ef79d65b78%22%2C%22duration%22%3A7%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D5238213849808179536%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%5Cu5468%5Cu6c0f%5Cu5eb7%5Cu590d%5Cu7406%5Cu7597%5Cu9986%5Cu53d1%5Cu5e03%5Cu7684%5Cu7cbe%5Cu5f69%5Cu5c0f%5Cu89c6%5Cu9891%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd2.bdstatic.com%5C%2Fmda-jkemr6drs81nbrk3%5C%2Fmda-jkemr6drs81nbrk3.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D5238213849808179536%26auth_key%3D1575449329-0-0-04d612c7ded15226e5f63a1b22c97f95%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A1096%2C%22videoSize%22%3A0.9%2C%22height%22%3A952%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A420864%2C%22prefetchPageSize%22%3A420864%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2F79c805bad4b234b3609bee59a546dd22.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%227%22%2C%22vid%22%3A%225238213849808179536%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%225238213849808179536%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_5238213849808179536%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:07","close":"1","request_ext":"null"},"feedback":{"ext":"{\"gr_ext\":{\"score\":0.052552634305817,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":0.048190910369158,\"gr_user_type\":64,\"all_recall_type\":[97],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":97,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":2,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":3,\"audit_final_score\":-1,\"news_vr_attention\":\"理疗按摩|\",\"manual_tags\":\"理疗按摩\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":3383603596,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":3,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"5238213849808179536\",\"title\":\"\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jkemr6drs81nbrk3/mda-jkemr6drs81nbrk300000.jpg@s_2,w_640,h_1128,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]},"datasign":"2910faf5929708ebfed4b7d301bdf89e"},{"id":"sv_5400875179016304022","isUserSelf":0,"layout":"mini_video","data":{"id":"sv_5400875179016304022","mode":"video","title":"美女遇到这种事，你咋好意思走的呢","video":"https://vd4.bdstatic.com/mda-jm0t41qbs4uacafw/mda-jm0t41qbs4uacafw.mp4?auth_key=1575533929-0-0-e447ffb138ecac430f3085a86c3ed3be&bcevod_channel=searchbox_feed","hw":1.778,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%225400875179016304022%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jm0t41qbs4uacafw/mda-jm0t41qbs4uacafw00000.jpg@s_2,w_640,h_1137,q_80","videoInfo":{"vid":"5400875179016304022","title":"美女遇到这种事，你咋好意思走的呢","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jm0t41qbs4uacafw/mda-jm0t41qbs4uacafw00000.jpg@s_2,w_640,h_1137,q_80","posterImage":"https://vd7.bdstatic.com/mda-jm0t41qbs4uacafw/mda-jm0t41qbs4uacafw00000.jpg@s_2,w_640,h_1137,q_80","posterImageHistory":"https://timgmb04.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=542edc3ad775e2a842346a7d5567d3a8&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2F5f27e2bcaa80ee8f8707a451fae88a9e.jpg","duration":15,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=5400875179016304022&shared_cuid=AqqqB","webTitle":"[全民小视频]美女遇到这种事，你咋好意思走的呢","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd4.bdstatic.com/mda-jm0t41qbs4uacafw/mda-jm0t41qbs4uacafw.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=5400875179016304022&auth_key=1575449329-0-0-9a7fd558e354a4666fde4ccebc03f5aa&bcevod_channel=searchbox_feed","videoBps":1036,"videoSize":1.9,"height":960,"width":540,"maxH":0.6,"prefetchSize":397824,"prefetchPageSize":397824}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/ae09148c53ae30aafc43c73ec6dc2a28.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"15","vid":"5400875179016304022","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd4.bdstatic.com/mda-jm0t41qbs4uacafw/mda-jm0t41qbs4uacafw.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=5400875179016304022&auth_key=1575449329-0-0-9a7fd558e354a4666fde4ccebc03f5aa&bcevod_channel=searchbox_feed","size":397824}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%225400875179016304022%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%225400875179016304022%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%225400875179016304022%22%2C%22title%22%3A%22%5Cu7f8e%5Cu5973%5Cu9047%5Cu5230%5Cu8fd9%5Cu79cd%5Cu4e8b%5Cuff0c%5Cu4f60%5Cu548b%5Cu597d%5Cu610f%5Cu601d%5Cu8d70%5Cu7684%5Cu5462%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jm0t41qbs4uacafw%5C%2Fmda-jm0t41qbs4uacafw00000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jm0t41qbs4uacafw%5C%2Fmda-jm0t41qbs4uacafw00000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb04.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3D542edc3ad775e2a842346a7d5567d3a8%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252F5f27e2bcaa80ee8f8707a451fae88a9e.jpg%22%2C%22duration%22%3A15%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D5400875179016304022%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%5Cu7f8e%5Cu5973%5Cu9047%5Cu5230%5Cu8fd9%5Cu79cd%5Cu4e8b%5Cuff0c%5Cu4f60%5Cu548b%5Cu597d%5Cu610f%5Cu601d%5Cu8d70%5Cu7684%5Cu5462%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd4.bdstatic.com%5C%2Fmda-jm0t41qbs4uacafw%5C%2Fmda-jm0t41qbs4uacafw.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D5400875179016304022%26auth_key%3D1575449329-0-0-9a7fd558e354a4666fde4ccebc03f5aa%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A1036%2C%22videoSize%22%3A1.9%2C%22height%22%3A960%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A397824%2C%22prefetchPageSize%22%3A397824%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2Fae09148c53ae30aafc43c73ec6dc2a28.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%2215%22%2C%22vid%22%3A%225400875179016304022%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%225400875179016304022%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_5400875179016304022%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:15","close":"1","request_ext":"null"},"feedback":{"ext":"{\"gr_ext\":{\"score\":0.028439058505413,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":0,\"gr_user_type\":64,\"all_recall_type\":[35],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":35,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":3,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":-1,\"audit_final_score\":-1,\"news_vr_attention\":\"女人|\",\"news_style_super\":\"画风粗劣\",\"manual_tags\":\"女人\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":2891561635,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":2,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"5400875179016304022\",\"title\":\"美女遇到这种事，你咋好意思走的呢\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jm0t41qbs4uacafw/mda-jm0t41qbs4uacafw00000.jpg@s_2,w_640,h_1137,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]},"datasign":"33849427f1783697a9ec2e7b96674ff9"},{"id":"sv_4157390170071796864","isUserSelf":0,"layout":"mini_video","data":{"id":"sv_4157390170071796864","mode":"video","title":"","video":"https://vd3.bdstatic.com/mda-jm0r6e957behw8by/mda-jm0r6e957behw8by.mp4?auth_key=1575533929-0-0-c271bb4037acc94782c7708846bcfd2e&bcevod_channel=searchbox_feed","hw":1.778,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%224157390170071796864%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jm0r6e957behw8by/mda-jm0r6e957behw8by00000.jpg@s_2,w_640,h_1137,q_80","videoInfo":{"vid":"4157390170071796864","title":"","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jm0r6e957behw8by/mda-jm0r6e957behw8by00000.jpg@s_2,w_640,h_1137,q_80","posterImage":"https://vd7.bdstatic.com/mda-jm0r6e957behw8by/mda-jm0r6e957behw8by00000.jpg@s_2,w_640,h_1137,q_80","posterImageHistory":"https://timgmb.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=c86f5a7075fcd71de438f8f8a8cb1c27&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2F390bc6850b6e17094f47a5327052968f","duration":7,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=4157390170071796864&shared_cuid=AqqqB","webTitle":"[全民小视频]关氏正骨培训发布的精彩小视频","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd3.bdstatic.com/mda-jm0r6e957behw8by/mda-jm0r6e957behw8by.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=4157390170071796864&auth_key=1575449329-0-0-331263adfd87f9641c983664adf4055f&bcevod_channel=searchbox_feed","videoBps":1069,"videoSize":0.9,"height":960,"width":540,"maxH":0.6,"prefetchSize":410496,"prefetchPageSize":410496}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/7d3c11ec6246ab0755a09aa07daeb45d.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"7","vid":"4157390170071796864","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd3.bdstatic.com/mda-jm0r6e957behw8by/mda-jm0r6e957behw8by.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=4157390170071796864&auth_key=1575449329-0-0-331263adfd87f9641c983664adf4055f&bcevod_channel=searchbox_feed","size":410496}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%224157390170071796864%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%224157390170071796864%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%224157390170071796864%22%2C%22title%22%3A%22%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jm0r6e957behw8by%5C%2Fmda-jm0r6e957behw8by00000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jm0r6e957behw8by%5C%2Fmda-jm0r6e957behw8by00000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3Dc86f5a7075fcd71de438f8f8a8cb1c27%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252F390bc6850b6e17094f47a5327052968f%22%2C%22duration%22%3A7%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D4157390170071796864%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%5Cu5173%5Cu6c0f%5Cu6b63%5Cu9aa8%5Cu57f9%5Cu8bad%5Cu53d1%5Cu5e03%5Cu7684%5Cu7cbe%5Cu5f69%5Cu5c0f%5Cu89c6%5Cu9891%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd3.bdstatic.com%5C%2Fmda-jm0r6e957behw8by%5C%2Fmda-jm0r6e957behw8by.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D4157390170071796864%26auth_key%3D1575449329-0-0-331263adfd87f9641c983664adf4055f%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A1069%2C%22videoSize%22%3A0.9%2C%22height%22%3A960%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A410496%2C%22prefetchPageSize%22%3A410496%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2F7d3c11ec6246ab0755a09aa07daeb45d.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%227%22%2C%22vid%22%3A%224157390170071796864%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%224157390170071796864%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_4157390170071796864%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:07","close":"1","request_ext":"null"},"feedback":{"ext":"{\"gr_ext\":{\"score\":0.042153816742289,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":0.048451613634825,\"gr_user_type\":64,\"all_recall_type\":[97],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":97,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":4,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":-1,\"audit_final_score\":-1,\"news_vr_attention\":\"室内|卧室|理疗按摩|\",\"news_style_super\":\"画风粗劣\",\"manual_tags\":\"室内,卧室,理疗按摩\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":3895413614,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":2,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"4157390170071796864\",\"title\":\"\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jm0r6e957behw8by/mda-jm0r6e957behw8by00000.jpg@s_2,w_640,h_1137,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]},"datasign":"3dd50e0aa6664936350222d3c8457b5a"},{"id":"sv_4158927437571907946","isUserSelf":0,"layout":"mini_video","data":{"id":"sv_4158927437571907946","mode":"video","title":"😃","video":"https://vd2.bdstatic.com/mda-jkjxu3krs0khy4f2/mda-jkjxu3krs0khy4f2.mp4?auth_key=1575533929-0-0-6e75ee93c777ddfb421de346d353645e&bcevod_channel=searchbox_feed","hw":1.763,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%224158927437571907946%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jkjxu3krs0khy4f2/mda-jkjxu3krs0khy4f200000.jpg@s_2,w_640,h_1128,q_80","videoInfo":{"vid":"4158927437571907946","title":"#秀恩爱#😃","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jkjxu3krs0khy4f2/mda-jkjxu3krs0khy4f200000.jpg@s_2,w_640,h_1128,q_80","posterImage":"https://vd7.bdstatic.com/mda-jkjxu3krs0khy4f2/mda-jkjxu3krs0khy4f200000.jpg@s_2,w_640,h_1128,q_80","posterImageHistory":"https://timgmb01.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=5a3c9f48da2672492b6a70e88ddb6d52&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2F66de9c06438666d515e7051a1a9e43b8.jpg","duration":11,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=4158927437571907946&shared_cuid=AqqqB","webTitle":"[全民小视频]😃","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd2.bdstatic.com/mda-jkjxu3krs0khy4f2/mda-jkjxu3krs0khy4f2.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=4158927437571907946&auth_key=1575449329-0-0-5393bc5c518b6e861b2c12d8aae03d9e&bcevod_channel=searchbox_feed","videoBps":1137,"videoSize":1.5,"height":952,"width":540,"maxH":0.6,"prefetchSize":436608,"prefetchPageSize":436608}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/c5ceb40e8d8c03664d7413235ec934ab.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"11","vid":"4158927437571907946","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd2.bdstatic.com/mda-jkjxu3krs0khy4f2/mda-jkjxu3krs0khy4f2.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=4158927437571907946&auth_key=1575449329-0-0-5393bc5c518b6e861b2c12d8aae03d9e&bcevod_channel=searchbox_feed","size":436608}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%224158927437571907946%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%224158927437571907946%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%224158927437571907946%22%2C%22title%22%3A%22%23%5Cu79c0%5Cu6069%5Cu7231%23%5Cud83d%5Cude03%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkjxu3krs0khy4f2%5C%2Fmda-jkjxu3krs0khy4f200000.jpg%40s_2%2Cw_640%2Ch_1128%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkjxu3krs0khy4f2%5C%2Fmda-jkjxu3krs0khy4f200000.jpg%40s_2%2Cw_640%2Ch_1128%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb01.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3D5a3c9f48da2672492b6a70e88ddb6d52%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252F66de9c06438666d515e7051a1a9e43b8.jpg%22%2C%22duration%22%3A11%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D4158927437571907946%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%5Cud83d%5Cude03%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd2.bdstatic.com%5C%2Fmda-jkjxu3krs0khy4f2%5C%2Fmda-jkjxu3krs0khy4f2.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D4158927437571907946%26auth_key%3D1575449329-0-0-5393bc5c518b6e861b2c12d8aae03d9e%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A1137%2C%22videoSize%22%3A1.5%2C%22height%22%3A952%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A436608%2C%22prefetchPageSize%22%3A436608%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2Fc5ceb40e8d8c03664d7413235ec934ab.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%2211%22%2C%22vid%22%3A%224158927437571907946%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%224158927437571907946%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_4158927437571907946%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:11","close":"1","request_ext":"null"},"feedback":{"ext":"{\"gr_ext\":{\"score\":0.052486075772122,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":0.31787005066872,\"gr_user_type\":64,\"all_recall_type\":[41],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":41,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":5,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":-1,\"audit_final_score\":-1,\"news_vr_attention\":\"女人|城市户外|秀恩爱|\",\"manual_tags\":\"女人,城市户外,秀恩爱\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":4283163785,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":2,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"4158927437571907946\",\"title\":\"#秀恩爱#😃\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jkjxu3krs0khy4f2/mda-jkjxu3krs0khy4f200000.jpg@s_2,w_640,h_1128,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]},"datasign":"167d02a978c8e87e64da9bae6de18689"},{"id":"sv_4967953397619485872","isUserSelf":0,"layout":"mini_video","data":{"id":"sv_4967953397619485872","mode":"video","title":"#万物皆可涮#","video":"https://vd4.bdstatic.com/mda-jm2wwbb5zggptdnk/mda-jm2wwbb5zggptdnk.mp4?auth_key=1575533929-0-0-ad8a60e954e48c8130ae8cfba1c780c0&bcevod_channel=searchbox_feed","hw":1.778,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%224967953397619485872%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jm2wwbb5zggptdnk/mda-jm2wwbb5zggptdnk00000.jpg@s_2,w_640,h_1137,q_80","videoInfo":{"vid":"4967953397619485872","title":"#万物皆可涮#","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jm2wwbb5zggptdnk/mda-jm2wwbb5zggptdnk00000.jpg@s_2,w_640,h_1137,q_80","posterImage":"https://vd7.bdstatic.com/mda-jm2wwbb5zggptdnk/mda-jm2wwbb5zggptdnk00000.jpg@s_2,w_640,h_1137,q_80","posterImageHistory":"https://timgmb05.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=3d7cbe781441385574165bc1f149589a&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2F7cc22e1ed250b4eca2264e32beb46a79.jpg","duration":16,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=4967953397619485872&shared_cuid=AqqqB","webTitle":"[全民小视频]","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd4.bdstatic.com/mda-jm2wwbb5zggptdnk/mda-jm2wwbb5zggptdnk.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=4967953397619485872&auth_key=1575449329-0-0-6d1b7e4bead14bf493ccfa91bfc1f9dd&bcevod_channel=searchbox_feed","videoBps":439,"videoSize":0.9,"height":960,"width":540,"maxH":0.6,"prefetchSize":168576,"prefetchPageSize":168576}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/0b7cb942ee29180828a48a720b1fb838.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"16","vid":"4967953397619485872","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd4.bdstatic.com/mda-jm2wwbb5zggptdnk/mda-jm2wwbb5zggptdnk.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=4967953397619485872&auth_key=1575449329-0-0-6d1b7e4bead14bf493ccfa91bfc1f9dd&bcevod_channel=searchbox_feed","size":168576}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%224967953397619485872%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%224967953397619485872%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%224967953397619485872%22%2C%22title%22%3A%22%23%5Cu4e07%5Cu7269%5Cu7686%5Cu53ef%5Cu6dae%23%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jm2wwbb5zggptdnk%5C%2Fmda-jm2wwbb5zggptdnk00000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jm2wwbb5zggptdnk%5C%2Fmda-jm2wwbb5zggptdnk00000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb05.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3D3d7cbe781441385574165bc1f149589a%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252F7cc22e1ed250b4eca2264e32beb46a79.jpg%22%2C%22duration%22%3A16%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D4967953397619485872%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd4.bdstatic.com%5C%2Fmda-jm2wwbb5zggptdnk%5C%2Fmda-jm2wwbb5zggptdnk.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D4967953397619485872%26auth_key%3D1575449329-0-0-6d1b7e4bead14bf493ccfa91bfc1f9dd%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A439%2C%22videoSize%22%3A0.9%2C%22height%22%3A960%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A168576%2C%22prefetchPageSize%22%3A168576%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2F0b7cb942ee29180828a48a720b1fb838.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%2216%22%2C%22vid%22%3A%224967953397619485872%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%224967953397619485872%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_4967953397619485872%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:16","close":"1","request_ext":"null"},"feedback":{"ext":"{\"gr_ext\":{\"score\":0.015099962169264,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":1.1563102006912,\"gr_user_type\":64,\"all_recall_type\":[170],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":170,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":6,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":-1,\"audit_final_score\":-1,\"news_vr_attention\":\"旅游休闲|古建筑|\",\"news_style_super\":\"画风粗劣\",\"manual_tags\":\"旅游休闲,古建筑\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":1146459383,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":1,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"4967953397619485872\",\"title\":\"#万物皆可涮#\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jm2wwbb5zggptdnk/mda-jm2wwbb5zggptdnk00000.jpg@s_2,w_640,h_1137,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]},"datasign":"799f95e9eed54895013d29fe79fe3e94"},{"id":"sv_5089424448597375004","isUserSelf":0,"layout":"mini_video","data":{"id":"sv_5089424448597375004","mode":"video","title":"车美人美","video":"https://vd3.bdstatic.com/mda-jkuiti0hbh4r3su6/mda-jkuiti0hbh4r3su6.mp4?auth_key=1575533929-0-0-a713a352019a6e4f87ee1a9b557a05cd&bcevod_channel=searchbox_feed","hw":1.778,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%225089424448597375004%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jkuiti0hbh4r3su6/mda-jkuiti0hbh4r3su600000.jpg@s_2,w_640,h_1137,q_80","videoInfo":{"vid":"5089424448597375004","title":"车美人美","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jkuiti0hbh4r3su6/mda-jkuiti0hbh4r3su600000.jpg@s_2,w_640,h_1137,q_80","posterImage":"https://vd7.bdstatic.com/mda-jkuiti0hbh4r3su6/mda-jkuiti0hbh4r3su600000.jpg@s_2,w_640,h_1137,q_80","posterImageHistory":"https://timgmb03.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=6aa7297b5c96f61eec9eb73bc330b78a&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2F81ff6411b2a20e46e3c41061542990c3","duration":7,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=5089424448597375004&shared_cuid=AqqqB","webTitle":"[全民小视频]车美人美","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd3.bdstatic.com/mda-jkuiti0hbh4r3su6/mda-jkuiti0hbh4r3su6.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=5089424448597375004&auth_key=1575449329-0-0-bd6025c51d0450a8557a205b9e4fb048&bcevod_channel=searchbox_feed","videoBps":1452,"videoSize":1.2,"height":960,"width":540,"maxH":0.6,"prefetchSize":557568,"prefetchPageSize":557568}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/e8ac9de6ff7e4d3fd12842a1c8391b16.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"7","vid":"5089424448597375004","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd3.bdstatic.com/mda-jkuiti0hbh4r3su6/mda-jkuiti0hbh4r3su6.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=5089424448597375004&auth_key=1575449329-0-0-bd6025c51d0450a8557a205b9e4fb048&bcevod_channel=searchbox_feed","size":557568}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%225089424448597375004%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%225089424448597375004%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%225089424448597375004%22%2C%22title%22%3A%22%5Cu8f66%5Cu7f8e%5Cu4eba%5Cu7f8e%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkuiti0hbh4r3su6%5C%2Fmda-jkuiti0hbh4r3su600000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkuiti0hbh4r3su6%5C%2Fmda-jkuiti0hbh4r3su600000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb03.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3D6aa7297b5c96f61eec9eb73bc330b78a%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252F81ff6411b2a20e46e3c41061542990c3%22%2C%22duration%22%3A7%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D5089424448597375004%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%5Cu8f66%5Cu7f8e%5Cu4eba%5Cu7f8e%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd3.bdstatic.com%5C%2Fmda-jkuiti0hbh4r3su6%5C%2Fmda-jkuiti0hbh4r3su6.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D5089424448597375004%26auth_key%3D1575449329-0-0-bd6025c51d0450a8557a205b9e4fb048%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A1452%2C%22videoSize%22%3A1.2%2C%22height%22%3A960%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A557568%2C%22prefetchPageSize%22%3A557568%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2Fe8ac9de6ff7e4d3fd12842a1c8391b16.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%227%22%2C%22vid%22%3A%225089424448597375004%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%225089424448597375004%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_5089424448597375004%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:07","close":"1","request_ext":"null"},"feedback":{"ext":"{\"gr_ext\":{\"score\":0.24587772521721,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":1.0736025571823,\"gr_user_type\":64,\"all_recall_type\":[44],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":44,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":7,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":-1,\"audit_final_score\":-1,\"news_vr_attention\":\"女人|美女|车展|\",\"manual_tags\":\"女人,美女,车展\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":4126470550,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":2,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"5089424448597375004\",\"title\":\"车美人美\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jkuiti0hbh4r3su6/mda-jkuiti0hbh4r3su600000.jpg@s_2,w_640,h_1137,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]},"datasign":"96b973877d2527e5888fc71a5b1d4bd6"},{"id":"sv_4362492918553500470","isUserSelf":0,"layout":"mini_video","data":{"id":"sv_4362492918553500470","mode":"video","title":"#篮球女孩#弟弟，这球进了我做你女朋友","video":"https://vd2.bdstatic.com/mda-jm0sx7z951inf8mg/mda-jm0sx7z951inf8mg.mp4?auth_key=1575533929-0-0-523f0d26a8c5d651e40891e9e82250d1&bcevod_channel=searchbox_feed","hw":1.778,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%224362492918553500470%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jm0sx7z951inf8mg/mda-jm0sx7z951inf8mg00000.jpg@s_2,w_640,h_1137,q_80","videoInfo":{"vid":"4362492918553500470","title":"#篮球女孩#弟弟，这球进了我做你女朋友","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jm0sx7z951inf8mg/mda-jm0sx7z951inf8mg00000.jpg@s_2,w_640,h_1137,q_80","posterImage":"https://vd7.bdstatic.com/mda-jm0sx7z951inf8mg/mda-jm0sx7z951inf8mg00000.jpg@s_2,w_640,h_1137,q_80","posterImageHistory":"https://timgmb05.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=0ff51e0b5f166627346fde64eb52f271&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2F8003dea426e81cbd2c803041efab3026.jpg","duration":16,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=4362492918553500470&shared_cuid=AqqqB","webTitle":"[全民小视频]弟弟，这球进了我做你女朋友","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd2.bdstatic.com/mda-jm0sx7z951inf8mg/mda-jm0sx7z951inf8mg.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=4362492918553500470&auth_key=1575449329-0-0-2fbd039332e6442c22592b58bba4f866&bcevod_channel=searchbox_feed","videoBps":1352,"videoSize":2.6,"height":960,"width":540,"maxH":0.6,"prefetchSize":519168,"prefetchPageSize":519168}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/a31d0fc69d2f4c9fafe957829eb72d6c.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"16","vid":"4362492918553500470","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd2.bdstatic.com/mda-jm0sx7z951inf8mg/mda-jm0sx7z951inf8mg.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=4362492918553500470&auth_key=1575449329-0-0-2fbd039332e6442c22592b58bba4f866&bcevod_channel=searchbox_feed","size":519168}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%224362492918553500470%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%224362492918553500470%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%224362492918553500470%22%2C%22title%22%3A%22%23%5Cu7bee%5Cu7403%5Cu5973%5Cu5b69%23%5Cu5f1f%5Cu5f1f%5Cuff0c%5Cu8fd9%5Cu7403%5Cu8fdb%5Cu4e86%5Cu6211%5Cu505a%5Cu4f60%5Cu5973%5Cu670b%5Cu53cb%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jm0sx7z951inf8mg%5C%2Fmda-jm0sx7z951inf8mg00000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jm0sx7z951inf8mg%5C%2Fmda-jm0sx7z951inf8mg00000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb05.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3D0ff51e0b5f166627346fde64eb52f271%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252F8003dea426e81cbd2c803041efab3026.jpg%22%2C%22duration%22%3A16%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D4362492918553500470%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%5Cu5f1f%5Cu5f1f%5Cuff0c%5Cu8fd9%5Cu7403%5Cu8fdb%5Cu4e86%5Cu6211%5Cu505a%5Cu4f60%5Cu5973%5Cu670b%5Cu53cb%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd2.bdstatic.com%5C%2Fmda-jm0sx7z951inf8mg%5C%2Fmda-jm0sx7z951inf8mg.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D4362492918553500470%26auth_key%3D1575449329-0-0-2fbd039332e6442c22592b58bba4f866%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A1352%2C%22videoSize%22%3A2.6%2C%22height%22%3A960%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A519168%2C%22prefetchPageSize%22%3A519168%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2Fa31d0fc69d2f4c9fafe957829eb72d6c.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%2216%22%2C%22vid%22%3A%224362492918553500470%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%224362492918553500470%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_4362492918553500470%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:16","close":"1","request_ext":"null"},"feedback":{"ext":"{\"gr_ext\":{\"score\":0.061601844978005,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":0.30274057388306,\"gr_user_type\":64,\"all_recall_type\":[50,44],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":50,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":8,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":-1,\"audit_final_score\":-1,\"news_vr_attention\":\"篮球|女人|篮球场|\",\"news_style_super\":\"画风粗劣\",\"manual_tags\":\"篮球,女人,篮球场\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":920702702,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":2,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"4362492918553500470\",\"title\":\"#篮球女孩#弟弟，这球进了我做你女朋友\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jm0sx7z951inf8mg/mda-jm0sx7z951inf8mg00000.jpg@s_2,w_640,h_1137,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]},"datasign":"0f9b61b70b8210e71c6002fd7956a73c"},{"id":"sv_3903852615584730490","isUserSelf":0,"layout":"mini_video","data":{"id":"sv_3903852615584730490","mode":"video","title":"#嘴角向上笑一个吧#","video":"https://vd2.bdstatic.com/mda-jkvme3cis7jzy9tv/mda-jkvme3cis7jzy9tv.mp4?auth_key=1575533929-0-0-16220c14b97fb34d469a0ce209e506d8&bcevod_channel=searchbox_feed","hw":1.778,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%223903852615584730490%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jkvme3cis7jzy9tv/mda-jkvme3cis7jzy9tv00000.jpg@s_2,w_640,h_1137,q_80","videoInfo":{"vid":"3903852615584730490","title":"#嘴角向上笑一个吧#","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jkvme3cis7jzy9tv/mda-jkvme3cis7jzy9tv00000.jpg@s_2,w_640,h_1137,q_80","posterImage":"https://vd7.bdstatic.com/mda-jkvme3cis7jzy9tv/mda-jkvme3cis7jzy9tv00000.jpg@s_2,w_640,h_1137,q_80","posterImageHistory":"https://timgmb05.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=a38d32937af7991f1600bd0e27ad0fa3&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2F19e5f9fc3c39f620228643bb06b55348.jpg","duration":9,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=3903852615584730490&shared_cuid=AqqqB","webTitle":"[全民小视频]","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd2.bdstatic.com/mda-jkvme3cis7jzy9tv/mda-jkvme3cis7jzy9tv.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=3903852615584730490&auth_key=1575449329-0-0-aa3a2771a531f307aefcb3771209e0d1&bcevod_channel=searchbox_feed","videoBps":1360,"videoSize":1.5,"height":960,"width":540,"maxH":0.6,"prefetchSize":522240,"prefetchPageSize":522240}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/70e3decd79e17948374b55050d1178cd.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"9","vid":"3903852615584730490","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd2.bdstatic.com/mda-jkvme3cis7jzy9tv/mda-jkvme3cis7jzy9tv.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=3903852615584730490&auth_key=1575449329-0-0-aa3a2771a531f307aefcb3771209e0d1&bcevod_channel=searchbox_feed","size":522240}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%223903852615584730490%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%223903852615584730490%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%223903852615584730490%22%2C%22title%22%3A%22%23%5Cu5634%5Cu89d2%5Cu5411%5Cu4e0a%5Cu7b11%5Cu4e00%5Cu4e2a%5Cu5427%23%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkvme3cis7jzy9tv%5C%2Fmda-jkvme3cis7jzy9tv00000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkvme3cis7jzy9tv%5C%2Fmda-jkvme3cis7jzy9tv00000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb05.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3Da38d32937af7991f1600bd0e27ad0fa3%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252F19e5f9fc3c39f620228643bb06b55348.jpg%22%2C%22duration%22%3A9%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D3903852615584730490%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd2.bdstatic.com%5C%2Fmda-jkvme3cis7jzy9tv%5C%2Fmda-jkvme3cis7jzy9tv.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D3903852615584730490%26auth_key%3D1575449329-0-0-aa3a2771a531f307aefcb3771209e0d1%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A1360%2C%22videoSize%22%3A1.5%2C%22height%22%3A960%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A522240%2C%22prefetchPageSize%22%3A522240%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2F70e3decd79e17948374b55050d1178cd.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%229%22%2C%22vid%22%3A%223903852615584730490%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%223903852615584730490%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_3903852615584730490%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:09","close":"1","request_ext":"null"},"feedback":{"ext":"{\"gr_ext\":{\"score\":0.060964683157078,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":0,\"gr_user_type\":64,\"all_recall_type\":[35],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":35,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":9,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":-1,\"audit_final_score\":-1,\"news_vr_attention\":\"女人|中式婚服|婚礼记录|\",\"manual_tags\":\"女人,中式婚服,婚礼记录\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":1457569031,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":2,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"3903852615584730490\",\"title\":\"#嘴角向上笑一个吧#\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jkvme3cis7jzy9tv/mda-jkvme3cis7jzy9tv00000.jpg@s_2,w_640,h_1137,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]},"datasign":"17db68a1d7423d726fd8570bc21abaa8"}]}
             * ext_str :
             */

            private ItemlistBean itemlist;
            private String ext_str;

            public ItemlistBean getItemlist() {
                return itemlist;
            }

            public void setItemlist(ItemlistBean itemlist) {
                this.itemlist = itemlist;
            }

            public String getExt_str() {
                return ext_str;
            }

            public void setExt_str(String ext_str) {
                this.ext_str = ext_str;
            }

            public static class ItemlistBean {
                /**
                 * policies : {"auto_refresh_interval":30,"auto_clear_cache_limit":20,"scroll_feedback_interval":60,"remove_duplicate_switch":1,"preload_position":4,"preload_not_wifi_switch":1,"filter_list":{"ts":0,"item":[]},"ad_policy":[]}
                 * items : [{"id":"sv_3835828622578785753","isUserSelf":0,"layout":"mini_video","data":{"id":"sv_3835828622578785753","mode":"video","title":"","video":"https://vd2.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g1.mp4?auth_key=1575533929-0-0-5fdeabf400ada966a0462bcb70cb98b0&bcevod_channel=searchbox_feed","hw":1.778,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%223835828622578785753%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g100000.jpg@s_2,w_640,h_1137,q_80","videoInfo":{"vid":"3835828622578785753","title":"","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g100000.jpg@s_2,w_640,h_1137,q_80","posterImage":"https://vd7.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g100000.jpg@s_2,w_640,h_1137,q_80","posterImageHistory":"https://timgmb02.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=b08a58be7517163141540b110d3bbfce&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2F78b1cd31da862af66e8324e278144c2e.jpg","duration":11,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=3835828622578785753&shared_cuid=AqqqB","webTitle":"[全民小视频]狙击手请开八倍镜发布的精彩小视频","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd2.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g1.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=3835828622578785753&auth_key=1575449329-0-0-8a9f47a8ad30269ef2ab0244c6031351&bcevod_channel=searchbox_feed","videoBps":1746,"videoSize":2.3,"height":960,"width":540,"maxH":0.6,"prefetchSize":670464,"prefetchPageSize":670464}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/b810f3d2c7e9fcbadf09e1d565933de0.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"11","vid":"3835828622578785753","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd2.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g1.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=3835828622578785753&auth_key=1575449329-0-0-8a9f47a8ad30269ef2ab0244c6031351&bcevod_channel=searchbox_feed","size":670464}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%223835828622578785753%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%223835828622578785753%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%223835828622578785753%22%2C%22title%22%3A%22%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkuu9e17hnzh20g1%5C%2Fmda-jkuu9e17hnzh20g100000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkuu9e17hnzh20g1%5C%2Fmda-jkuu9e17hnzh20g100000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb02.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3Db08a58be7517163141540b110d3bbfce%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252F78b1cd31da862af66e8324e278144c2e.jpg%22%2C%22duration%22%3A11%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D3835828622578785753%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%5Cu72d9%5Cu51fb%5Cu624b%5Cu8bf7%5Cu5f00%5Cu516b%5Cu500d%5Cu955c%5Cu53d1%5Cu5e03%5Cu7684%5Cu7cbe%5Cu5f69%5Cu5c0f%5Cu89c6%5Cu9891%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd2.bdstatic.com%5C%2Fmda-jkuu9e17hnzh20g1%5C%2Fmda-jkuu9e17hnzh20g1.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D3835828622578785753%26auth_key%3D1575449329-0-0-8a9f47a8ad30269ef2ab0244c6031351%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A1746%2C%22videoSize%22%3A2.3%2C%22height%22%3A960%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A670464%2C%22prefetchPageSize%22%3A670464%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2Fb810f3d2c7e9fcbadf09e1d565933de0.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%2211%22%2C%22vid%22%3A%223835828622578785753%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%223835828622578785753%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_3835828622578785753%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:11","close":"1","request_ext":"null"},"feedback":{"ext":"{\"gr_ext\":{\"score\":0.17753066790682,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":0.57170826196671,\"gr_user_type\":64,\"all_recall_type\":[72],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":72,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":0,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":-1,\"audit_final_score\":-1,\"news_vr_attention\":\"休闲游戏|\",\"manual_tags\":\"休闲游戏\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":3933373157,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":2,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[55,14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"3835828622578785753\",\"title\":\"\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g100000.jpg@s_2,w_640,h_1137,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]},"datasign":"7c2b3eb912333fa3d69361537c701d76"},{"id":"sv_3796235711496858339","isUserSelf":0,"layout":"mini_video","data":{"id":"sv_3796235711496858339","mode":"video","title":"是不是所有的美女见到帅哥，都是这个表情？","video":"https://vd2.bdstatic.com/mda-jkhwqin3v1t0cn0n/mda-jkhwqin3v1t0cn0n.mp4?auth_key=1575533929-0-0-40e90fc0af1d89369a31b2943c9537b0&bcevod_channel=searchbox_feed","hw":1.763,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%223796235711496858339%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jkhwqin3v1t0cn0n/mda-jkhwqin3v1t0cn0n00000.jpg@s_2,w_640,h_1128,q_80","videoInfo":{"vid":"3796235711496858339","title":"是不是所有的美女见到帅哥，都是这个表情？","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jkhwqin3v1t0cn0n/mda-jkhwqin3v1t0cn0n00000.jpg@s_2,w_640,h_1128,q_80","posterImage":"https://vd7.bdstatic.com/mda-jkhwqin3v1t0cn0n/mda-jkhwqin3v1t0cn0n00000.jpg@s_2,w_640,h_1128,q_80","posterImageHistory":"https://timgmb04.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=958ff3030b66090b7f8d0f92310df353&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2Ff24749c4b14395533216c60c3fe7fb08.jpg","duration":11,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=3796235711496858339&shared_cuid=AqqqB","webTitle":"[全民小视频]是不是所有的美女见到帅哥，都是这个表情？","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd2.bdstatic.com/mda-jkhwqin3v1t0cn0n/mda-jkhwqin3v1t0cn0n.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=3796235711496858339&auth_key=1575449329-0-0-3484904666734672bb7a568b08b1d93a&bcevod_channel=searchbox_feed","videoBps":1111,"videoSize":1.5,"height":952,"width":540,"maxH":0.6,"prefetchSize":426624,"prefetchPageSize":426624}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/358cb0ee7dc7ea5bc5d0c7f9280274f0.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"11","vid":"3796235711496858339","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd2.bdstatic.com/mda-jkhwqin3v1t0cn0n/mda-jkhwqin3v1t0cn0n.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=3796235711496858339&auth_key=1575449329-0-0-3484904666734672bb7a568b08b1d93a&bcevod_channel=searchbox_feed","size":426624}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%223796235711496858339%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%223796235711496858339%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%223796235711496858339%22%2C%22title%22%3A%22%5Cu662f%5Cu4e0d%5Cu662f%5Cu6240%5Cu6709%5Cu7684%5Cu7f8e%5Cu5973%5Cu89c1%5Cu5230%5Cu5e05%5Cu54e5%5Cuff0c%5Cu90fd%5Cu662f%5Cu8fd9%5Cu4e2a%5Cu8868%5Cu60c5%5Cuff1f%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkhwqin3v1t0cn0n%5C%2Fmda-jkhwqin3v1t0cn0n00000.jpg%40s_2%2Cw_640%2Ch_1128%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkhwqin3v1t0cn0n%5C%2Fmda-jkhwqin3v1t0cn0n00000.jpg%40s_2%2Cw_640%2Ch_1128%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb04.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3D958ff3030b66090b7f8d0f92310df353%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252Ff24749c4b14395533216c60c3fe7fb08.jpg%22%2C%22duration%22%3A11%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D3796235711496858339%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%5Cu662f%5Cu4e0d%5Cu662f%5Cu6240%5Cu6709%5Cu7684%5Cu7f8e%5Cu5973%5Cu89c1%5Cu5230%5Cu5e05%5Cu54e5%5Cuff0c%5Cu90fd%5Cu662f%5Cu8fd9%5Cu4e2a%5Cu8868%5Cu60c5%5Cuff1f%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd2.bdstatic.com%5C%2Fmda-jkhwqin3v1t0cn0n%5C%2Fmda-jkhwqin3v1t0cn0n.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D3796235711496858339%26auth_key%3D1575449329-0-0-3484904666734672bb7a568b08b1d93a%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A1111%2C%22videoSize%22%3A1.5%2C%22height%22%3A952%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A426624%2C%22prefetchPageSize%22%3A426624%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2F358cb0ee7dc7ea5bc5d0c7f9280274f0.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%2211%22%2C%22vid%22%3A%223796235711496858339%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%223796235711496858339%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_3796235711496858339%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:11","close":"1","request_ext":"null"},"feedback":{"ext":"{\"gr_ext\":{\"score\":0.21066383833514,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":0.048583511263132,\"gr_user_type\":64,\"all_recall_type\":[402],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":402,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":1,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":-1,\"audit_final_score\":-1,\"news_vr_attention\":\"女人|服饰穿搭|\",\"news_style_super\":\"画风粗劣\",\"manual_tags\":\"女人,服饰穿搭\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":2784037743,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":2,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"3796235711496858339\",\"title\":\"是不是所有的美女见到帅哥，都是这个表情？\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jkhwqin3v1t0cn0n/mda-jkhwqin3v1t0cn0n00000.jpg@s_2,w_640,h_1128,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]},"datasign":"82e957239642891c041dd6f5ddd08bb9"},{"id":"sv_5238213849808179536","isUserSelf":0,"layout":"mini_video","data":{"id":"sv_5238213849808179536","mode":"video","title":"","video":"https://vd2.bdstatic.com/mda-jkemr6drs81nbrk3/mda-jkemr6drs81nbrk3.mp4?auth_key=1575533929-0-0-81dd721e906143e73e6d93e2b7c627a0&bcevod_channel=searchbox_feed","hw":1.763,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%225238213849808179536%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jkemr6drs81nbrk3/mda-jkemr6drs81nbrk300000.jpg@s_2,w_640,h_1128,q_80","videoInfo":{"vid":"5238213849808179536","title":"","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jkemr6drs81nbrk3/mda-jkemr6drs81nbrk300000.jpg@s_2,w_640,h_1128,q_80","posterImage":"https://vd7.bdstatic.com/mda-jkemr6drs81nbrk3/mda-jkemr6drs81nbrk300000.jpg@s_2,w_640,h_1128,q_80","posterImageHistory":"https://timgmb.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=3d75fca6c0ffac08452a7de96b955a0b&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2Fbb838a20994f75ab4875a3ef79d65b78","duration":7,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=5238213849808179536&shared_cuid=AqqqB","webTitle":"[全民小视频]周氏康复理疗馆发布的精彩小视频","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd2.bdstatic.com/mda-jkemr6drs81nbrk3/mda-jkemr6drs81nbrk3.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=5238213849808179536&auth_key=1575449329-0-0-04d612c7ded15226e5f63a1b22c97f95&bcevod_channel=searchbox_feed","videoBps":1096,"videoSize":0.9,"height":952,"width":540,"maxH":0.6,"prefetchSize":420864,"prefetchPageSize":420864}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/79c805bad4b234b3609bee59a546dd22.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"7","vid":"5238213849808179536","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd2.bdstatic.com/mda-jkemr6drs81nbrk3/mda-jkemr6drs81nbrk3.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=5238213849808179536&auth_key=1575449329-0-0-04d612c7ded15226e5f63a1b22c97f95&bcevod_channel=searchbox_feed","size":420864}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%225238213849808179536%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%225238213849808179536%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%225238213849808179536%22%2C%22title%22%3A%22%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkemr6drs81nbrk3%5C%2Fmda-jkemr6drs81nbrk300000.jpg%40s_2%2Cw_640%2Ch_1128%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkemr6drs81nbrk3%5C%2Fmda-jkemr6drs81nbrk300000.jpg%40s_2%2Cw_640%2Ch_1128%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3D3d75fca6c0ffac08452a7de96b955a0b%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252Fbb838a20994f75ab4875a3ef79d65b78%22%2C%22duration%22%3A7%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D5238213849808179536%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%5Cu5468%5Cu6c0f%5Cu5eb7%5Cu590d%5Cu7406%5Cu7597%5Cu9986%5Cu53d1%5Cu5e03%5Cu7684%5Cu7cbe%5Cu5f69%5Cu5c0f%5Cu89c6%5Cu9891%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd2.bdstatic.com%5C%2Fmda-jkemr6drs81nbrk3%5C%2Fmda-jkemr6drs81nbrk3.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D5238213849808179536%26auth_key%3D1575449329-0-0-04d612c7ded15226e5f63a1b22c97f95%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A1096%2C%22videoSize%22%3A0.9%2C%22height%22%3A952%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A420864%2C%22prefetchPageSize%22%3A420864%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2F79c805bad4b234b3609bee59a546dd22.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%227%22%2C%22vid%22%3A%225238213849808179536%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%225238213849808179536%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_5238213849808179536%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:07","close":"1","request_ext":"null"},"feedback":{"ext":"{\"gr_ext\":{\"score\":0.052552634305817,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":0.048190910369158,\"gr_user_type\":64,\"all_recall_type\":[97],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":97,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":2,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":3,\"audit_final_score\":-1,\"news_vr_attention\":\"理疗按摩|\",\"manual_tags\":\"理疗按摩\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":3383603596,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":3,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"5238213849808179536\",\"title\":\"\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jkemr6drs81nbrk3/mda-jkemr6drs81nbrk300000.jpg@s_2,w_640,h_1128,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]},"datasign":"2910faf5929708ebfed4b7d301bdf89e"},{"id":"sv_5400875179016304022","isUserSelf":0,"layout":"mini_video","data":{"id":"sv_5400875179016304022","mode":"video","title":"美女遇到这种事，你咋好意思走的呢","video":"https://vd4.bdstatic.com/mda-jm0t41qbs4uacafw/mda-jm0t41qbs4uacafw.mp4?auth_key=1575533929-0-0-e447ffb138ecac430f3085a86c3ed3be&bcevod_channel=searchbox_feed","hw":1.778,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%225400875179016304022%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jm0t41qbs4uacafw/mda-jm0t41qbs4uacafw00000.jpg@s_2,w_640,h_1137,q_80","videoInfo":{"vid":"5400875179016304022","title":"美女遇到这种事，你咋好意思走的呢","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jm0t41qbs4uacafw/mda-jm0t41qbs4uacafw00000.jpg@s_2,w_640,h_1137,q_80","posterImage":"https://vd7.bdstatic.com/mda-jm0t41qbs4uacafw/mda-jm0t41qbs4uacafw00000.jpg@s_2,w_640,h_1137,q_80","posterImageHistory":"https://timgmb04.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=542edc3ad775e2a842346a7d5567d3a8&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2F5f27e2bcaa80ee8f8707a451fae88a9e.jpg","duration":15,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=5400875179016304022&shared_cuid=AqqqB","webTitle":"[全民小视频]美女遇到这种事，你咋好意思走的呢","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd4.bdstatic.com/mda-jm0t41qbs4uacafw/mda-jm0t41qbs4uacafw.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=5400875179016304022&auth_key=1575449329-0-0-9a7fd558e354a4666fde4ccebc03f5aa&bcevod_channel=searchbox_feed","videoBps":1036,"videoSize":1.9,"height":960,"width":540,"maxH":0.6,"prefetchSize":397824,"prefetchPageSize":397824}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/ae09148c53ae30aafc43c73ec6dc2a28.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"15","vid":"5400875179016304022","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd4.bdstatic.com/mda-jm0t41qbs4uacafw/mda-jm0t41qbs4uacafw.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=5400875179016304022&auth_key=1575449329-0-0-9a7fd558e354a4666fde4ccebc03f5aa&bcevod_channel=searchbox_feed","size":397824}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%225400875179016304022%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%225400875179016304022%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%225400875179016304022%22%2C%22title%22%3A%22%5Cu7f8e%5Cu5973%5Cu9047%5Cu5230%5Cu8fd9%5Cu79cd%5Cu4e8b%5Cuff0c%5Cu4f60%5Cu548b%5Cu597d%5Cu610f%5Cu601d%5Cu8d70%5Cu7684%5Cu5462%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jm0t41qbs4uacafw%5C%2Fmda-jm0t41qbs4uacafw00000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jm0t41qbs4uacafw%5C%2Fmda-jm0t41qbs4uacafw00000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb04.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3D542edc3ad775e2a842346a7d5567d3a8%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252F5f27e2bcaa80ee8f8707a451fae88a9e.jpg%22%2C%22duration%22%3A15%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D5400875179016304022%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%5Cu7f8e%5Cu5973%5Cu9047%5Cu5230%5Cu8fd9%5Cu79cd%5Cu4e8b%5Cuff0c%5Cu4f60%5Cu548b%5Cu597d%5Cu610f%5Cu601d%5Cu8d70%5Cu7684%5Cu5462%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd4.bdstatic.com%5C%2Fmda-jm0t41qbs4uacafw%5C%2Fmda-jm0t41qbs4uacafw.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D5400875179016304022%26auth_key%3D1575449329-0-0-9a7fd558e354a4666fde4ccebc03f5aa%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A1036%2C%22videoSize%22%3A1.9%2C%22height%22%3A960%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A397824%2C%22prefetchPageSize%22%3A397824%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2Fae09148c53ae30aafc43c73ec6dc2a28.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%2215%22%2C%22vid%22%3A%225400875179016304022%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%225400875179016304022%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_5400875179016304022%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:15","close":"1","request_ext":"null"},"feedback":{"ext":"{\"gr_ext\":{\"score\":0.028439058505413,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":0,\"gr_user_type\":64,\"all_recall_type\":[35],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":35,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":3,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":-1,\"audit_final_score\":-1,\"news_vr_attention\":\"女人|\",\"news_style_super\":\"画风粗劣\",\"manual_tags\":\"女人\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":2891561635,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":2,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"5400875179016304022\",\"title\":\"美女遇到这种事，你咋好意思走的呢\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jm0t41qbs4uacafw/mda-jm0t41qbs4uacafw00000.jpg@s_2,w_640,h_1137,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]},"datasign":"33849427f1783697a9ec2e7b96674ff9"},{"id":"sv_4157390170071796864","isUserSelf":0,"layout":"mini_video","data":{"id":"sv_4157390170071796864","mode":"video","title":"","video":"https://vd3.bdstatic.com/mda-jm0r6e957behw8by/mda-jm0r6e957behw8by.mp4?auth_key=1575533929-0-0-c271bb4037acc94782c7708846bcfd2e&bcevod_channel=searchbox_feed","hw":1.778,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%224157390170071796864%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jm0r6e957behw8by/mda-jm0r6e957behw8by00000.jpg@s_2,w_640,h_1137,q_80","videoInfo":{"vid":"4157390170071796864","title":"","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jm0r6e957behw8by/mda-jm0r6e957behw8by00000.jpg@s_2,w_640,h_1137,q_80","posterImage":"https://vd7.bdstatic.com/mda-jm0r6e957behw8by/mda-jm0r6e957behw8by00000.jpg@s_2,w_640,h_1137,q_80","posterImageHistory":"https://timgmb.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=c86f5a7075fcd71de438f8f8a8cb1c27&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2F390bc6850b6e17094f47a5327052968f","duration":7,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=4157390170071796864&shared_cuid=AqqqB","webTitle":"[全民小视频]关氏正骨培训发布的精彩小视频","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd3.bdstatic.com/mda-jm0r6e957behw8by/mda-jm0r6e957behw8by.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=4157390170071796864&auth_key=1575449329-0-0-331263adfd87f9641c983664adf4055f&bcevod_channel=searchbox_feed","videoBps":1069,"videoSize":0.9,"height":960,"width":540,"maxH":0.6,"prefetchSize":410496,"prefetchPageSize":410496}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/7d3c11ec6246ab0755a09aa07daeb45d.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"7","vid":"4157390170071796864","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd3.bdstatic.com/mda-jm0r6e957behw8by/mda-jm0r6e957behw8by.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=4157390170071796864&auth_key=1575449329-0-0-331263adfd87f9641c983664adf4055f&bcevod_channel=searchbox_feed","size":410496}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%224157390170071796864%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%224157390170071796864%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%224157390170071796864%22%2C%22title%22%3A%22%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jm0r6e957behw8by%5C%2Fmda-jm0r6e957behw8by00000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jm0r6e957behw8by%5C%2Fmda-jm0r6e957behw8by00000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3Dc86f5a7075fcd71de438f8f8a8cb1c27%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252F390bc6850b6e17094f47a5327052968f%22%2C%22duration%22%3A7%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D4157390170071796864%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%5Cu5173%5Cu6c0f%5Cu6b63%5Cu9aa8%5Cu57f9%5Cu8bad%5Cu53d1%5Cu5e03%5Cu7684%5Cu7cbe%5Cu5f69%5Cu5c0f%5Cu89c6%5Cu9891%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd3.bdstatic.com%5C%2Fmda-jm0r6e957behw8by%5C%2Fmda-jm0r6e957behw8by.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D4157390170071796864%26auth_key%3D1575449329-0-0-331263adfd87f9641c983664adf4055f%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A1069%2C%22videoSize%22%3A0.9%2C%22height%22%3A960%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A410496%2C%22prefetchPageSize%22%3A410496%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2F7d3c11ec6246ab0755a09aa07daeb45d.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%227%22%2C%22vid%22%3A%224157390170071796864%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%224157390170071796864%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_4157390170071796864%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:07","close":"1","request_ext":"null"},"feedback":{"ext":"{\"gr_ext\":{\"score\":0.042153816742289,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":0.048451613634825,\"gr_user_type\":64,\"all_recall_type\":[97],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":97,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":4,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":-1,\"audit_final_score\":-1,\"news_vr_attention\":\"室内|卧室|理疗按摩|\",\"news_style_super\":\"画风粗劣\",\"manual_tags\":\"室内,卧室,理疗按摩\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":3895413614,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":2,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"4157390170071796864\",\"title\":\"\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jm0r6e957behw8by/mda-jm0r6e957behw8by00000.jpg@s_2,w_640,h_1137,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]},"datasign":"3dd50e0aa6664936350222d3c8457b5a"},{"id":"sv_4158927437571907946","isUserSelf":0,"layout":"mini_video","data":{"id":"sv_4158927437571907946","mode":"video","title":"😃","video":"https://vd2.bdstatic.com/mda-jkjxu3krs0khy4f2/mda-jkjxu3krs0khy4f2.mp4?auth_key=1575533929-0-0-6e75ee93c777ddfb421de346d353645e&bcevod_channel=searchbox_feed","hw":1.763,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%224158927437571907946%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jkjxu3krs0khy4f2/mda-jkjxu3krs0khy4f200000.jpg@s_2,w_640,h_1128,q_80","videoInfo":{"vid":"4158927437571907946","title":"#秀恩爱#😃","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jkjxu3krs0khy4f2/mda-jkjxu3krs0khy4f200000.jpg@s_2,w_640,h_1128,q_80","posterImage":"https://vd7.bdstatic.com/mda-jkjxu3krs0khy4f2/mda-jkjxu3krs0khy4f200000.jpg@s_2,w_640,h_1128,q_80","posterImageHistory":"https://timgmb01.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=5a3c9f48da2672492b6a70e88ddb6d52&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2F66de9c06438666d515e7051a1a9e43b8.jpg","duration":11,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=4158927437571907946&shared_cuid=AqqqB","webTitle":"[全民小视频]😃","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd2.bdstatic.com/mda-jkjxu3krs0khy4f2/mda-jkjxu3krs0khy4f2.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=4158927437571907946&auth_key=1575449329-0-0-5393bc5c518b6e861b2c12d8aae03d9e&bcevod_channel=searchbox_feed","videoBps":1137,"videoSize":1.5,"height":952,"width":540,"maxH":0.6,"prefetchSize":436608,"prefetchPageSize":436608}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/c5ceb40e8d8c03664d7413235ec934ab.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"11","vid":"4158927437571907946","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd2.bdstatic.com/mda-jkjxu3krs0khy4f2/mda-jkjxu3krs0khy4f2.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=4158927437571907946&auth_key=1575449329-0-0-5393bc5c518b6e861b2c12d8aae03d9e&bcevod_channel=searchbox_feed","size":436608}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%224158927437571907946%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%224158927437571907946%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%224158927437571907946%22%2C%22title%22%3A%22%23%5Cu79c0%5Cu6069%5Cu7231%23%5Cud83d%5Cude03%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkjxu3krs0khy4f2%5C%2Fmda-jkjxu3krs0khy4f200000.jpg%40s_2%2Cw_640%2Ch_1128%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkjxu3krs0khy4f2%5C%2Fmda-jkjxu3krs0khy4f200000.jpg%40s_2%2Cw_640%2Ch_1128%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb01.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3D5a3c9f48da2672492b6a70e88ddb6d52%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252F66de9c06438666d515e7051a1a9e43b8.jpg%22%2C%22duration%22%3A11%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D4158927437571907946%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%5Cud83d%5Cude03%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd2.bdstatic.com%5C%2Fmda-jkjxu3krs0khy4f2%5C%2Fmda-jkjxu3krs0khy4f2.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D4158927437571907946%26auth_key%3D1575449329-0-0-5393bc5c518b6e861b2c12d8aae03d9e%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A1137%2C%22videoSize%22%3A1.5%2C%22height%22%3A952%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A436608%2C%22prefetchPageSize%22%3A436608%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2Fc5ceb40e8d8c03664d7413235ec934ab.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%2211%22%2C%22vid%22%3A%224158927437571907946%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%224158927437571907946%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_4158927437571907946%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:11","close":"1","request_ext":"null"},"feedback":{"ext":"{\"gr_ext\":{\"score\":0.052486075772122,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":0.31787005066872,\"gr_user_type\":64,\"all_recall_type\":[41],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":41,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":5,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":-1,\"audit_final_score\":-1,\"news_vr_attention\":\"女人|城市户外|秀恩爱|\",\"manual_tags\":\"女人,城市户外,秀恩爱\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":4283163785,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":2,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"4158927437571907946\",\"title\":\"#秀恩爱#😃\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jkjxu3krs0khy4f2/mda-jkjxu3krs0khy4f200000.jpg@s_2,w_640,h_1128,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]},"datasign":"167d02a978c8e87e64da9bae6de18689"},{"id":"sv_4967953397619485872","isUserSelf":0,"layout":"mini_video","data":{"id":"sv_4967953397619485872","mode":"video","title":"#万物皆可涮#","video":"https://vd4.bdstatic.com/mda-jm2wwbb5zggptdnk/mda-jm2wwbb5zggptdnk.mp4?auth_key=1575533929-0-0-ad8a60e954e48c8130ae8cfba1c780c0&bcevod_channel=searchbox_feed","hw":1.778,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%224967953397619485872%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jm2wwbb5zggptdnk/mda-jm2wwbb5zggptdnk00000.jpg@s_2,w_640,h_1137,q_80","videoInfo":{"vid":"4967953397619485872","title":"#万物皆可涮#","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jm2wwbb5zggptdnk/mda-jm2wwbb5zggptdnk00000.jpg@s_2,w_640,h_1137,q_80","posterImage":"https://vd7.bdstatic.com/mda-jm2wwbb5zggptdnk/mda-jm2wwbb5zggptdnk00000.jpg@s_2,w_640,h_1137,q_80","posterImageHistory":"https://timgmb05.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=3d7cbe781441385574165bc1f149589a&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2F7cc22e1ed250b4eca2264e32beb46a79.jpg","duration":16,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=4967953397619485872&shared_cuid=AqqqB","webTitle":"[全民小视频]","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd4.bdstatic.com/mda-jm2wwbb5zggptdnk/mda-jm2wwbb5zggptdnk.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=4967953397619485872&auth_key=1575449329-0-0-6d1b7e4bead14bf493ccfa91bfc1f9dd&bcevod_channel=searchbox_feed","videoBps":439,"videoSize":0.9,"height":960,"width":540,"maxH":0.6,"prefetchSize":168576,"prefetchPageSize":168576}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/0b7cb942ee29180828a48a720b1fb838.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"16","vid":"4967953397619485872","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd4.bdstatic.com/mda-jm2wwbb5zggptdnk/mda-jm2wwbb5zggptdnk.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=4967953397619485872&auth_key=1575449329-0-0-6d1b7e4bead14bf493ccfa91bfc1f9dd&bcevod_channel=searchbox_feed","size":168576}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%224967953397619485872%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%224967953397619485872%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%224967953397619485872%22%2C%22title%22%3A%22%23%5Cu4e07%5Cu7269%5Cu7686%5Cu53ef%5Cu6dae%23%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jm2wwbb5zggptdnk%5C%2Fmda-jm2wwbb5zggptdnk00000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jm2wwbb5zggptdnk%5C%2Fmda-jm2wwbb5zggptdnk00000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb05.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3D3d7cbe781441385574165bc1f149589a%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252F7cc22e1ed250b4eca2264e32beb46a79.jpg%22%2C%22duration%22%3A16%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D4967953397619485872%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd4.bdstatic.com%5C%2Fmda-jm2wwbb5zggptdnk%5C%2Fmda-jm2wwbb5zggptdnk.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D4967953397619485872%26auth_key%3D1575449329-0-0-6d1b7e4bead14bf493ccfa91bfc1f9dd%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A439%2C%22videoSize%22%3A0.9%2C%22height%22%3A960%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A168576%2C%22prefetchPageSize%22%3A168576%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2F0b7cb942ee29180828a48a720b1fb838.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%2216%22%2C%22vid%22%3A%224967953397619485872%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%224967953397619485872%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_4967953397619485872%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:16","close":"1","request_ext":"null"},"feedback":{"ext":"{\"gr_ext\":{\"score\":0.015099962169264,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":1.1563102006912,\"gr_user_type\":64,\"all_recall_type\":[170],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":170,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":6,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":-1,\"audit_final_score\":-1,\"news_vr_attention\":\"旅游休闲|古建筑|\",\"news_style_super\":\"画风粗劣\",\"manual_tags\":\"旅游休闲,古建筑\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":1146459383,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":1,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"4967953397619485872\",\"title\":\"#万物皆可涮#\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jm2wwbb5zggptdnk/mda-jm2wwbb5zggptdnk00000.jpg@s_2,w_640,h_1137,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]},"datasign":"799f95e9eed54895013d29fe79fe3e94"},{"id":"sv_5089424448597375004","isUserSelf":0,"layout":"mini_video","data":{"id":"sv_5089424448597375004","mode":"video","title":"车美人美","video":"https://vd3.bdstatic.com/mda-jkuiti0hbh4r3su6/mda-jkuiti0hbh4r3su6.mp4?auth_key=1575533929-0-0-a713a352019a6e4f87ee1a9b557a05cd&bcevod_channel=searchbox_feed","hw":1.778,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%225089424448597375004%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jkuiti0hbh4r3su6/mda-jkuiti0hbh4r3su600000.jpg@s_2,w_640,h_1137,q_80","videoInfo":{"vid":"5089424448597375004","title":"车美人美","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jkuiti0hbh4r3su6/mda-jkuiti0hbh4r3su600000.jpg@s_2,w_640,h_1137,q_80","posterImage":"https://vd7.bdstatic.com/mda-jkuiti0hbh4r3su6/mda-jkuiti0hbh4r3su600000.jpg@s_2,w_640,h_1137,q_80","posterImageHistory":"https://timgmb03.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=6aa7297b5c96f61eec9eb73bc330b78a&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2F81ff6411b2a20e46e3c41061542990c3","duration":7,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=5089424448597375004&shared_cuid=AqqqB","webTitle":"[全民小视频]车美人美","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd3.bdstatic.com/mda-jkuiti0hbh4r3su6/mda-jkuiti0hbh4r3su6.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=5089424448597375004&auth_key=1575449329-0-0-bd6025c51d0450a8557a205b9e4fb048&bcevod_channel=searchbox_feed","videoBps":1452,"videoSize":1.2,"height":960,"width":540,"maxH":0.6,"prefetchSize":557568,"prefetchPageSize":557568}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/e8ac9de6ff7e4d3fd12842a1c8391b16.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"7","vid":"5089424448597375004","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd3.bdstatic.com/mda-jkuiti0hbh4r3su6/mda-jkuiti0hbh4r3su6.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=5089424448597375004&auth_key=1575449329-0-0-bd6025c51d0450a8557a205b9e4fb048&bcevod_channel=searchbox_feed","size":557568}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%225089424448597375004%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%225089424448597375004%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%225089424448597375004%22%2C%22title%22%3A%22%5Cu8f66%5Cu7f8e%5Cu4eba%5Cu7f8e%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkuiti0hbh4r3su6%5C%2Fmda-jkuiti0hbh4r3su600000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkuiti0hbh4r3su6%5C%2Fmda-jkuiti0hbh4r3su600000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb03.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3D6aa7297b5c96f61eec9eb73bc330b78a%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252F81ff6411b2a20e46e3c41061542990c3%22%2C%22duration%22%3A7%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D5089424448597375004%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%5Cu8f66%5Cu7f8e%5Cu4eba%5Cu7f8e%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd3.bdstatic.com%5C%2Fmda-jkuiti0hbh4r3su6%5C%2Fmda-jkuiti0hbh4r3su6.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D5089424448597375004%26auth_key%3D1575449329-0-0-bd6025c51d0450a8557a205b9e4fb048%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A1452%2C%22videoSize%22%3A1.2%2C%22height%22%3A960%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A557568%2C%22prefetchPageSize%22%3A557568%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2Fe8ac9de6ff7e4d3fd12842a1c8391b16.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%227%22%2C%22vid%22%3A%225089424448597375004%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%225089424448597375004%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_5089424448597375004%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:07","close":"1","request_ext":"null"},"feedback":{"ext":"{\"gr_ext\":{\"score\":0.24587772521721,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":1.0736025571823,\"gr_user_type\":64,\"all_recall_type\":[44],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":44,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":7,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":-1,\"audit_final_score\":-1,\"news_vr_attention\":\"女人|美女|车展|\",\"manual_tags\":\"女人,美女,车展\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":4126470550,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":2,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"5089424448597375004\",\"title\":\"车美人美\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jkuiti0hbh4r3su6/mda-jkuiti0hbh4r3su600000.jpg@s_2,w_640,h_1137,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]},"datasign":"96b973877d2527e5888fc71a5b1d4bd6"},{"id":"sv_4362492918553500470","isUserSelf":0,"layout":"mini_video","data":{"id":"sv_4362492918553500470","mode":"video","title":"#篮球女孩#弟弟，这球进了我做你女朋友","video":"https://vd2.bdstatic.com/mda-jm0sx7z951inf8mg/mda-jm0sx7z951inf8mg.mp4?auth_key=1575533929-0-0-523f0d26a8c5d651e40891e9e82250d1&bcevod_channel=searchbox_feed","hw":1.778,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%224362492918553500470%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jm0sx7z951inf8mg/mda-jm0sx7z951inf8mg00000.jpg@s_2,w_640,h_1137,q_80","videoInfo":{"vid":"4362492918553500470","title":"#篮球女孩#弟弟，这球进了我做你女朋友","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jm0sx7z951inf8mg/mda-jm0sx7z951inf8mg00000.jpg@s_2,w_640,h_1137,q_80","posterImage":"https://vd7.bdstatic.com/mda-jm0sx7z951inf8mg/mda-jm0sx7z951inf8mg00000.jpg@s_2,w_640,h_1137,q_80","posterImageHistory":"https://timgmb05.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=0ff51e0b5f166627346fde64eb52f271&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2F8003dea426e81cbd2c803041efab3026.jpg","duration":16,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=4362492918553500470&shared_cuid=AqqqB","webTitle":"[全民小视频]弟弟，这球进了我做你女朋友","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd2.bdstatic.com/mda-jm0sx7z951inf8mg/mda-jm0sx7z951inf8mg.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=4362492918553500470&auth_key=1575449329-0-0-2fbd039332e6442c22592b58bba4f866&bcevod_channel=searchbox_feed","videoBps":1352,"videoSize":2.6,"height":960,"width":540,"maxH":0.6,"prefetchSize":519168,"prefetchPageSize":519168}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/a31d0fc69d2f4c9fafe957829eb72d6c.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"16","vid":"4362492918553500470","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd2.bdstatic.com/mda-jm0sx7z951inf8mg/mda-jm0sx7z951inf8mg.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=4362492918553500470&auth_key=1575449329-0-0-2fbd039332e6442c22592b58bba4f866&bcevod_channel=searchbox_feed","size":519168}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%224362492918553500470%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%224362492918553500470%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%224362492918553500470%22%2C%22title%22%3A%22%23%5Cu7bee%5Cu7403%5Cu5973%5Cu5b69%23%5Cu5f1f%5Cu5f1f%5Cuff0c%5Cu8fd9%5Cu7403%5Cu8fdb%5Cu4e86%5Cu6211%5Cu505a%5Cu4f60%5Cu5973%5Cu670b%5Cu53cb%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jm0sx7z951inf8mg%5C%2Fmda-jm0sx7z951inf8mg00000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jm0sx7z951inf8mg%5C%2Fmda-jm0sx7z951inf8mg00000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb05.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3D0ff51e0b5f166627346fde64eb52f271%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252F8003dea426e81cbd2c803041efab3026.jpg%22%2C%22duration%22%3A16%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D4362492918553500470%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%5Cu5f1f%5Cu5f1f%5Cuff0c%5Cu8fd9%5Cu7403%5Cu8fdb%5Cu4e86%5Cu6211%5Cu505a%5Cu4f60%5Cu5973%5Cu670b%5Cu53cb%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd2.bdstatic.com%5C%2Fmda-jm0sx7z951inf8mg%5C%2Fmda-jm0sx7z951inf8mg.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D4362492918553500470%26auth_key%3D1575449329-0-0-2fbd039332e6442c22592b58bba4f866%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A1352%2C%22videoSize%22%3A2.6%2C%22height%22%3A960%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A519168%2C%22prefetchPageSize%22%3A519168%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2Fa31d0fc69d2f4c9fafe957829eb72d6c.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%2216%22%2C%22vid%22%3A%224362492918553500470%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%224362492918553500470%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_4362492918553500470%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:16","close":"1","request_ext":"null"},"feedback":{"ext":"{\"gr_ext\":{\"score\":0.061601844978005,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":0.30274057388306,\"gr_user_type\":64,\"all_recall_type\":[50,44],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":50,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":8,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":-1,\"audit_final_score\":-1,\"news_vr_attention\":\"篮球|女人|篮球场|\",\"news_style_super\":\"画风粗劣\",\"manual_tags\":\"篮球,女人,篮球场\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":920702702,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":2,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"4362492918553500470\",\"title\":\"#篮球女孩#弟弟，这球进了我做你女朋友\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jm0sx7z951inf8mg/mda-jm0sx7z951inf8mg00000.jpg@s_2,w_640,h_1137,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]},"datasign":"0f9b61b70b8210e71c6002fd7956a73c"},{"id":"sv_3903852615584730490","isUserSelf":0,"layout":"mini_video","data":{"id":"sv_3903852615584730490","mode":"video","title":"#嘴角向上笑一个吧#","video":"https://vd2.bdstatic.com/mda-jkvme3cis7jzy9tv/mda-jkvme3cis7jzy9tv.mp4?auth_key=1575533929-0-0-16220c14b97fb34d469a0ce209e506d8&bcevod_channel=searchbox_feed","hw":1.778,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%223903852615584730490%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jkvme3cis7jzy9tv/mda-jkvme3cis7jzy9tv00000.jpg@s_2,w_640,h_1137,q_80","videoInfo":{"vid":"3903852615584730490","title":"#嘴角向上笑一个吧#","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jkvme3cis7jzy9tv/mda-jkvme3cis7jzy9tv00000.jpg@s_2,w_640,h_1137,q_80","posterImage":"https://vd7.bdstatic.com/mda-jkvme3cis7jzy9tv/mda-jkvme3cis7jzy9tv00000.jpg@s_2,w_640,h_1137,q_80","posterImageHistory":"https://timgmb05.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=a38d32937af7991f1600bd0e27ad0fa3&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2F19e5f9fc3c39f620228643bb06b55348.jpg","duration":9,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=3903852615584730490&shared_cuid=AqqqB","webTitle":"[全民小视频]","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd2.bdstatic.com/mda-jkvme3cis7jzy9tv/mda-jkvme3cis7jzy9tv.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=3903852615584730490&auth_key=1575449329-0-0-aa3a2771a531f307aefcb3771209e0d1&bcevod_channel=searchbox_feed","videoBps":1360,"videoSize":1.5,"height":960,"width":540,"maxH":0.6,"prefetchSize":522240,"prefetchPageSize":522240}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/70e3decd79e17948374b55050d1178cd.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"9","vid":"3903852615584730490","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd2.bdstatic.com/mda-jkvme3cis7jzy9tv/mda-jkvme3cis7jzy9tv.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=3903852615584730490&auth_key=1575449329-0-0-aa3a2771a531f307aefcb3771209e0d1&bcevod_channel=searchbox_feed","size":522240}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%223903852615584730490%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%223903852615584730490%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%223903852615584730490%22%2C%22title%22%3A%22%23%5Cu5634%5Cu89d2%5Cu5411%5Cu4e0a%5Cu7b11%5Cu4e00%5Cu4e2a%5Cu5427%23%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkvme3cis7jzy9tv%5C%2Fmda-jkvme3cis7jzy9tv00000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkvme3cis7jzy9tv%5C%2Fmda-jkvme3cis7jzy9tv00000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb05.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3Da38d32937af7991f1600bd0e27ad0fa3%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252F19e5f9fc3c39f620228643bb06b55348.jpg%22%2C%22duration%22%3A9%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D3903852615584730490%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd2.bdstatic.com%5C%2Fmda-jkvme3cis7jzy9tv%5C%2Fmda-jkvme3cis7jzy9tv.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D3903852615584730490%26auth_key%3D1575449329-0-0-aa3a2771a531f307aefcb3771209e0d1%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A1360%2C%22videoSize%22%3A1.5%2C%22height%22%3A960%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A522240%2C%22prefetchPageSize%22%3A522240%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2F70e3decd79e17948374b55050d1178cd.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%229%22%2C%22vid%22%3A%223903852615584730490%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%223903852615584730490%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_3903852615584730490%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:09","close":"1","request_ext":"null"},"feedback":{"ext":"{\"gr_ext\":{\"score\":0.060964683157078,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":0,\"gr_user_type\":64,\"all_recall_type\":[35],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":35,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":9,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":-1,\"audit_final_score\":-1,\"news_vr_attention\":\"女人|中式婚服|婚礼记录|\",\"manual_tags\":\"女人,中式婚服,婚礼记录\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":1457569031,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":2,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"3903852615584730490\",\"title\":\"#嘴角向上笑一个吧#\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jkvme3cis7jzy9tv/mda-jkvme3cis7jzy9tv00000.jpg@s_2,w_640,h_1137,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]},"datasign":"17db68a1d7423d726fd8570bc21abaa8"}]
                 */

                private PoliciesBean policies;
                private List<ItemsBean> items;

                public PoliciesBean getPolicies() {
                    return policies;
                }

                public void setPolicies(PoliciesBean policies) {
                    this.policies = policies;
                }

                public List<ItemsBean> getItems() {
                    return items;
                }

                public void setItems(List<ItemsBean> items) {
                    this.items = items;
                }

                public static class PoliciesBean {
                    /**
                     * auto_refresh_interval : 30
                     * auto_clear_cache_limit : 20
                     * scroll_feedback_interval : 60
                     * remove_duplicate_switch : 1
                     * preload_position : 4
                     * preload_not_wifi_switch : 1
                     * filter_list : {"ts":0,"item":[]}
                     * ad_policy : []
                     */

                    private int auto_refresh_interval;
                    private int auto_clear_cache_limit;
                    private int scroll_feedback_interval;
                    private int remove_duplicate_switch;
                    private int preload_position;
                    private int preload_not_wifi_switch;
                    private FilterListBean filter_list;
                    private List<?> ad_policy;

                    public int getAuto_refresh_interval() {
                        return auto_refresh_interval;
                    }

                    public void setAuto_refresh_interval(int auto_refresh_interval) {
                        this.auto_refresh_interval = auto_refresh_interval;
                    }

                    public int getAuto_clear_cache_limit() {
                        return auto_clear_cache_limit;
                    }

                    public void setAuto_clear_cache_limit(int auto_clear_cache_limit) {
                        this.auto_clear_cache_limit = auto_clear_cache_limit;
                    }

                    public int getScroll_feedback_interval() {
                        return scroll_feedback_interval;
                    }

                    public void setScroll_feedback_interval(int scroll_feedback_interval) {
                        this.scroll_feedback_interval = scroll_feedback_interval;
                    }

                    public int getRemove_duplicate_switch() {
                        return remove_duplicate_switch;
                    }

                    public void setRemove_duplicate_switch(int remove_duplicate_switch) {
                        this.remove_duplicate_switch = remove_duplicate_switch;
                    }

                    public int getPreload_position() {
                        return preload_position;
                    }

                    public void setPreload_position(int preload_position) {
                        this.preload_position = preload_position;
                    }

                    public int getPreload_not_wifi_switch() {
                        return preload_not_wifi_switch;
                    }

                    public void setPreload_not_wifi_switch(int preload_not_wifi_switch) {
                        this.preload_not_wifi_switch = preload_not_wifi_switch;
                    }

                    public FilterListBean getFilter_list() {
                        return filter_list;
                    }

                    public void setFilter_list(FilterListBean filter_list) {
                        this.filter_list = filter_list;
                    }

                    public List<?> getAd_policy() {
                        return ad_policy;
                    }

                    public void setAd_policy(List<?> ad_policy) {
                        this.ad_policy = ad_policy;
                    }

                    public static class FilterListBean {
                        /**
                         * ts : 0
                         * item : []
                         */

                        private int ts;
                        private List<?> item;

                        public int getTs() {
                            return ts;
                        }

                        public void setTs(int ts) {
                            this.ts = ts;
                        }

                        public List<?> getItem() {
                            return item;
                        }

                        public void setItem(List<?> item) {
                            this.item = item;
                        }
                    }
                }

                public static class ItemsBean {
                    /**
                     * id : sv_3835828622578785753
                     * isUserSelf : 0
                     * layout : mini_video
                     * data : {"id":"sv_3835828622578785753","mode":"video","title":"","video":"https://vd2.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g1.mp4?auth_key=1575533929-0-0-5fdeabf400ada966a0462bcb70cb98b0&bcevod_channel=searchbox_feed","hw":1.778,"gif":"","iconList":[{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%223835828622578785753%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}],"image":"https://vd7.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g100000.jpg@s_2,w_640,h_1137,q_80","videoInfo":{"vid":"3835828622578785753","title":"","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g100000.jpg@s_2,w_640,h_1137,q_80","posterImage":"https://vd7.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g100000.jpg@s_2,w_640,h_1137,q_80","posterImageHistory":"https://timgmb02.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=b08a58be7517163141540b110d3bbfce&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2F78b1cd31da862af66e8324e278144c2e.jpg","duration":11,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=3835828622578785753&shared_cuid=AqqqB","webTitle":"[全民小视频]狙击手请开八倍镜发布的精彩小视频","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd2.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g1.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=3835828622578785753&auth_key=1575449329-0-0-8a9f47a8ad30269ef2ab0244c6031351&bcevod_channel=searchbox_feed","videoBps":1746,"videoSize":2.3,"height":960,"width":540,"maxH":0.6,"prefetchSize":670464,"prefetchPageSize":670464}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/b810f3d2c7e9fcbadf09e1d565933de0.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"11","vid":"3835828622578785753","operate_source":999,"refreshTimestampMs":1575447528931}},"prefetch_video":[{"key":"sd","rank":0,"url":"https://vd2.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g1.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=3835828622578785753&auth_key=1575449329-0-0-8a9f47a8ad30269ef2ab0244c6031351&bcevod_channel=searchbox_feed","size":670464}],"preboot_video":[],"cmd":"baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%223835828622578785753%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%223835828622578785753%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%223835828622578785753%22%2C%22title%22%3A%22%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkuu9e17hnzh20g1%5C%2Fmda-jkuu9e17hnzh20g100000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkuu9e17hnzh20g1%5C%2Fmda-jkuu9e17hnzh20g100000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb02.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3Db08a58be7517163141540b110d3bbfce%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252F78b1cd31da862af66e8324e278144c2e.jpg%22%2C%22duration%22%3A11%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D3835828622578785753%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%5Cu72d9%5Cu51fb%5Cu624b%5Cu8bf7%5Cu5f00%5Cu516b%5Cu500d%5Cu955c%5Cu53d1%5Cu5e03%5Cu7684%5Cu7cbe%5Cu5f69%5Cu5c0f%5Cu89c6%5Cu9891%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd2.bdstatic.com%5C%2Fmda-jkuu9e17hnzh20g1%5C%2Fmda-jkuu9e17hnzh20g1.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D3835828622578785753%26auth_key%3D1575449329-0-0-8a9f47a8ad30269ef2ab0244c6031351%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A1746%2C%22videoSize%22%3A2.3%2C%22height%22%3A960%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A670464%2C%22prefetchPageSize%22%3A670464%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2Fb810f3d2c7e9fcbadf09e1d565933de0.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%2211%22%2C%22vid%22%3A%223835828622578785753%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%223835828622578785753%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_3835828622578785753%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2","playcnt":{"cnt":0,"text":"次播放"},"like":{"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"},"duration":"00:11","close":"1","request_ext":"null"}
                     * feedback : {"ext":"{\"gr_ext\":{\"score\":0.17753066790682,\"new_cate\":\"\",\"new_sub_cate\":\"\",\"channel_id\":56,\"recall_rank_score\":0.57170826196671,\"gr_user_type\":64,\"all_recall_type\":[72],\"trace_vec\":[],\"operate_source\":0,\"gr_is_micro\":0,\"type\":72,\"rec_src\":[62],\"mark\":0,\"is_low_style\":0,\"ua\":\"32\",\"ut\":\"MIX_8.0.0_26_Xiaomi\",\"province\":\"\",\"city\":\"\",\"district\":\"\",\"session_id\":\"\",\"refresh_index\":\"\",\"position\":0,\"log_id\":1128916719,\"refresh_state\":-1,\"refresh_type\":1,\"refresh_timestamp_ms\":1575447528931,\"cs\":\"0 0\",\"gr_policy_flag\":0,\"scope\":-1,\"age\":2,\"final_score\":0,\"author_authority_score_v1\":-1,\"audit_final_score\":-1,\"news_vr_attention\":\"休闲游戏|\",\"manual_tags\":\"休闲游戏\",\"predictor_q_score\":0,\"posteriori_accept_tag\":-1,\"manual_review_status\":-1,\"author_id\":3933373157,\"original_status\":-1,\"author_brand_info\":{\"sv_author_brand_level\":2,\"sv_group\":0,\"sv_author_brand_health_level\":0,\"author_brand_authority_level\":0,\"sv_author_brand_interaction_level\":0,\"sv_author_brand_verticality_level\":0,\"sv_author_brand_spread_level\":0},\"vertical_types\":[55,14],\"haokan_is_diversion\":false,\"haokan_pos\":-1,\"haokan_is_invoke\":false,\"call_haokan_app\":0,\"micro_is_invoke\":false,\"call_micro_app\":0,\"landpage_haokan_is_invoke\":false,\"landpage_call_haokan_app\":0,\"wifiinfo\":\"\",\"gr_original_pos\":-1,\"gr_step_click\":-1,\"gr_step_related_click\":-1},\"ext_log\":{\"tab_id\":\"1\",\"vid\":\"3835828622578785753\",\"title\":\"\",\"pd\":\"mini-channel-na\",\"image\":\"https://vd7.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g100000.jpg@s_2,w_640,h_1137,q_80\",\"authorID\":null,\"vType\":4,\"searchID\":\"66d0fd7de0ccb105\",\"oper_type\":\"up_down\"}}","action_list":[{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]}
                     * datasign : 7c2b3eb912333fa3d69361537c701d76
                     */

                    private String id;
                    private int isUserSelf;
                    private String layout;
                    private DataBean data;
                    private FeedbackBean feedback;
                    private String datasign;

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public int getIsUserSelf() {
                        return isUserSelf;
                    }

                    public void setIsUserSelf(int isUserSelf) {
                        this.isUserSelf = isUserSelf;
                    }

                    public String getLayout() {
                        return layout;
                    }

                    public void setLayout(String layout) {
                        this.layout = layout;
                    }

                    public DataBean getData() {
                        return data;
                    }

                    public void setData(DataBean data) {
                        this.data = data;
                    }

                    public FeedbackBean getFeedback() {
                        return feedback;
                    }

                    public void setFeedback(FeedbackBean feedback) {
                        this.feedback = feedback;
                    }

                    public String getDatasign() {
                        return datasign;
                    }

                    public void setDatasign(String datasign) {
                        this.datasign = datasign;
                    }

                    public static class DataBean {
                        /**
                         * id : sv_3835828622578785753
                         * mode : video
                         * title :
                         * video : https://vd2.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g1.mp4?auth_key=1575533929-0-0-5fdeabf400ada966a0462bcb70cb98b0&bcevod_channel=searchbox_feed
                         * hw : 1.778
                         * gif :
                         * iconList : [{"title":"不感兴趣","type":0,"cmd":""},{"title":"举报/反馈","type":1,"cmd":"baiduboxapp://v17/utils/feedback?params=%7B%22type%22%3A%222%22%2C%22info%22%3A%7B%22channel%22%3A%2233086%22%2C%22cuid%22%3A%220%22%2C%22entrance%22%3A%22minivideo_list%22%2C%22nid%22%3A%223835828622578785753%22%2C%22tab_id%22%3A%221%22%2C%22tpl%22%3A%22bjh%22%7D%2C%22extras%22%3A%7B%22source%22%3A%22feedlist%22%7D%7D"}]
                         * image : https://vd7.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g100000.jpg@s_2,w_640,h_1137,q_80
                         * videoInfo : {"vid":"3835828622578785753","title":"","defaultTitle":null,"poster":"https://vd7.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g100000.jpg@s_2,w_640,h_1137,q_80","posterImage":"https://vd7.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g100000.jpg@s_2,w_640,h_1137,q_80","posterImageHistory":"https://timgmb02.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=b08a58be7517163141540b110d3bbfce&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2F78b1cd31da862af66e8324e278144c2e.jpg","duration":11,"autoSize":true,"page":"mini_video_landing","pageUrl":"https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=3835828622578785753&shared_cuid=AqqqB","webTitle":"[全民小视频]狙击手请开八倍镜发布的精彩小视频","resourceType":"feed","ext":{"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd2.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g1.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=3835828622578785753&auth_key=1575449329-0-0-8a9f47a8ad30269ef2ab0244c6031351&bcevod_channel=searchbox_feed","videoBps":1746,"videoSize":2.3,"height":960,"width":540,"maxH":0.6,"prefetchSize":670464,"prefetchPageSize":670464}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}},"full_screen":1,"ext_log":{"locid":"http://www.internal.video.baidu.com/b810f3d2c7e9fcbadf09e1d565933de0.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"11","vid":"3835828622578785753","operate_source":999,"refreshTimestampMs":1575447528931}}
                         * prefetch_video : [{"key":"sd","rank":0,"url":"https://vd2.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g1.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=3835828622578785753&auth_key=1575449329-0-0-8a9f47a8ad30269ef2ab0244c6031351&bcevod_channel=searchbox_feed","size":670464}]
                         * preboot_video : []
                         * cmd : baiduboxapp://v8/video/invokeMiniVideoLandingPage?params=%7B%22vid%22%3A%223835828622578785753%22%2C%22nativeads%22%3A0%2C%22currVid%22%3A%223835828622578785753%22%2C%22videoInfo%22%3A%7B%22vid%22%3A%223835828622578785753%22%2C%22title%22%3A%22%22%2C%22defaultTitle%22%3Anull%2C%22poster%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkuu9e17hnzh20g1%5C%2Fmda-jkuu9e17hnzh20g100000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImage%22%3A%22https%3A%5C%2F%5C%2Fvd7.bdstatic.com%5C%2Fmda-jkuu9e17hnzh20g1%5C%2Fmda-jkuu9e17hnzh20g100000.jpg%40s_2%2Cw_640%2Ch_1137%2Cq_80%22%2C%22posterImageHistory%22%3A%22https%3A%5C%2F%5C%2Ftimgmb02.bdimg.com%5C%2Ftimg%3Fer%3D%26searchbox_feed%26quality%3D80%26wh_rate%3D0%26size%3Df480_320%26ref%3Dhttp%253A%252F%252Fwww.baidu.com%26sec%3D0%26di%3Db08a58be7517163141540b110d3bbfce%26src%3Dhttp%253A%252F%252Fpic.rmb.bdstatic.com%252Fmvideo%252F78b1cd31da862af66e8324e278144c2e.jpg%22%2C%22duration%22%3A11%2C%22autoSize%22%3Atrue%2C%22page%22%3A%22mini_video_landing%22%2C%22pageUrl%22%3A%22https%3A%5C%2F%5C%2Fquanmin.baidu.com%5C%2Fsv%3Fsource%3Dshare-h5%26pd%3Dqm_share_mvideo%26vid%3D3835828622578785753%26shared_cuid%3DAqqqB%22%2C%22webTitle%22%3A%22%5B%5Cu5168%5Cu6c11%5Cu5c0f%5Cu89c6%5Cu9891%5D%5Cu72d9%5Cu51fb%5Cu624b%5Cu8bf7%5Cu5f00%5Cu516b%5Cu500d%5Cu955c%5Cu53d1%5Cu5e03%5Cu7684%5Cu7cbe%5Cu5f69%5Cu5c0f%5Cu89c6%5Cu9891%22%2C%22resourceType%22%3A%22feed%22%2C%22ext%22%3A%7B%22clarityUrl%22%3A%5B%7B%22key%22%3A%22sd%22%2C%22rank%22%3A0%2C%22title%22%3A%22%5Cu6807%5Cu6e05%22%2C%22url%22%3A%22https%3A%5C%2F%5C%2Fvd2.bdstatic.com%5C%2Fmda-jkuu9e17hnzh20g1%5C%2Fmda-jkuu9e17hnzh20g1.mp4%3Fvt%3D0%26cd%3D0%26did%3Dcfcd208495d565ef66e7dff9f98764da%26logid%3D1128916719%26vid%3D3835828622578785753%26auth_key%3D1575449329-0-0-8a9f47a8ad30269ef2ab0244c6031351%26bcevod_channel%3Dsearchbox_feed%22%2C%22videoBps%22%3A1746%2C%22videoSize%22%3A2.3%2C%22height%22%3A960%2C%22width%22%3A540%2C%22maxH%22%3A0.6%2C%22prefetchSize%22%3A670464%2C%22prefetchPageSize%22%3A670464%7D%5D%2C%22ad%22%3A%7B%22content%22%3A%22%22%2C%22url%22%3A%22baiduboxapp%3A%5C%2F%5C%2Fv1%5C%2Feasybrowse%5C%2Fopen%3Fnewbrowser%3D0%26url%3Dhttps%253A%252F%252Feopa.baidu.com%252Fpage%252FHomePage-YW54iXYf%253Fchannel%253D10%22%2C%22buttonTitle%22%3A%22%5Cu70b9%5Cu6211%5Cu514d%5Cu6d41%5Cu91cf%22%7D%2C%22share%22%3A%7B%22full%22%3Atrue%2C%22half%22%3Atrue%7D%7D%2C%22full_screen%22%3A1%2C%22ext_log%22%3A%7B%22locid%22%3A%22http%3A%5C%2F%5C%2Fwww.internal.video.baidu.com%5C%2Fb810f3d2c7e9fcbadf09e1d565933de0.html%22%2C%22pd%22%3A%22mini-channel-na%22%2C%22mt%22%3A2%2C%22searchID%22%3A%2266d0fd7de0ccb105%22%2C%22vType%22%3A4%2C%22tab%22%3A%221%22%2C%22authorID%22%3A%22%22%2C%22isRec%22%3A0%2C%22mtNew%22%3A%22na%22%2C%22pdRec%22%3A%22mini-channel-na%22%2C%22oper_type%22%3A%22up_down%22%2C%22miniplay_id%22%3A%22%22%2C%22miniplay_vid%22%3A%22%22%2C%22duration%22%3A%2211%22%2C%22vid%22%3A%223835828622578785753%22%2C%22operate_source%22%3A999%2C%22refreshTimestampMs%22%3A1575447528931%7D%7D%2C%22pd%22%3A%22mini-channel-na%22%2C%22needMore%22%3A1%2C%22uninterested%22%3A1%2C%22ext%22%3A%22%7B%5C%22vid%5C%22%3A%5C%223835828622578785753%5C%22%2C%5C%22pd%5C%22%3A%5C%22mini-channel-na%5C%22%2C%5C%22ext_pd%5C%22%3A%5C%22fanhua%5C%22%2C%5C%22source_type%5C%22%3A%5C%22na%5C%22%2C%5C%22real_pd%5C%22%3A%5C%221%5C%22%7D%22%2C%22request_ext%22%3A%22%22%2C%22isSupportUpRefresh%22%3A0%2C%22recMore%22%3A1%2C%22listSource%22%3A%22minivideo%22%2C%22tab%22%3A%221%22%2C%22feedid%22%3A%22sv_3835828622578785753%22%2C%22relatedShortVideo%22%3A0%7D&toolbaricons=%7B%22toolids%22%3A%5B%224%22%2C%221%22%2C%223%22%2C%225%22%5D%7D&menumode=2
                         * playcnt : {"cnt":0,"text":"次播放"}
                         * like : {"status":0,"text":"赞","cnt":0,"ext":"{\"operation\":\"like\",\"sfrom\":\"minivideo\",\"source\":\"minivideo\",\"type\":\"feed\"}"}
                         * duration : 00:11
                         * close : 1
                         * request_ext : null
                         */

                        private String id;
                        private String mode;
                        private String title;
                        private String video;
                        private double hw;
                        private String gif;
                        private String image;
                        private VideoInfoBean videoInfo;
                        private String cmd;
                        private PlaycntBean playcnt;
                        private LikeBean like;
                        private String duration;
                        private String close;
                        private String request_ext;
                        private List<IconListBean> iconList;
                        private List<PrefetchVideoBean> prefetch_video;
//                        private List<?> preboot_video;

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }

                        public String getMode() {
                            return mode;
                        }

                        public void setMode(String mode) {
                            this.mode = mode;
                        }

                        public String getTitle() {
                            return title;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }

                        public String getVideo() {
                            return video;
                        }

                        public void setVideo(String video) {
                            this.video = video;
                        }

                        public double getHw() {
                            return hw;
                        }

                        public void setHw(double hw) {
                            this.hw = hw;
                        }

                        public String getGif() {
                            return gif;
                        }

                        public void setGif(String gif) {
                            this.gif = gif;
                        }

                        public String getImage() {
                            return image;
                        }

                        public void setImage(String image) {
                            this.image = image;
                        }

                        public VideoInfoBean getVideoInfo() {
                            return videoInfo;
                        }

                        public void setVideoInfo(VideoInfoBean videoInfo) {
                            this.videoInfo = videoInfo;
                        }

                        public String getCmd() {
                            return cmd;
                        }

                        public void setCmd(String cmd) {
                            this.cmd = cmd;
                        }

                        public PlaycntBean getPlaycnt() {
                            return playcnt;
                        }

                        public void setPlaycnt(PlaycntBean playcnt) {
                            this.playcnt = playcnt;
                        }

                        public LikeBean getLike() {
                            return like;
                        }

                        public void setLike(LikeBean like) {
                            this.like = like;
                        }

                        public String getDuration() {
                            return duration;
                        }

                        public void setDuration(String duration) {
                            this.duration = duration;
                        }

                        public String getClose() {
                            return close;
                        }

                        public void setClose(String close) {
                            this.close = close;
                        }

                        public String getRequest_ext() {
                            return request_ext;
                        }

                        public void setRequest_ext(String request_ext) {
                            this.request_ext = request_ext;
                        }

                        public List<IconListBean> getIconList() {
                            return iconList;
                        }

                        public void setIconList(List<IconListBean> iconList) {
                            this.iconList = iconList;
                        }

                        public List<PrefetchVideoBean> getPrefetch_video() {
                            return prefetch_video;
                        }

                        public void setPrefetch_video(List<PrefetchVideoBean> prefetch_video) {
                            this.prefetch_video = prefetch_video;
                        }

//                        public List<?> getPreboot_video() {
//                            return preboot_video;
//                        }

//                        public void setPreboot_video(List<?> preboot_video) {
//                            this.preboot_video = preboot_video;
//                        }

                        public static class VideoInfoBean {
                            /**
                             * vid : 3835828622578785753
                             * title :
                             * defaultTitle : null
                             * poster : https://vd7.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g100000.jpg@s_2,w_640,h_1137,q_80
                             * posterImage : https://vd7.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g100000.jpg@s_2,w_640,h_1137,q_80
                             * posterImageHistory : https://timgmb02.bdimg.com/timg?er=&searchbox_feed&quality=80&wh_rate=0&size=f480_320&ref=http%3A%2F%2Fwww.baidu.com&sec=0&di=b08a58be7517163141540b110d3bbfce&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fmvideo%2F78b1cd31da862af66e8324e278144c2e.jpg
                             * duration : 11
                             * autoSize : true
                             * page : mini_video_landing
                             * pageUrl : https://quanmin.baidu.com/sv?source=share-h5&pd=qm_share_mvideo&vid=3835828622578785753&shared_cuid=AqqqB
                             * webTitle : [全民小视频]狙击手请开八倍镜发布的精彩小视频
                             * resourceType : feed
                             * ext : {"clarityUrl":[{"key":"sd","rank":0,"title":"标清","url":"https://vd2.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g1.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=3835828622578785753&auth_key=1575449329-0-0-8a9f47a8ad30269ef2ab0244c6031351&bcevod_channel=searchbox_feed","videoBps":1746,"videoSize":2.3,"height":960,"width":540,"maxH":0.6,"prefetchSize":670464,"prefetchPageSize":670464}],"ad":{"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"},"share":{"full":true,"half":true}}
                             * full_screen : 1
                             * ext_log : {"locid":"http://www.internal.video.baidu.com/b810f3d2c7e9fcbadf09e1d565933de0.html","pd":"mini-channel-na","mt":2,"searchID":"66d0fd7de0ccb105","vType":4,"tab":"1","authorID":"","isRec":0,"mtNew":"na","pdRec":"mini-channel-na","oper_type":"up_down","miniplay_id":"","miniplay_vid":"","duration":"11","vid":"3835828622578785753","operate_source":999,"refreshTimestampMs":1575447528931}
                             */

                            private String vid;
                            private String title;
                            private Object defaultTitle;
                            private String poster;
                            private String posterImage;
                            private String posterImageHistory;
                            private int duration;
                            private boolean autoSize;
                            private String page;
                            private String pageUrl;
                            private String webTitle;
                            private String resourceType;
                            private ExtBean ext;
                            private int full_screen;
                            private ExtLogBean ext_log;

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

                            public Object getDefaultTitle() {
                                return defaultTitle;
                            }

                            public void setDefaultTitle(Object defaultTitle) {
                                this.defaultTitle = defaultTitle;
                            }

                            public String getPoster() {
                                return poster;
                            }

                            public void setPoster(String poster) {
                                this.poster = poster;
                            }

                            public String getPosterImage() {
                                return posterImage;
                            }

                            public void setPosterImage(String posterImage) {
                                this.posterImage = posterImage;
                            }

                            public String getPosterImageHistory() {
                                return posterImageHistory;
                            }

                            public void setPosterImageHistory(String posterImageHistory) {
                                this.posterImageHistory = posterImageHistory;
                            }

                            public int getDuration() {
                                return duration;
                            }

                            public void setDuration(int duration) {
                                this.duration = duration;
                            }

                            public boolean isAutoSize() {
                                return autoSize;
                            }

                            public void setAutoSize(boolean autoSize) {
                                this.autoSize = autoSize;
                            }

                            public String getPage() {
                                return page;
                            }

                            public void setPage(String page) {
                                this.page = page;
                            }

                            public String getPageUrl() {
                                return pageUrl;
                            }

                            public void setPageUrl(String pageUrl) {
                                this.pageUrl = pageUrl;
                            }

                            public String getWebTitle() {
                                return webTitle;
                            }

                            public void setWebTitle(String webTitle) {
                                this.webTitle = webTitle;
                            }

                            public String getResourceType() {
                                return resourceType;
                            }

                            public void setResourceType(String resourceType) {
                                this.resourceType = resourceType;
                            }

                            public ExtBean getExt() {
                                return ext;
                            }

                            public void setExt(ExtBean ext) {
                                this.ext = ext;
                            }

                            public int getFull_screen() {
                                return full_screen;
                            }

                            public void setFull_screen(int full_screen) {
                                this.full_screen = full_screen;
                            }

                            public ExtLogBean getExt_log() {
                                return ext_log;
                            }

                            public void setExt_log(ExtLogBean ext_log) {
                                this.ext_log = ext_log;
                            }

                            public static class ExtBean {
                                /**
                                 * clarityUrl : [{"key":"sd","rank":0,"title":"标清","url":"https://vd2.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g1.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=3835828622578785753&auth_key=1575449329-0-0-8a9f47a8ad30269ef2ab0244c6031351&bcevod_channel=searchbox_feed","videoBps":1746,"videoSize":2.3,"height":960,"width":540,"maxH":0.6,"prefetchSize":670464,"prefetchPageSize":670464}]
                                 * ad : {"content":"","url":"baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10","buttonTitle":"点我免流量"}
                                 * share : {"full":true,"half":true}
                                 */

                                private AdBean ad;
                                private ShareBean share;
                                private List<ClarityUrlBean> clarityUrl;

                                public AdBean getAd() {
                                    return ad;
                                }

                                public void setAd(AdBean ad) {
                                    this.ad = ad;
                                }

                                public ShareBean getShare() {
                                    return share;
                                }

                                public void setShare(ShareBean share) {
                                    this.share = share;
                                }

                                public List<ClarityUrlBean> getClarityUrl() {
                                    return clarityUrl;
                                }

                                public void setClarityUrl(List<ClarityUrlBean> clarityUrl) {
                                    this.clarityUrl = clarityUrl;
                                }

                                public static class AdBean {
                                    /**
                                     * content :
                                     * url : baiduboxapp://v1/easybrowse/open?newbrowser=0&url=https%3A%2F%2Feopa.baidu.com%2Fpage%2FHomePage-YW54iXYf%3Fchannel%3D10
                                     * buttonTitle : 点我免流量
                                     */

                                    private String content;
                                    private String url;
                                    private String buttonTitle;

                                    public String getContent() {
                                        return content;
                                    }

                                    public void setContent(String content) {
                                        this.content = content;
                                    }

                                    public String getUrl() {
                                        return url;
                                    }

                                    public void setUrl(String url) {
                                        this.url = url;
                                    }

                                    public String getButtonTitle() {
                                        return buttonTitle;
                                    }

                                    public void setButtonTitle(String buttonTitle) {
                                        this.buttonTitle = buttonTitle;
                                    }
                                }

                                public static class ShareBean {
                                    /**
                                     * full : true
                                     * half : true
                                     */

                                    private boolean full;
                                    private boolean half;

                                    public boolean isFull() {
                                        return full;
                                    }

                                    public void setFull(boolean full) {
                                        this.full = full;
                                    }

                                    public boolean isHalf() {
                                        return half;
                                    }

                                    public void setHalf(boolean half) {
                                        this.half = half;
                                    }
                                }

                                public static class ClarityUrlBean {
                                    /**
                                     * key : sd
                                     * rank : 0
                                     * title : 标清
                                     * url : https://vd2.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g1.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=3835828622578785753&auth_key=1575449329-0-0-8a9f47a8ad30269ef2ab0244c6031351&bcevod_channel=searchbox_feed
                                     * videoBps : 1746
                                     * videoSize : 2.3
                                     * height : 960
                                     * width : 540
                                     * maxH : 0.6
                                     * prefetchSize : 670464
                                     * prefetchPageSize : 670464
                                     */

                                    private String key;
                                    private int rank;
                                    private String title;
                                    private String url;
                                    private int videoBps;
                                    private double videoSize;
                                    private int height;
                                    private int width;
                                    private double maxH;
                                    private int prefetchSize;
                                    private int prefetchPageSize;

                                    public String getKey() {
                                        return key;
                                    }

                                    public void setKey(String key) {
                                        this.key = key;
                                    }

                                    public int getRank() {
                                        return rank;
                                    }

                                    public void setRank(int rank) {
                                        this.rank = rank;
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

                                    public int getVideoBps() {
                                        return videoBps;
                                    }

                                    public void setVideoBps(int videoBps) {
                                        this.videoBps = videoBps;
                                    }

                                    public double getVideoSize() {
                                        return videoSize;
                                    }

                                    public void setVideoSize(double videoSize) {
                                        this.videoSize = videoSize;
                                    }

                                    public int getHeight() {
                                        return height;
                                    }

                                    public void setHeight(int height) {
                                        this.height = height;
                                    }

                                    public int getWidth() {
                                        return width;
                                    }

                                    public void setWidth(int width) {
                                        this.width = width;
                                    }

                                    public double getMaxH() {
                                        return maxH;
                                    }

                                    public void setMaxH(double maxH) {
                                        this.maxH = maxH;
                                    }

                                    public int getPrefetchSize() {
                                        return prefetchSize;
                                    }

                                    public void setPrefetchSize(int prefetchSize) {
                                        this.prefetchSize = prefetchSize;
                                    }

                                    public int getPrefetchPageSize() {
                                        return prefetchPageSize;
                                    }

                                    public void setPrefetchPageSize(int prefetchPageSize) {
                                        this.prefetchPageSize = prefetchPageSize;
                                    }
                                }
                            }

                            public static class ExtLogBean {
                                /**
                                 * locid : http://www.internal.video.baidu.com/b810f3d2c7e9fcbadf09e1d565933de0.html
                                 * pd : mini-channel-na
                                 * mt : 2
                                 * searchID : 66d0fd7de0ccb105
                                 * vType : 4
                                 * tab : 1
                                 * authorID :
                                 * isRec : 0
                                 * mtNew : na
                                 * pdRec : mini-channel-na
                                 * oper_type : up_down
                                 * miniplay_id :
                                 * miniplay_vid :
                                 * duration : 11
                                 * vid : 3835828622578785753
                                 * operate_source : 999
                                 * refreshTimestampMs : 1575447528931
                                 */

                                private String locid;
                                private String pd;
                                private int mt;
                                private String searchID;
                                private int vType;
                                private String tab;
                                private String authorID;
                                private int isRec;
                                private String mtNew;
                                private String pdRec;
                                private String oper_type;
                                private String miniplay_id;
                                private String miniplay_vid;
                                private String duration;
                                private String vid;
                                private int operate_source;
                                private long refreshTimestampMs;

                                public String getLocid() {
                                    return locid;
                                }

                                public void setLocid(String locid) {
                                    this.locid = locid;
                                }

                                public String getPd() {
                                    return pd;
                                }

                                public void setPd(String pd) {
                                    this.pd = pd;
                                }

                                public int getMt() {
                                    return mt;
                                }

                                public void setMt(int mt) {
                                    this.mt = mt;
                                }

                                public String getSearchID() {
                                    return searchID;
                                }

                                public void setSearchID(String searchID) {
                                    this.searchID = searchID;
                                }

                                public int getVType() {
                                    return vType;
                                }

                                public void setVType(int vType) {
                                    this.vType = vType;
                                }

                                public String getTab() {
                                    return tab;
                                }

                                public void setTab(String tab) {
                                    this.tab = tab;
                                }

                                public String getAuthorID() {
                                    return authorID;
                                }

                                public void setAuthorID(String authorID) {
                                    this.authorID = authorID;
                                }

                                public int getIsRec() {
                                    return isRec;
                                }

                                public void setIsRec(int isRec) {
                                    this.isRec = isRec;
                                }

                                public String getMtNew() {
                                    return mtNew;
                                }

                                public void setMtNew(String mtNew) {
                                    this.mtNew = mtNew;
                                }

                                public String getPdRec() {
                                    return pdRec;
                                }

                                public void setPdRec(String pdRec) {
                                    this.pdRec = pdRec;
                                }

                                public String getOper_type() {
                                    return oper_type;
                                }

                                public void setOper_type(String oper_type) {
                                    this.oper_type = oper_type;
                                }

                                public String getMiniplay_id() {
                                    return miniplay_id;
                                }

                                public void setMiniplay_id(String miniplay_id) {
                                    this.miniplay_id = miniplay_id;
                                }

                                public String getMiniplay_vid() {
                                    return miniplay_vid;
                                }

                                public void setMiniplay_vid(String miniplay_vid) {
                                    this.miniplay_vid = miniplay_vid;
                                }

                                public String getDuration() {
                                    return duration;
                                }

                                public void setDuration(String duration) {
                                    this.duration = duration;
                                }

                                public String getVid() {
                                    return vid;
                                }

                                public void setVid(String vid) {
                                    this.vid = vid;
                                }

                                public int getOperate_source() {
                                    return operate_source;
                                }

                                public void setOperate_source(int operate_source) {
                                    this.operate_source = operate_source;
                                }

                                public long getRefreshTimestampMs() {
                                    return refreshTimestampMs;
                                }

                                public void setRefreshTimestampMs(long refreshTimestampMs) {
                                    this.refreshTimestampMs = refreshTimestampMs;
                                }
                            }
                        }

                        public static class PlaycntBean {
                            /**
                             * cnt : 0
                             * text : 次播放
                             */

                            private int cnt;
                            private String text;

                            public int getCnt() {
                                return cnt;
                            }

                            public void setCnt(int cnt) {
                                this.cnt = cnt;
                            }

                            public String getText() {
                                return text;
                            }

                            public void setText(String text) {
                                this.text = text;
                            }
                        }

                        public static class LikeBean {
                            /**
                             * status : 0
                             * text : 赞
                             * cnt : 0
                             * ext : {"operation":"like","sfrom":"minivideo","source":"minivideo","type":"feed"}
                             */

                            private int status;
                            private String text;
                            private int cnt;
                            private String ext;

                            public int getStatus() {
                                return status;
                            }

                            public void setStatus(int status) {
                                this.status = status;
                            }

                            public String getText() {
                                return text;
                            }

                            public void setText(String text) {
                                this.text = text;
                            }

                            public int getCnt() {
                                return cnt;
                            }

                            public void setCnt(int cnt) {
                                this.cnt = cnt;
                            }

                            public String getExt() {
                                return ext;
                            }

                            public void setExt(String ext) {
                                this.ext = ext;
                            }
                        }

                        public static class IconListBean {
                            /**
                             * title : 不感兴趣
                             * type : 0
                             * cmd :
                             */

                            private String title;
                            private int type;
                            private String cmd;

                            public String getTitle() {
                                return title;
                            }

                            public void setTitle(String title) {
                                this.title = title;
                            }

                            public int getType() {
                                return type;
                            }

                            public void setType(int type) {
                                this.type = type;
                            }

                            public String getCmd() {
                                return cmd;
                            }

                            public void setCmd(String cmd) {
                                this.cmd = cmd;
                            }
                        }

                        public static class PrefetchVideoBean {
                            /**
                             * key : sd
                             * rank : 0
                             * url : https://vd2.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g1.mp4?vt=0&cd=0&did=cfcd208495d565ef66e7dff9f98764da&logid=1128916719&vid=3835828622578785753&auth_key=1575449329-0-0-8a9f47a8ad30269ef2ab0244c6031351&bcevod_channel=searchbox_feed
                             * size : 670464
                             */

                            private String key;
                            private int rank;
                            private String url;
                            private int size;

                            public String getKey() {
                                return key;
                            }

                            public void setKey(String key) {
                                this.key = key;
                            }

                            public int getRank() {
                                return rank;
                            }

                            public void setRank(int rank) {
                                this.rank = rank;
                            }

                            public String getUrl() {
                                return url;
                            }

                            public void setUrl(String url) {
                                this.url = url;
                            }

                            public int getSize() {
                                return size;
                            }

                            public void setSize(int size) {
                                this.size = size;
                            }
                        }
                    }

                    public static class FeedbackBean {
                        /**
                         * ext : {"gr_ext":{"score":0.17753066790682,"new_cate":"","new_sub_cate":"","channel_id":56,"recall_rank_score":0.57170826196671,"gr_user_type":64,"all_recall_type":[72],"trace_vec":[],"operate_source":0,"gr_is_micro":0,"type":72,"rec_src":[62],"mark":0,"is_low_style":0,"ua":"32","ut":"MIX_8.0.0_26_Xiaomi","province":"","city":"","district":"","session_id":"","refresh_index":"","position":0,"log_id":1128916719,"refresh_state":-1,"refresh_type":1,"refresh_timestamp_ms":1575447528931,"cs":"0 0","gr_policy_flag":0,"scope":-1,"age":2,"final_score":0,"author_authority_score_v1":-1,"audit_final_score":-1,"news_vr_attention":"休闲游戏|","manual_tags":"休闲游戏","predictor_q_score":0,"posteriori_accept_tag":-1,"manual_review_status":-1,"author_id":3933373157,"original_status":-1,"author_brand_info":{"sv_author_brand_level":2,"sv_group":0,"sv_author_brand_health_level":0,"author_brand_authority_level":0,"sv_author_brand_interaction_level":0,"sv_author_brand_verticality_level":0,"sv_author_brand_spread_level":0},"vertical_types":[55,14],"haokan_is_diversion":false,"haokan_pos":-1,"haokan_is_invoke":false,"call_haokan_app":0,"micro_is_invoke":false,"call_micro_app":0,"landpage_haokan_is_invoke":false,"landpage_call_haokan_app":0,"wifiinfo":"","gr_original_pos":-1,"gr_step_click":-1,"gr_step_related_click":-1},"ext_log":{"tab_id":"1","vid":"3835828622578785753","title":"","pd":"mini-channel-na","image":"https://vd7.bdstatic.com/mda-jkuu9e17hnzh20g1/mda-jkuu9e17hnzh20g100000.jpg@s_2,w_640,h_1137,q_80","authorID":null,"vType":4,"searchID":"66d0fd7de0ccb105","oper_type":"up_down"}}
                         * action_list : [{"action_id":"clk"},{"action_id":"ttsclk"},{"action_id":"dislike","tag_list":[]}]
                         */

                        private String ext;
                        private List<ActionListBean> action_list;

                        public String getExt() {
                            return ext;
                        }

                        public void setExt(String ext) {
                            this.ext = ext;
                        }

                        public List<ActionListBean> getAction_list() {
                            return action_list;
                        }

                        public void setAction_list(List<ActionListBean> action_list) {
                            this.action_list = action_list;
                        }

                        public static class ActionListBean {
                            /**
                             * action_id : clk
                             * tag_list : []
                             */

                            private String action_id;
                            private List<?> tag_list;

                            public String getAction_id() {
                                return action_id;
                            }

                            public void setAction_id(String action_id) {
                                this.action_id = action_id;
                            }

                            public List<?> getTag_list() {
                                return tag_list;
                            }

                            public void setTag_list(List<?> tag_list) {
                                this.tag_list = tag_list;
                            }
                        }
                    }
                }
            }
        }
    }
}
