package com.sblog.simpleblog.service.impl;

import com.github.pagehelper.PageInfo;
import com.sblog.simpleblog.dao.CommentMapper;
import com.sblog.simpleblog.entity.Article;
import com.sblog.simpleblog.entity.Comment;
import com.sblog.simpleblog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    private CommentMapper commentMapper;

    @Autowired
    public void setCommentMapper(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    @Override
    public Comment findById(int commentId) {
        return null;
    }

    @Override
    public PageInfo<Comment> findByArticle(Article article, int startPage, int pageSize) {
        return null;
    }

    @Override
    public boolean add(Comment comment) {
        return false;
    }
}
