package com.testgpswox.dev.service;


import com.testgpswox.dev.entity.DeviceData;
import com.testgpswox.dev.entity.Root;
import com.testgpswox.dev.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    private final Repo repo;
    @Autowired
    public Service(Repo repo) {
        this.repo = repo;
    }


    public Root getData(){
        return (Root) repo.findAll();

    }

}
