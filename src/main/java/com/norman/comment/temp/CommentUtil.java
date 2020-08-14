package com.norman.comment.temp;

import com.norman.Constant;
import com.norman.comment.dto.response.CommentEntity;
import com.norman.utils.DownloadUtil;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import com.norman.comment.repository.entity.CommentModel;
import java.util.List;

public class CommentUtil {
    /** CommentModel 转成 CommentEntity  */
    public static CommentEntity conversion(CommentModel model) {
        CommentEntity entity = new CommentEntity();
        // 评论者头像
        if (!StringUtils.isEmpty(model.getAvatar())) {
            String[] split = model.getAvatar().split("\\?");
            String[] split1 = split[0].split("/");
            String fileName = split1[split1.length - 1];
            entity.setAvatar("static/comment/"+fileName);
        }

        entity.setAuthor(model.isAuthor());
        entity.setContent(model.getContent());
        entity.setCreateTime(model.getCreateTime());
        entity.setDisLikeCount(model.getDisLikeCount());
        entity.setLikeCount(model.getLikeCount());
        entity.setIsUped(model.isUped());
        entity.setReplyCount(model.getReplyCount());
        entity.setReplyedToVType(model.getReplyedToVType());
        entity.setReplyId(model.getReplyId());
        entity.setReplyToUname(model.getReplyToUname());
        entity.setTopicId(model.getTopicId());
        entity.setUName(model.getUName());
        entity.setVType(model.getVType());

        List<CommentModel> replyList = model.getReplyList();
        ArrayList<CommentEntity> list = new ArrayList<>();
        for (int i = 0; i < replyList.size(); i++) {
            CommentModel model1 = replyList.get(i);
            CommentEntity entity1 = conversion(model1);
            list.add(entity1);
        }
        entity.setReplyList(list);
        return entity;
    }



    /** 保存评论者的头像 */
    public static void saveAvatar(String avatar) {
        if (StringUtils.isEmpty(avatar)) {
            return;
        }
        // "https://himg.bdimg.com/sys/portrait/item/ce3db558.jpg?time=5065"
        // "https://ss0.bdstatic.com/9bA1vGfa2gU2pMbfm9GUKT-w/timg?searchbox_tengen&size=f100_100&quality=85&wh_rate=0&imgtype=0&ref=http%3A%2F%2Fwww.baidu.com%2F&sec=0&di=0163ad9473a97dcf5b110e4ec47c6dd2&src=http%3A%2F%2Fpic.rmb.bdstatic.com%2F16b006b79ee477140de7cc4d8b4d3ba0.jpeg",
        String[] split = avatar.split("\\?");
        String[] split1 = split[0].split("/");
        String fileName = split1[split1.length - 1];

        DownloadUtil.download(avatar,Constant.OSS_COMMENT_PATH,fileName);


    }
}
