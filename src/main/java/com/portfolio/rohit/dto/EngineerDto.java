package com.portfolio.rohit.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Setter
@Getter
public class EngineerDto {
    private String name;
    private String emailId;
    private String city;
    private String noticePeriod;
    private List<ExperienceDto> experiences;
    private List<ProjectDto> projects;
    private List<AchievementDto> achievements;
    private List<EducationDto> educations;
    private List<SkillDto> skills;
    private List<ProfileDto> profiles;
}
