package com.portfolio.rohit.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class ExperienceDto {
    private String role;
    private String company;
    private String summary;
    private String startDate;
    private String endDate;
}
