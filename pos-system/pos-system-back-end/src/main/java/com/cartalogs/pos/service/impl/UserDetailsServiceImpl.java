package com.cartalogs.pos.service.impl;

import com.cartalogs.pos.entity.User;
import com.cartalogs.pos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRoleRepository userRoleRepository; 

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        } else if (user.isSubscriptionExpired) {
            // Handle subscription expiration
            // For example, you can return a ResponseEntity indicating the subscription has expired
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Subscription expired for user: " + user.getUsername());
        }

        // Retrieve the user's role ID
        Long roleId = user.getUserRoleId();

        // Retrieve the user's role by ID
        UserRole userRole = userRoleRepository.findById(roleId)
                .orElseThrow(() -> new RuntimeException("Role not found"));

        // Create a collection of granted authorities (roles)
        List<GrantedAuthority> authorities = Collections.singletonList(new SimpleGrantedAuthority(userRole.getName()));

        return new org.springframework.security.core.userdetails.User(
                user.getUsername(), user.getPassword(), authorities);
    }
}
