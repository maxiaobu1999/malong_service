package com.norman.mini;

import com.norman.mini.dto.response.MiniEntity;

import java.util.List;

public class MiniManager {




    public String getImageFileName(String url) {
        // https://pic.rmb.bdstatic.com/10c2e0f9960e4b7fa713d96c9d47769e.jpeg@s_2,w_660,h_370,f_webp
        // https://vd7.bdstatic.com/mda-jktpdbjjuagp39bg/mda-jktpdbjjuagp39bg00000.jpg@s_2,w_640,h_1137,q_80
        String s = url.split("@")[0];
        String[] split = s.split("/");
        int length = split.length;
        String fileName = split[length - 1];
        System.out.println("++++" + fileName);

        return fileName;
    }

    public String getAuthorImageFileName(String url) {
        // https://timgmb.bdimg.com/timg?searchbox_feed&wh_rate=0&ref=http%3A%2F%2Fwww.baidu.com&imgtype=4&size=f68_68&quality=85&sec=0&di=737500cc57b8c48a2acc83013fb3365d&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Fc8986ce83203614a48e4fd7921852f22.jpeg
        // https://vd7.bdstatic.com/mda-jktpdbjjuagp39bg/mda-jktpdbjjuagp39bg00000.jpg@s_2,w_640,h_1137,q_80
        // https://timgmb.bdimg.com/timg?searchbox_feed&wh_rate=0&ref=http%3A%2F%2Fwww.baidu.com&imgtype=4&size=f68_68&quality=85&sec=0&di=31d79c0d10148ed2ebc37c0fdb481be0&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2Ffebff980a50a7c215045be63df58976e.jpeg
        // https://timgmb.bdimg.com/timg?searchbox_feed&wh_rate=0&ref=http%3A%2F%2Fwww.baidu.com&imgtype=4&size=f68_68&quality=85&sec=0&di=c0e9f7eb0b6c62790a121e199279d259&src=http%3A%2F%2Fbos.nj.bpc.baidu.com%2Fv1%2Fmediaspot%2F4fc15fb696a192893c0300fcf24ef1a7.jpeg
        String s = "";
        String[] split = url.split("https://pic.rmb.bdstatic.com/");
        if (split.length > 1) {
            s = split[1];
        } else {
            split = url.split("pic.rmb.bdstatic.com%");
            if (split.length > 1) {
                s = split[1];
            } else {
                split = url.split("bos.nj.bpc.baidu.com%2Fv1%2Fmediaspot%");
                if (split.length > 1) {
                    s = split[1];
                } else {
                    split = url.split("https://cambrian-images.cdn.bcebos.com/");
                    s = split[1];
                }

            }
        }
//        s = s.split("@")[0];
        System.out.println("++++" + s);

        return s;
    }

    public String getVideoFileName(String url) {
        // https://vd2.bdstatic.com/mda-jibx5zbxasjtmqxk/v1-cae/mda-jibx5zbxasjtmqxk.mp4?vt=1&cd=0&did=f023d3123801097a851394b231a849ee&logid=2051025979&vid=8052906699110061439&auth_key=1575520451-0-0-58436abbf170c2d29dad72f53a96beb6&bcevod_channel=searchbox_feed
        // https://vd2.bdstatic.com/mda-jkdu4xia6ghnzbeh/mda-jkdu4xia6ghnzbeh.mp4?auth_key=1575544409-0-0-489c2726417cd8c7f305a240ba3108fb&bcevod_channel=searchbox_feed
        String s = url.split("\\?")[0];
        String[] split = s.split("/");
        int length = split.length;
        String fileName = split[length - 1];
        System.out.println("++++" + fileName);

        return fileName;
    }



    /**
     * 修改mysql数据库中多媒体链接地址
     */
    public void conversionMedia(List<MiniEntity> allFromMysql)  {
        for (MiniEntity entity : allFromMysql) {
            String imageFileName = getImageFileName(entity.getImage());
            entity.setImage("static/mini_image/" + imageFileName);
            String videoFileName = getVideoFileName(entity.getVideoUrl());
            entity.setVideoUrl("static/mini_video/" + videoFileName);
            String authorImageFileName = getAuthorImageFileName(entity.getAuthorIcon());
            entity.setAuthorIcon("static/mini_author/" + authorImageFileName);
        }
    }


}
