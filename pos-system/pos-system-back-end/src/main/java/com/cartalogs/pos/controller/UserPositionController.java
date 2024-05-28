package com.cartalogs.pos.controller;

import com.cartalogs.pos.entity.UserPosition;
import com.cartalogs.pos.service.UserPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userPositions")
public class UserPositionController {

    private final UserPositionService userPositionService;

    @Autowired
    public UserPositionController(UserPositionService userPositionService) {
        this.userPositionService = userPositionService;
    }

    @PostMapping
    public UserPosition createUserPosition(@RequestBody UserPosition userPosition) {
        return userPositionService.save(userPosition);
    }

    @PutMapping("/{id}")
    public UserPosition updateUserPosition(@PathVariable Long id, @RequestBody UserPosition userPosition) {
        userPosition.setId(id);
        return userPositionService.update(userPosition);
    }

    @DeleteMapping("/{id}")
    public void deleteUserPosition(@PathVariable Long id) {
        userPositionService.deleteById(id);
    }

    @GetMapping("/{id}")
    public UserPosition getUserPositionById(@PathVariable Long id) {
        return userPositionService.findById(id).orElse(null);
    }

    @GetMapping
    public List<UserPosition> getAllUserPositions() {
        return userPositionService.findAll();
    }

    @GetMapping("/byName/{name}")
    public UserPosition getUserPositionByName(@PathVariable String name) {
        return userPositionService.findByName(name);
    }
}
