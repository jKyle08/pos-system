package com.cartalogs.pos.service;

import com.cartalogs.pos.entity.UserRole;

public interface UserRoleService extends BaseEntityService<UserRole, Long> {
    UserRole findByName(String name);
}
