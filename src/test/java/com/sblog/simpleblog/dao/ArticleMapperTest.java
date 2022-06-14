package com.sblog.simpleblog.dao;

import com.sblog.simpleblog.SimpleBlogApplication;
import com.sblog.simpleblog.entity.Article;
import com.sblog.simpleblog.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author 32958
 */
@SpringBootTest(classes = {SimpleBlogApplication.class})
@SpringBootApplication
@Transactional
class ArticleMapperTest {

    private ArticleMapper articleMapper;

    @Autowired
    public void setArticleMapper(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    @Test
    void findAllArticle() {
        assertEquals(articleMapper.findArticleByUserId(2).get(0).getTitle(), "这些Java基础知识，诸佬们都还记得嘛(学习，复习，面试均可)");
    }

    @Test
    void findArticleByUserId() {
        assertEquals(articleMapper.findArticleByUserId(2).get(0).getTitle(), "这些Java基础知识，诸佬们都还记得嘛(学习，复习，面试均可)");
    }

    @Test
    void applyArticle() {
        User user = new User();
        user.setId(5);
        user.setName("testUserName");
        user.setNickName("testNickName");
        user.setPassword("testPassword");
        user.setPasswordQuestion("testPassQuestion");
        user.setPasswordQuestionAnswer("testPassQuestionAnswer");
        Article article = new Article();
        article.setTitle("放噶说不定发");
        article.setContent("爱说大话放噶十八个");
        article.setPublisher(user);
        article.setPublishTime(new Date());
        article.setCommentAmount(23523L);
        article.setPublisher(user);
    }

    @Test
    void modifyArticle() {
        System.out.println(1);
    }

    @Test
    void removeArticleById() {
        System.out.println(1);
    }
}