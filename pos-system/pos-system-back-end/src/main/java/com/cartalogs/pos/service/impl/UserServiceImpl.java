package com.cartalogs.pos.service.impl;

import com.cartalogs.pos.entity.User;
import com.cartalogs.pos.repository.UserRepository;
import com.cartalogs.pos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseEntityServiceImpl<User, Long> implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }
}
