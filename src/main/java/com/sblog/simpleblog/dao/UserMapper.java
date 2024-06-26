package com.sblog.simpleblog.dao;

import com.sblog.simpleblog.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 32958
 * 用户信息表
 */
@Mapper
public interface UserMapper {

    List<User> findAllUser();

    User findUserById(int id);

    User findUserByName(String username);

    int apply(User user);

    int modifyUser(User user);

    int removeUserById(int id);

    List<User> selectByKeyword(String keyword);

    int isExistUser(String username);

}
