package com.sblog.simpleblog.dao;

import com.sblog.simpleblog.entity.User;

import java.util.List;

/**
 * @author 32958
 * 用户信息表
 */
public interface UserMapper {

    List<User> findAllUser();

    User findUserById(int id);

    User findUserByName(String username);

    int insert(User user);

    int updateUser(User user);

    int deleteUserById(int id);


}
