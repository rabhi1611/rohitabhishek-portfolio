package com.portfolio.rohit.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Entity
public class Profile implements Serializable {

    @Serial
    private static final long serialVersionUID = -3258392267221190600L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer profileId;

    @Column(nullable = false)
    private String socialName;

    @Column(nullable = false)
    private String link;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Engineer engineer;
}
