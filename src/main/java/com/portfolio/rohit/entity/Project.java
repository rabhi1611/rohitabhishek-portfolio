package com.portfolio.rohit.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Entity
public class Project implements Serializable {

    @Serial
    private static final long serialVersionUID = -5258392267221190600L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer projectId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String detail;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Engineer engineer;
}
