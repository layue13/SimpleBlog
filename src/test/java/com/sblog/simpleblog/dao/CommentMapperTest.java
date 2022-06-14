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
class CommentMapperTest {

    private CommentMapper commentMapper;

    @Autowired
    public void setCommentMapper(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    @Test
    void findAllComment(@Autowired CommentMapper commentMapper) {
        assertEquals(commentMapper.findAllComment().get(0).getContent(), "好，讲的非常好");
    }

    @Test
    void findCommentById() {
    }

    @Test
    void apply() {
    }

    @Test
    void modify() {
    }

    @Test
    void removeById() {
    }
}