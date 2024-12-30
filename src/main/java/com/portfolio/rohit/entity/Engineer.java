package com.portfolio.rohit.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Entity
public class Engineer implements Serializable {

    @Serial
    private static final long serialVersionUID = -4258392267221190600L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String emailId;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String noticePeriod;

    @OneToMany(mappedBy = "engineer", cascade = CascadeType.ALL)
    private List<Experience> experiences;

    @OneToMany(mappedBy = "engineer", cascade = CascadeType.ALL)
    private List<Project> projects;

    @OneToMany(mappedBy = "engineer", cascade = CascadeType.ALL)
    private List<Achievement> achievements;

    @OneToMany(mappedBy = "engineer", cascade = CascadeType.ALL)
    private List<Education> educations;

    @OneToMany(mappedBy = "engineer", cascade = CascadeType.ALL)
    private List<Skill> skills;

    @OneToMany(mappedBy = "engineer", cascade = CascadeType.ALL)
    private List<Profile> profiles;
}
