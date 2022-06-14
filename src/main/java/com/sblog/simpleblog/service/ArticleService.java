package com.sblog.simpleblog.service;

import com.github.pagehelper.PageInfo;
import com.sblog.simpleblog.entity.Article;
import com.sblog.simpleblog.entity.User;

public interface ArticleService {
    PageInfo<Article> findByUser(User user, int startPage, int pageSize);

    PageInfo<Article> findAll(int startPage, int pageSize);

    boolean update(Article article);

    boolean remove(Article article);

    boolean add(Article article);
}
