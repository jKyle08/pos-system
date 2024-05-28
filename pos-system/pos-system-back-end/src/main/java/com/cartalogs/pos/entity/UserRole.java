package com.cartalogs.pos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
@Data
public class UserRole extends BaseEntity {

    Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_role_id")
    private Long id;

    @Column(name = "user_role_name")
    private String userRoleName;
}