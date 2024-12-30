package com.portfolio.rohit.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Entity
public class Achievement implements Serializable {

    @Serial
    private static final long serialVersionUID = -7258392267221190600L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer achievementId;

    @Column(nullable = false)
    private String achievement;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Engineer engineer;
}
