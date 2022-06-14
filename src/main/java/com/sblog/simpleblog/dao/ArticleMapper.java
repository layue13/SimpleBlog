package com.sblog.simpleblog.dao;

import com.sblog.simpleblog.entity.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 32958
 * 文章信息表
 */
@Mapper
public interface ArticleMapper {

    List<Article> findAllArticle();

    List<Article> findArticleByUserId(int userId);

//    List<Article> findArticleByTimeRange(Date startTime, Date endTime);

    int applyArticle(Article article);

    int modifyArticle(Article article);

    int removeArticleById(int Id);

    int isExistArticle(Article article);

}
