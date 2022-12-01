package com.gpswoxapi.external.controller.gpswoxcontroller;


import com.google.gson.Gson;
import com.gpswoxapi.external.dto.response.DeviceResponse;
import com.gpswoxapi.external.dto.DevicesDto;
import com.gpswoxapi.external.dto.LoginDto;
import com.gpswoxapi.external.dto.response.LoginResponse;
import com.gpswoxapi.external.model.Users;
import com.gpswoxapi.external.services.gpswoxservice.ExternalApiService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/*
 *  Author :       Twitter   = @ABoulaajaili
 *                 Github    = github.com/Elon-Fask
 *                 LinkedIn  = linkedin.com/atman-boulaajaili
 * */

@RestController
@RequestMapping("/home")
public class ExternalApiController {

    private static final Logger logger = LogManager.getLogger(Users.class);

    @Autowired
    Gson gson;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ExternalApiService externalApiService;

    @GetMapping("/health")
    String checkHealth() {
        return "Working 100%";
    }

    // login endpoint
    @RequestMapping(value = "/login/test/i", method = RequestMethod.POST)
    public LoginResponse loginToGpsWoxTest(@RequestBody LoginDto loginDto) {
        return externalApiService.loginToGpsWoxTest(loginDto);
    }

    // GET all device information available
    @RequestMapping(value = "/devices", method = RequestMethod.POST)
    public List<DeviceResponse> getAllDevicesData(@RequestBody DevicesDto devicesDto) {
        return externalApiService.getAllDevicesData(devicesDto);
    }
}
