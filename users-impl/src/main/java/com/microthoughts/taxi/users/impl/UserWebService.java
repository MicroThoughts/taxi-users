package com.microthoughts.taxi.users.impl;


import com.base.entity.User;
import com.base.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Api(value = "/users", description = "User Service")
@RestController
public class UserWebService implements UserServiceAPI
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
