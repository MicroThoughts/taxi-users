package com.microthoughts.taxi.users.service.impl;

import com.base.repository.UserRepository;
import com.microthoughts.taxi.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService
{

    @Autowired
    private UserRepository userRepository;

    @Override
    public Long createUser(User user) {
        userRepository.save(user);
        return user.getId();
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.delete(id);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }
}
