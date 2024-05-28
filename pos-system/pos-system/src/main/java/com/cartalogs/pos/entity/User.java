package com.cartalogs.pos.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user")
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "username") // Added column name for username
    private String username;

    @Column(name = "password") // Added column name for password
    private String password;

    @Column(name = "email") // Added column name for email
    private String email;

    @Column(name = "last_name") // Added column name for lastName
    private String lastName;

    @Column(name = "first_name") // Added column name for firstName
    private String firstName;

    @Column(name = "middle_name") // Added column name for middleName
    private String middleName;

    @Column(name = "user_position_id", nullable = false)
    private Long userPositionId;

    @Column(name = "user_role_id", nullable = false)
    private Long userPositionId;

    // Add additional fields as needed
    @Column(name = "subscription_start")
    private LocalDateTime subscriptionStart;

    @Column(name = "subscription_end")
    private LocalDateTime subscriptionEnd;

    // Method to check if subscription is expired
    public boolean isSubscriptionExpired() {
        if (subscriptionEnd == null) {
            // Subscription end date is not set, assume it's not expired
            return false;
        }
        return LocalDateTime.now().isAfter(subscriptionEnd);
    }
}