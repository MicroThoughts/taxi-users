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
    @ApiOperation(value = "Create user", httpMethod = "POST")
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    void createUser(@RequestBody User user);

    @ApiOperation(value = "Get all users", httpMethod = "GET")
    @RequestMapping("/users")
    public List<User> getUsers();

    @ApiOperation(value = "Get user by id", httpMethod = "GET")
    @RequestMapping("/users/{id}")
    public User getUser(@PathVariable("id") Long id);

    @ApiOperation(value = "Update user", httpMethod = "PUT")
    @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
    public void updateUser(@PathVariable Long id, @RequestBody User user);

    @ApiOperation(value = "Delete user", httpMethod = "DELETE")
    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Long id);
}
