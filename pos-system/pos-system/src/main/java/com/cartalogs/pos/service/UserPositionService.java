package com.cartalogs.pos.service;

import com.cartalogs.pos.entity.UserPosition;

public interface UsePositionService extends BaseEntityService<UserPosition, Long> {
   UserPosition findByName(String name);
}