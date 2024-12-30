package com.portfolio.rohit.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class ProfileDto {
    private String socialName;
    private String link;
}
