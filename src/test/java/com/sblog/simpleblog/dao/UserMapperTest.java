package com.sblog.simpleblog.dao;

import com.sblog.simpleblog.SimpleBlogApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 32958
 */
@SpringBootTest(classes = {SimpleBlogApplication.class})
@SpringBootApplication
class UserMapperTest {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Test
    void findAllUser() {
    }

    @Test
    void findUserById() {
//        assertEquals(userMapper.findUserById(2).getName(),"2782911547");
    }

    @Test
    void findUserByName() {
    }

    @Test
    void apply() {
    }

    @Test
    void modifyUser() {
    }

    @Test
    void removeUserById() {
    }

    @Test
    void selectByKeyword() {
    }
}