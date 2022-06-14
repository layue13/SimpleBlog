package com.sblog.simpleblog.service;

import com.sblog.simpleblog.entity.Article;
import com.sblog.simpleblog.entity.ArticleHit;

public interface ArticleHitService {
    ArticleHit findByArticle(Article article);

    boolean update(ArticleHit articleHit);

    boolean add(ArticleHit articleHit);

    boolean delete(ArticleHit articleHit);

    boolean existsByArticle(Article article);
}
