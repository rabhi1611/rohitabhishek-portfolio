package com.portfolio.rohit.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class ProjectDto {
    private String name;
    private String detail;
}
