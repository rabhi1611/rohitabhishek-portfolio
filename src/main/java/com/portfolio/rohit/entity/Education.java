package com.portfolio.rohit.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Entity
public class Education implements Serializable {

    @Serial
    private static final long serialVersionUID = -1258392267221190600L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer educationId;

    @Column(nullable = false)
    private String course;

    @Column(nullable = false)
    private String major;

    @Column(nullable = false)
    private String university;

    @Column(nullable = false)
    private String startYear;

    @Column(nullable = false)
    private String endYear;

    @Column(nullable = false)
    private String grade;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Engineer engineer;
}
