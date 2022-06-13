package com.sblog.simpleblog.service;

import com.sblog.simpleblog.entity.User;

public interface UserService {
    boolean login(String username, String password);

    User findUserById(int id);
}
