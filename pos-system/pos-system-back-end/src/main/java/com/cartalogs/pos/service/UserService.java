package com.cartalogs.pos.service;

import com.cartalogs.pos.entity.User;

public interface UserService extends BaseEntityService<User, Long> {
    User findByName(String name);
}
