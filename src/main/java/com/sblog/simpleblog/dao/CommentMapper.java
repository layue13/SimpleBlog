package com.sblog.simpleblog.dao;

import com.sblog.simpleblog.entity.Article;
import com.sblog.simpleblog.entity.Comment;

import java.util.List;

/**
 * @author 32958
 * 评论信息表
 */
public interface CommentMapper {

    List<Comment> findAllComment();

    List<Comment> findComment(Article article);

    int insert(Comment comment);

    int update(Comment comment);

    int deleteById(int id);

}
