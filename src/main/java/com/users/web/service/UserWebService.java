package com.users.web.service;


import com.users.entity.User;
import com.users.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "/users", description = "User Service")
@RestController
public class UserWebService
{
    @Autowired
    private UserService userService;

    @ApiOperation(value = "Create user", httpMethod = "POST")
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public void createUser(@RequestBody User user)
    {
        userService.createUser(user);
    }

    @ApiOperation(value = "Get all users", httpMethod = "GET")
    @RequestMapping("/users")
    public List<User> getUsers()
    {
        return userService.findAll();
    }

    @ApiOperation(value = "Get user by id", httpMethod = "GET")
    @RequestMapping("/users/{id}")
    public User getUser(@PathVariable("id") Long id)
    {
        return userService.getUser(id);
    }

    @ApiOperation(value = "Update user", httpMethod = "PUT")
    @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
    public void updateUser(@PathVariable Long id, @RequestBody User user)
    {
        user.setId(id);
        userService.updateUser(user);
    }

    @ApiOperation(value = "Delete user", httpMethod = "DELETE")
    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Long id)
    {
        userService.deleteUser(id);
    }
}
