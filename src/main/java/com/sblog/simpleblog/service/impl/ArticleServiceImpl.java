package com.sblog.simpleblog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sblog.simpleblog.dao.ArticleMapper;
import com.sblog.simpleblog.entity.Article;
import com.sblog.simpleblog.entity.User;
import com.sblog.simpleblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {
    private ArticleMapper articleMapper;

    @Autowired
    public void setArticleMapper(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    @Override
    public PageInfo<Article> findArticleByUser(User user, int startPage, int pageSize) {
        PageHelper.startPage(startPage,pageSize);
        PageInfo<Article> page = new PageInfo<>(articleMapper.findArticleByUserId(user.getId()));
        return page;
    }
}
