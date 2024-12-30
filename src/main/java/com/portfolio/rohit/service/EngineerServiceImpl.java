package com.portfolio.rohit.service;

import com.portfolio.rohit.dto.*;
import com.portfolio.rohit.entity.Engineer;
import com.portfolio.rohit.repository.EngineerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EngineerServiceImpl implements EngineerService {

    private final EngineerRepository engineerRepository;

    EngineerServiceImpl(EngineerRepository engineerRepository) {
        this.engineerRepository = engineerRepository;
    }

    @Override
    public EngineerDto getDetails() {
        Optional<Engineer> engineer = engineerRepository.findById(1);
        return engineer.map(person -> EngineerDto.builder()
                .name(person.getName())
                .emailId(person.getEmailId())
                .city(person.getCity())
                .noticePeriod(person.getNoticePeriod())
                .achievements(person.getAchievements().stream().map(achievement
                        -> AchievementDto.builder().achievement(achievement.getAchievement()).build()).toList())
                .educations(person.getEducations().stream().map(education
                        -> EducationDto.builder().course(education.getCourse()).major(education.getMajor())
                        .startYear(education.getStartYear()).endYear(education.getEndYear()).grade(education.getGrade())
                        .university(education.getUniversity()).build()).toList())
                .experiences(person.getExperiences().stream().map(experience
                        -> ExperienceDto.builder().role(experience.getRole()).company(experience.getCompany())
                        .summary(experience.getSummary()).startDate(experience.getStartDate())
                        .endDate(experience.getEndDate()).build()).toList())
                .skills(person.getSkills().stream().map(skill
                        -> SkillDto.builder().skill(skill.getSkill()).build()).toList())
                .projects(person.getProjects().stream().map(project
                        -> ProjectDto.builder().name(project.getName()).detail(project.getDetail()).build()).toList())
                .profiles(person.getProfiles().stream().map(profile
                        -> ProfileDto.builder().socialName(profile.getSocialName()).link(profile.getLink()).build()).toList())
                .build()).orElse(null);
    }
}
