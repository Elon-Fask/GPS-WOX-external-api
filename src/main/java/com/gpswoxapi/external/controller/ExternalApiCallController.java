package com.gpswoxapi.external.controller;


import com.gpswoxapi.external.services.ExternalApiCallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class ExternalApiCallController {

    @Autowired
    private ExternalApiCallService externalApiCallService;

    @GetMapping("/health")
    public String checkHealth(){
        return "I'm working fine";
    }




}
