package com.cartalogs.pos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_position")
@Data
public class UserPosition extends BaseEntity {

    Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_position_id")
    private Long id;

    @Column(name = "user_position_name")
    private String userPositionName;
}