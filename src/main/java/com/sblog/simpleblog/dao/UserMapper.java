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

    int apply(User user);

    int modifyUser(User user);

    int removeUserById(int id);


}
