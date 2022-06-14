package com.sblog.simpleblog.service;

import com.github.pagehelper.PageInfo;
import com.sblog.simpleblog.entity.Article;
import com.sblog.simpleblog.entity.Comment;

public interface CommentService {
     Comment findById(int commentId);

     PageInfo<Comment> findByArticle(Article article,int startPage,int pageSize);

     boolean add(Comment comment);
}
