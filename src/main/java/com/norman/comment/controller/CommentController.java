package com.norman.comment.controller;

import com.norman.comment.dto.response.CommentEntity;
import com.norman.comment.temp.CommentMan;
import com.norman.comment.temp.CommentUtil;
import com.norman.comment.repository.entity.CommentListData;
import com.norman.comment.repository.entity.CommentModel;
import com.norman.common.controller.BaseController;
import com.norman.config.annotation.SkipTokenValidate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 评论
 */
@SuppressWarnings("Duplicates")
@RestController // 相当于@ResponseBody和@Controller
@RequestMapping(value = "/comment")// 配置url映射,一级
public class CommentController extends BaseController {

    /**
     * http://localhost:8088/comment/queryByName?fileName=1&start=0&num=2
     *
     * @param fileName 1或2
     * @return n条视频数据
     */
    @SkipTokenValidate
    @RequestMapping("/queryByName")
    public List<CommentEntity> queryByName(String fileName, int start, int num) {
        CommentMan commentMan = new CommentMan();
        CommentListData commentListData = commentMan.getCommentListData(fileName);
        List<CommentModel> commentList = commentListData.getCommentList();
        List<CommentModel> commentModels = commentList.subList(start, start + num);

        ArrayList<CommentEntity> list = new ArrayList<>();
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < commentModels.size(); i++) {
            CommentModel commentModel = commentModels.get(i);
            CommentEntity entity = CommentUtil.conversion(commentModel);
            list.add(entity);
        }

        if (list.size() == 0) {
            return null;
        } else {
            return list;
        }
    }
}
