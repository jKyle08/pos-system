package com.cartalogs.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cartalogs.pos.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
