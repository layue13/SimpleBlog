package com.sblog.simpleblog.dao;

import com.sblog.simpleblog.entity.ArticleHit;

import java.util.List;

/**
 * @author 32958
 * 点击信息表
 */
public interface ArticleHitMapper {

    List<ArticleHit> findAllArticle();

    int insert(ArticleHit articleHit);

    int update(ArticleHit articleHit);

    int deleteById(int id);


}
