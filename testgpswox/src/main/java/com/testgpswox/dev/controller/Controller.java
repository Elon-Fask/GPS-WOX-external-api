package com.testgpswox.dev.controller;


import com.testgpswox.dev.entity.DeviceData;
import com.testgpswox.dev.entity.Root;
import com.testgpswox.dev.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private final Service service;
    @Autowired
    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping(path = "/getdata")
    public Root getData(){
        return service.getData();
    }


}
