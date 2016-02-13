package com.microthoughts.taxi.users.api;


import com.microthoughts.taxi.users.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "/users", description = "User Service")
@RestController
public interface UserServiceApi
{
    @ApiOperation(value = "Create user")
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    void createUser(@RequestBody User user);

    @ApiOperation(value = "Get all users")
    @RequestMapping("/users")
    public List<User> getUsers();

    @ApiOperation(value = "Get user by id")
    @RequestMapping("/users/{id}")
    public User getUser(@PathVariable("id") Long id);

    @ApiOperation(value = "Update user")
    @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
    public void updateUser(@PathVariable Long id, @RequestBody User user);

    @ApiOperation(value = "Delete user")
    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Long id);
}
