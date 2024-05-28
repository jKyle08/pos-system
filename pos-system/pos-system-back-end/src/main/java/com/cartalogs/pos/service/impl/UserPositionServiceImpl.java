package com.cartalogs.pos.service.impl;

import com.cartalogs.pos.entity.UserPosition;
import com.cartalogs.pos.repository.UserPositionRepository;
import com.cartalogs.pos.service.UserPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPositionServiceImpl extends BaseEntityServiceImpl<UserPosition, Long> implements UserPositionService {

    private final UserPositionRepository userPositionRepository;

    @Autowired
    public UserPositionServiceImpl(UserPositionRepository userPositionRepository) {
        super(userPositionRepository);
        this.userPositionRepository = userPositionRepository;
    }

    @Override
    public UserPosition findByName(String name) {
        return userPositionRepository.findByName(name);
    }
}
