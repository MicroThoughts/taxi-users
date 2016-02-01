package com.users.service;

import com.users.entity.User;

import java.util.List;

public interface UserService {

    Long createUser(User user);
    User getUser(Long id);
    void updateUser(User user);
    void deleteUser(Long id);
    List<User> findAll();

}
