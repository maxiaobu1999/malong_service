package com.norman.tik;

import com.norman.tik.repository.ITikDao;
import com.norman.tik.dto.response.TikEntity;
import com.norman.tik.repository.entity.TikOriginalEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SuppressWarnings("Duplicates")
public class TikManager {



    public TikEntity conversion(TikOriginalEntity.DataBeanX._$210Bean.ItemlistBean.ItemsBean original) {
        TikEntity entity = new TikEntity();
        TikOriginalEntity.DataBeanX._$210Bean.ItemlistBean.ItemsBean.DataBean item = original.getData();

        entity.setVid(item.getId());
        entity.setHW(String.valueOf(item.getHw()));
        entity.setWidth(String.valueOf(item.getVideoInfo().getExt().getClarityUrl().get(0).getWidth()));
        entity.setHeight(String.valueOf(item.getVideoInfo().getExt().getClarityUrl().get(0).getHeight()));
        entity.setVideoSize(String.valueOf(item.getVideoInfo().getExt().getClarityUrl().get(0).getVideoSize()));
        entity.setVideoBps(String.valueOf(item.getVideoInfo().getExt().getClarityUrl().get(0).getVideoBps()));
        entity.setPlayNum(String.valueOf(item.getPlaycnt().getCnt()));
        entity.setImage(item.getImage());
        entity.setVideoUrl(item.getVideo());
        String title = item.getTitle();
        System.out.println("++++" + title);
        if (!containsEmoji(title)) {
            entity.setTitle(item.getTitle());
        }

        return entity;
    }


    public List<TikEntity> getAllFromMysql() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        ITikDao mMiniDao = session.getMapper(ITikDao.class);

        List<TikEntity> all = mMiniDao.getAll();

        session.commit();
        session.close();
        in.close();
        return all;
    }


    public String getImageFileName(String url) {
        // https://vd7.bdstatic.com/mda-jktpdbjjuagp39bg/mda-jktpdbjjuagp39bg00000.jpg@s_2,w_640,h_1137,q_80
        String s = url.split("@")[0];
        String[] split = s.split("/");
        int length = split.length;
        String fileName = split[length - 1];
        System.out.println("++++" + fileName);

        return fileName;
    }

    public String getVideoFileName(String url) {
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
    public void conversionMedia(List<TikEntity> allFromMysql) {
        for (TikEntity tikEntity : allFromMysql) {
            String imageFileName = getImageFileName(tikEntity.getImage());
            tikEntity.setImage("static/tik_image/"+ imageFileName);
            String videoFileName = getVideoFileName(tikEntity.getVideoUrl());
            tikEntity.setVideoUrl("static/tik_video/"+ videoFileName);
            tikEntity.setPlayNum(String.valueOf((int) (Math.random()*1000000)));
            tikEntity.setFansNum((int) (Math.random()*1000000));
            tikEntity.setLikeNum(String.valueOf((int) (Math.random()*1000000)));
            tikEntity.setProductionNum(String.valueOf((int) (Math.random()*100)));
            tikEntity.setFollowAnimNum((int) (Math.random()*10));
        }
    }

    /**
     * 判断字符串中是否含有表情
     * @param source
     * @return
     */
    public static boolean containsEmoji(String source) {
        int len = source.length();
        boolean isEmoji = false;
        for (int i = 0; i < len; i++) {
            char hs = source.charAt(i);
            if (0xd800 <= hs && hs <= 0xdbff) {
                if (source.length() > 1) {
                    char ls = source.charAt(i + 1);
                    int uc = ((hs - 0xd800) * 0x400) + (ls - 0xdc00) + 0x10000;
                    if (0x1d000 <= uc && uc <= 0x1f77f) {
                        return true;
                    }
                }
            } else {
                // non surrogate
                if (0x2100 <= hs && hs <= 0x27ff && hs != 0x263b) {
                    return true;
                } else if (0x2B05 <= hs && hs <= 0x2b07) {
                    return true;
                } else if (0x2934 <= hs && hs <= 0x2935) {
                    return true;
                } else if (0x3297 <= hs && hs <= 0x3299) {
                    return true;
                } else if (hs == 0xa9 || hs == 0xae || hs == 0x303d
                        || hs == 0x3030 || hs == 0x2b55 || hs == 0x2b1c
                        || hs == 0x2b1b || hs == 0x2b50 || hs == 0x231a) {
                    return true;
                }
                if (!isEmoji && source.length() > 1 && i < source.length() - 1) {
                    char ls = source.charAt(i + 1);
                    if (ls == 0x20e3) {
                        return true;
                    }
                }
            }
        }
        return isEmoji;
    }
}
