package com.portfolio.rohit.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class EducationDto {
    private String course;
    private String major;
    private String university;
    private String startYear;
    private String endYear;
    private String grade;
}
