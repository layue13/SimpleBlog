package com.sblog.simpleblog.dao;

import com.sblog.simpleblog.entity.Article;
import com.sblog.simpleblog.entity.ArticleHit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 32958
 * 点击信息表
 */
@Mapper
public interface ArticleHitMapper {

    List<ArticleHit> findAllArticle();

    Article findByArticle(Article article);

    int apply(ArticleHit articleHit);

    int modify(ArticleHit articleHit);

    int removeById(int id);

    int isExistArticleHit(Article article);

}
