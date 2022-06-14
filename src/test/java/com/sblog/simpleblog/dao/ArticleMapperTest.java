package com.sblog.simpleblog.dao;

import com.sblog.simpleblog.SimpleBlogApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author 32958
 */
@SpringBootTest(classes = {SimpleBlogApplication.class})
@SpringBootApplication
class ArticleMapperTest {

    @Test
    void findAllArticle(@Autowired ArticleMapper articleMapper) {
        assertEquals(articleMapper.findArticleByUserId(2).get(0).getTitle(), "这些Java基础知识，诸佬们都还记得嘛(学习，复习，面试均可)");
    }

    @Test
    void findArticleByUserId(@Autowired ArticleMapper articleMapper) {
        assertEquals(articleMapper.findArticleByUserId(2).get(0).getTitle(), "这些Java基础知识，诸佬们都还记得嘛(学习，复习，面试均可)");
    }

    @Test
    void applyArticle() {
//        User user = new User();
//        user.setId(2);
//        Article article = new Article();
//        article.setTitle("放噶说不定发");
//        article.setContent("爱说大话放噶十八个");
//        article.setPublisher(user);
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