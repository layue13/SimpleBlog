package com.sblog.simpleblog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sblog.simpleblog.dao.ArticleMapper;
import com.sblog.simpleblog.entity.Article;
import com.sblog.simpleblog.entity.User;
import com.sblog.simpleblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArticleServiceImpl implements ArticleService {
    private ArticleMapper articleMapper;

    @Autowired
    public void setArticleMapper(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    @Override
    public PageInfo<Article> findByUser(User user, int startPage, int pageSize) {
        PageHelper.startPage(startPage,pageSize);
        PageInfo<Article> page = new PageInfo<>(articleMapper.findArticleByUserId(user.getId()));
        return page;
    }

    @Override
    public PageInfo<Article> findAll(int startPage, int pageSize) {
        PageHelper.startPage(startPage, pageSize);
        List<Article> allArticle = articleMapper.findAllArticle();
        allArticle = allArticle.stream()
                .sorted(Comparator.comparing(Article::getPublishTime))
                .collect(Collectors.toList());
        return new PageInfo<>(allArticle);
    }

    @Override
    public Article findById(int articleId) {
        return articleMapper.findById(articleId);
    }

    @Override
    public boolean update(Article article) {
        return articleMapper.modifyArticle(article) > 0;
    }

    @Override
    public boolean remove(Article article) {
        return articleMapper.removeArticleById(article.getId()) > 0;
    }

    @Override
    public boolean add(Article article) {
        return articleMapper.applyArticle(article) > 0;
    }
}
