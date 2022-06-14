package com.sblog.simpleblog.service.impl;

import com.sblog.simpleblog.dao.ArticleMapper;
import com.sblog.simpleblog.entity.Article;
import com.sblog.simpleblog.entity.ArticleHit;
import com.sblog.simpleblog.service.ArticleHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleHitServiceImpl implements ArticleHitService {

    private ArticleMapper articleMapper;

    @Autowired
    public void setArticleMapper(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    @Override
    public ArticleHit findByArticle(Article article) {
        return null;
    }

    @Override
    public boolean update(ArticleHit articleHit) {
        return false;
    }

    @Override
    public boolean add(ArticleHit articleHit) {
        return false;
    }

    @Override
    public boolean delete(ArticleHit articleHit) {
        return false;
    }

    @Override
    public boolean existsByArticle(Article article) {
        return false;
    }
}
