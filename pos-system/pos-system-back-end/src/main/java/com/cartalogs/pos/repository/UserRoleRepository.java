package com.cartalogs.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cartalogs.pos.entity.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    Role findByName(String name);
}
