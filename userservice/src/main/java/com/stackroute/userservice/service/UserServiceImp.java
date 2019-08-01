package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImp implements UserService {
    UserRepository userRepository;
    @Autowired
    public UserServiceImp (UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }
}
