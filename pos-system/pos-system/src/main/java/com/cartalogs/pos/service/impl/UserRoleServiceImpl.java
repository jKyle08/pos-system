package com.cartalogs.pos.service.impl;

import com.cartalogs.pos.entity.UserRole;
import com.cartalogs.pos.repository.UserRoleRepository;
import com.cartalogs.pos.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl extends BaseEntityServiceImpl<UserRole, Long> implements UserRoleService {

    private final UserRoleRepository userRoleRepository;

    @Autowired
    public UserRoleServiceImpl(UserRoleRepository userRoleRepository) {
        super(userRoleRepository);
        this.userRoleRepository = userRoleRepository;
    }

    @Override
    public UserRole findByName(String name) {
        return userRoleRepository.findByName(name);
    }
}
