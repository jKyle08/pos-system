package com.cartalogs.pos.controller;

import com.cartalogs.pos.entity.UserPosition;
import com.cartalogs.pos.service.UserPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userRoles")
public class UserPositionController {

    private final UserPositionService userRoleService;

    @Autowired
    public UserPositionController(UserPositionService userRoleService) {
        this.userRoleService = userRoleService;
    }

    @PostMapping
    public UserPosition createUserPosition(@RequestBody UserPosition userRole) {
        return userRoleService.save(userRole);
    }

    @PutMapping("/{id}")
    public UserPosition updateUserPosition(@PathVariable Long id, @RequestBody UserPosition userRole) {
        userRole.setId(id);
        return userRoleService.update(userRole);
    }

    @DeleteMapping("/{id}")
    public void deleteUserPosition(@PathVariable Long id) {
        userRoleService.deleteById(id);
    }

    @GetMapping("/{id}")
    public UserPosition getUserPositionById(@PathVariable Long id) {
        return userRoleService.findById(id).orElse(null);
    }

    @GetMapping
    public List<UserPosition> getAllUserPositions() {
        return userRoleService.findAll();
    }

    @GetMapping("/byName/{name}")
    public UserRole getUserRoleByName(@PathVariable String name) {
        return userRoleService.findByName(name);
    }
}
