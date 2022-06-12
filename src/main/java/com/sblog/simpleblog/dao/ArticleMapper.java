package com.sblog.simpleblog.dao;

import com.sblog.simpleblog.entity.Article;

import java.util.List;

/**
 * @author 32958
 * 文章信息表
 */
public interface ArticleMapper {

    List<Article> findAllArticle();

    List<Article> findArticleByUserId(int userId);

//    List<Article> findArticleByTimeRange(Date startTime, Date endTime);

    int insert(Article article);

    int updateArticle(Article article);

    int deleteArticleById(String Id);

}
