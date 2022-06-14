package com.sblog.simpleblog.dao;

import com.sblog.simpleblog.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 32958
 * 评论信息表
 */
@Mapper
public interface CommentMapper {

    List<Comment> findAllComment();

    Comment findCommentById(int id);

    int apply(Comment comment);

    int modify(Comment comment);

    int removeById(int id);

}
