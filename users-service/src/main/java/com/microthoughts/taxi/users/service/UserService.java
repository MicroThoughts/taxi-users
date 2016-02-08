package com.microthoughts.taxi.users.service;

import java.util.List;

public interface UserService {

    Long createUser(User user);
    User getUser(Long id);
    void updateUser(User user);
    void deleteUser(Long id);
    List<User> findAll();

}
