package com.example.pos.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
@EqualsAndHashCode(callSuper = false)
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "CREATED_DATE", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_DATE")
    private LocalDateTime updatedAt;

    @Column(name = "created_by", nullable = false)
    private Long createdBy;

    @Column(name = "updated_by")
    private Long updatedBy;

    @Column(name = "ACTIVE", nullable = false)
    private boolean active;

    // Add additional common fields as needed
}