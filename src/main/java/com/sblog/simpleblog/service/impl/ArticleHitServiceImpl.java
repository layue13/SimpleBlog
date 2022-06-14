package com.sblog.simpleblog.service.impl;

import com.sblog.simpleblog.dao.ArticleHitMapper;
import com.sblog.simpleblog.entity.Article;
import com.sblog.simpleblog.entity.ArticleHit;
import com.sblog.simpleblog.service.ArticleHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleHitServiceImpl implements ArticleHitService {

    private ArticleHitMapper articleHitMapper;

    @Autowired
    public void setArticleHitMapper(ArticleHitMapper articleHitMapper) {
        this.articleHitMapper = articleHitMapper;
    }

    @Override
    public ArticleHit findByArticle(Article article) {
        return null;
    }

    @Override
    public boolean update(ArticleHit articleHit) {
        return articleHitMapper.modify(articleHit) > 0;
    }

    @Override
    public boolean add(ArticleHit articleHit) {
        return articleHitMapper.apply(articleHit) > 0;
    }

    @Override
    public boolean delete(ArticleHit articleHit) {
        return articleHitMapper.removeById(articleHit.getId()) > 0;
    }

    @Override
    public boolean existsByArticle(Article article) {
        return (articleHitMapper.isExistArticleHit(article) == 1) ? true : false;
    }
}
