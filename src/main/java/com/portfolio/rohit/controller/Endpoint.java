package com.portfolio.rohit.controller;

import com.portfolio.rohit.dto.EngineerDto;
import com.portfolio.rohit.service.EngineerServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class Endpoint {

    private final EngineerServiceImpl engineerService;

    Endpoint(EngineerServiceImpl engineerService) {
        this.engineerService = engineerService;
    }

    @GetMapping(value = "/", produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<EngineerDto> getDetails() {
        return new ResponseEntity<>(engineerService.getDetails(), HttpStatus.OK);
    }
}
