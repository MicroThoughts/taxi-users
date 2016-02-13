package com.microthoughts.taxi.users.impl;

import com.microthoughts.taxi.users.api.UserServiceApi;
import com.microthoughts.taxi.users.model.User;
import com.microthoughts.taxi.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserWebService implements UserServiceApi
{
    @Autowired
    private UserService userService;

    public void createUser(User user)
    {
        userService.createUser(user);
    }

    public List<User> getUsers()
    {
        return userService.findAll();
    }

    public User getUser(Long id)
    {
        return userService.getUser(id);
    }

    public void updateUser(Long id, User user)
    {
        user.setId(id);
        userService.updateUser(user);
    }

    public void deleteUser(Long id)
    {
        userService.deleteUser(id);
    }
}
