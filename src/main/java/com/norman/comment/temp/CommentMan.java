package com.norman.comment.temp;

import com.norman.Constant;
import com.norman.comment.repository.entity.*;
import com.norman.utils.JSONUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
// 保存评论头像
// CommentMan commentMan = new CommentMan();
//         CommentListData commentListData = commentMan.getCommentListData("2");
//         List<CommentModel> list = commentListData.getCommentList();
//        for (CommentModel model : list) {
//        // "https://himg.bdimg.com/sys/portrait/item/ce3db558.jpg?time=5065"
//        CommentUtil.saveAvatar(model.getAvatar());
//        List<CommentModel> replyList = model.getReplyList();
//        for (CommentModel commentModel : replyList) {
//        CommentUtil.saveAvatar(commentModel.getAvatar());
//        }
//        }
//        System.out.println("+++++"+commentListData.getCommentList().size());
public class CommentMan {

    public CommentListData getCommentListData(String fileName) {
//        File file = null;
//        try {
//            file = ResourceUtils.getFile(ResourceUtils.CLASSPATH_URL_PREFIX + Constant.OSS_COMMENT_PATH+fileName);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        if (file==null) return null;
//        String response = fileToString(file.getAbsolutePath(), "UTF-8");

        String response = "";
        ClassPathResource cpr = new ClassPathResource( Constant.OSS_COMMENT_PATH+fileName);
        try {
            byte[] bdata = FileCopyUtils.copyToByteArray(cpr.getInputStream());
            response = new String(bdata, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println("+++++"+file.getAbsolutePath());

        CommentListData commentListData = new CommentListData();

        JSONObject responseObject = JSONUtils.parseString(response);
        commentListData.setErrno(responseObject.optString("errno"));
        commentListData.setTimeStamp(responseObject.optLong("timestamp"));

        JSONObject dataObject = responseObject.optJSONObject("data");
        JSONObject jsonObject = dataObject.optJSONObject("187");

        if (jsonObject != null) {
            commentListData.setTopicId(jsonObject.optString("topic_id"));
            commentListData.setReplyId(jsonObject.optString("reply_id"));
            commentListData.setOver(jsonObject.optBoolean("is_over"));
            commentListData.setStart(jsonObject.optInt("start"));
            commentListData.setTotalCount(jsonObject.optInt("total_count"));
            commentListData.setLogId(jsonObject.optString("logid"));
            // 11.0 评论框配置信息
            commentListData.setCommentConf(jsonObject.optString("comment_conf"));
            // 评论分享url前缀
            String sharePrefix = jsonObject.optString("share_prefix");
            commentListData.setSharePrefix(sharePrefix);

            // 10.2 新增彩蛋文案配置需求
            commentListData.setCommentSurpriseInfo(CommentSurpriseInfo.parse(jsonObject));

            // 10.9 关闭评论字段
            commentListData.setIsShow(jsonObject.optInt("is_show"));

            // tips: json对象，文案配置
            JSONObject tipsObject = jsonObject.optJSONObject("tips");
            CommentListData.Tips tips = commentListData.new Tips();
            tips.mEmptyMsg = tipsObject.optString("emptymsg");
            tips.mEmptyMsgNum = tipsObject.optString("msg_tag_10");
            tips.mToolbarPlaceholderList = tipsObject.optString("toolbar_placeholder_list");
            tips.mCommentBoxPlaceholderList = tipsObject.optString("commentBox_placeholder_list");
            tips.mToolbarPlaceholderDetail = tipsObject.optString("toolbar_placeholder_detail");
            commentListData.setTips(tips);

            // 9.3新增评论精句,fav_tag: json对象
            List<FavTagModel> favTagList = new ArrayList<FavTagModel>();
            JSONArray favTagArray = jsonObject.optJSONArray("fav_tag");
            if (favTagArray != null) {
                for (int i = 0; i < favTagArray.length(); i++) {
                    FavTagModel favTag = new FavTagModel();
                    JSONObject favTagObject = favTagArray.optJSONObject(i);
                    favTag.setId(favTagObject.optString("id"));
                    favTag.setContent(favTagObject.optString("content"));
                    favTagList.add(favTag);
                }
            }
            commentListData.setFavTagList(favTagList);

            // 10.3 评论区顶部文字链
            JSONObject topTextParseData = jsonObject.optJSONObject("active");
            if (topTextParseData != null) {
                CommentActiveData activeData = new CommentActiveData();
                activeData.setHighLightText(topTextParseData.optString("active_words"));
                activeData.setBannerText(topTextParseData.optString("default_words"));
                activeData.setAcitveLinkUrl(topTextParseData.optString("link_url"));
                activeData.setActiveId(topTextParseData.optString("active_id"));
                activeData.setActiveVersion(topTextParseData.optString("version"));
                commentListData.setCommmentActiveData(activeData);
            }

            // list: 评论列表，json数组
            List<CommentModel> commentList = new ArrayList<>();
            // 某条评论的外露的回复评论，最多2条.
            JSONArray commentArray = jsonObject.optJSONArray("list");
            for (int i = 0; i < commentArray.length(); i++) {
                CommentModel comment = new CommentModel();
                JSONObject commentData = commentArray.optJSONObject(i);
                // 设置评论的通用字段
                setCommentBaseData(comment, commentData, sharePrefix);
                // 11.0 一级评论且没有ReplyToOriginComment对象的，显示图片。
                comment.setShowImage(comment.getReplyToOriginComment() == null);
                // 此条评论外露的回复评论
                if (comment.getReplyCount() > 0) {
                    List<CommentModel> replyList = new ArrayList<>();
                    JSONArray replyArray = commentData.optJSONArray("reply_list");
                    for (int j = 0; j < replyArray.length(); j++) {
                        JSONObject replyData = replyArray.optJSONObject(j);
                        CommentModel reply = new CommentModel();
                        // 设置回复评论的通用字段
                        setCommentBaseData(reply, replyData, sharePrefix);
                        replyList.add(reply);
                    }
                    comment.setReplyList(replyList);
                }
                commentList.add(comment);
            }
            commentListData.setCommentList(commentList);
        }
        return commentListData;

    }



    public static String fileToString( String path, String enc) {
        InputStream is = null;
        String configStr = null;
        try {
            is = new FileInputStream(path);
            // 获取预置文件中的字符串
            StringBuilder buffer = new StringBuilder();
            String line;
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(is, enc), 8192);
                while (null != (line = reader.readLine())) {
                    buffer.append(line);
                }
            } catch (OutOfMemoryError | Exception e) {
                e.printStackTrace();
            } finally {
                is.close();
            }
            configStr = buffer.toString();
        } catch (IOException e) {
            System.out.println(e.getMessage()+"+++");
        } finally {
        }
        return configStr;
    }


    /**
     * 设置评论通用字段
     *
     * @param sharePrefix 评论分享url前缀。业务层需要拼接topicId=xxx和replyId=xxx
     */
    private static void setCommentBaseData(CommentModel commentModel, JSONObject commentData,
                                           String sharePrefix) {
        // 评论基础字段
        commentModel.setTopicId(commentData.optString("topic_id"));
        commentModel.setReplyId(commentData.optString("reply_id"));
        commentModel.setUk(commentData.optString("uk"));
        commentModel.setUName(commentData.optString("uname"));
        commentModel.setPortrait(commentData.optString("portrait"));
        commentModel.setCreateTime(commentData.optLong("create_time"));
        commentModel.setLikeCount(commentData.optInt("like_count"));
        commentModel.setDisLikeCount(commentData.optInt("dislike_count"));
        commentModel.setAvatar(commentData.optString("avatar"));
        commentModel.setReplyToUname(commentData.optString("reply_to_uname"));
        commentModel.setContent(commentData.optString("content"));
        commentModel.setAuthor(commentData.optBoolean("is_author"));
        commentModel.setReplyCount(commentData.optInt("reply_count"));
        commentModel.setIsUped(commentData.optString("is_uped"));
        commentModel.setIsGod(commentData.optString("is_god"));
        commentModel.setSchemaGod(commentData.optString("schema_god"));
        commentModel.setVType(commentData.optString("vtype"));
        commentModel.setReplyedToVType(commentData.optString("reply_to_vtype"));
        commentModel.setShareUrl(sharePrefix);
        // 百家号相关字段
        commentModel.setBjhAuthor(commentData.optBoolean("_bjh_is_author"));
        commentModel.setBjhUname(commentData.optString("_bjh_uname"));
        commentModel.setReplyedBjhAuthor(commentData.optBoolean("_bjh_replyed_is_author"));
        commentModel.setReplyedBjhUname(commentData.optString("_bjh_replyed_uname"));
        // 明星动态相关数据
        JSONObject starObject = commentData.optJSONObject("_star");
        // 当明星发表评论或者回复明星会下发此字段
        if (starObject != null) {
            CommentModel.Star star = commentModel.new Star();
            star.mType = starObject.optString("type");
            star.mUname = starObject.optString("uname");
            star.mmRId = starObject.optString("mr_id");
            star.mAvatar = starObject.optString("avatar");
            star.mReplyedType = starObject.optString("replyed_type");
            star.mReplyedUname = starObject.optString("replyed_uname");
            star.mRepyledAvatar = starObject.optString("replyed_avatar");
            commentModel.setStar(star);
        }
        // 10.1新增字段（二级评论同步至原文）
        commentModel.setReplyToOriginComment(ReplyToOriginComment.parse(commentData));
        // 10.5新增字段 (转发评论)
        commentModel.setForwardCommentInfo(ForwardCommentInfo.parse(commentData));
        // 10.5新增字段 评论类型 2：ugc转发评论
        commentModel.setCommentType(commentData.optString("type", ""));
        // 10.9单条评论本人可见
        commentModel.setIsSelf(commentData.optString("is_self"));
        // 10.9新增字段 是否是层主 “0/1”
        commentModel.setIsLZ(commentData.optString("is_lz"));
        // 10.9新增字段 该评论作者是否点赞 “0/1”
        commentModel.setAuthorUped(commentData.optString("author_uped"));
        // 10.10新增 评论家icon
        JSONObject commentorObject = commentData.optJSONObject("commentor");
        if (commentorObject != null) {
            commentModel.setCommentorIcon(commentorObject.optString("icon"));
            commentModel.setCommentorSchema(commentorObject.optString("url"));
        }
        // 10.10新增字段 评论来源 1:普通评论；2：智能评论
        commentModel.setCommentFrom(commentData.optString("cmt_from"));

        // 11.0 图片相关数据
        JSONObject imagesObject = commentData.optJSONObject("image_list");
        CommentImagesData imagesData = CommentImagesData.parseImagesData(imagesObject);
        commentModel.setImagesData(imagesData);
    }
}
