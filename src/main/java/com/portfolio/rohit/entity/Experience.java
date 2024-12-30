package com.portfolio.rohit.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Entity
public class Experience implements Serializable {

    @Serial
    private static final long serialVersionUID = -2258392267221190600L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer experienceId;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false)
    private String company;

    @Column(nullable = false)
    private String summary;

    @Column(nullable = false)
    private String startDate;

    @Column(nullable = false)
    private String endDate;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Engineer engineer;
}
