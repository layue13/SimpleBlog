package com.sblog.simpleblog.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.sblog.simpleblog.entity.Article;
import com.sblog.simpleblog.entity.User;

public interface ArticleService {
    PageInfo<Article> findArticleByUser(User user, int startPage, int pageSize);
}
