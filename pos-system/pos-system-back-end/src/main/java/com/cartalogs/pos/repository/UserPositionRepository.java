package com.cartalogs.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cartalogs.pos.entity.UserPosition;

public interface UserPositionRepository extends JpaRepository<UserPosition, Long> {
    Position findByName(String name);
}