package com.gpswoxapi.external.controller;


import com.google.gson.Gson;
import com.gpswoxapi.external.dto.DeviceResponse;
import com.gpswoxapi.external.dto.DevicesDto;
import com.gpswoxapi.external.dto.LoginDto;
import com.gpswoxapi.external.dto.LoginResponse;
import com.gpswoxapi.external.model.DeviceData;
import com.gpswoxapi.external.model.Users;
import com.gpswoxapi.external.services.ExternalApiService;
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

    // login endpoint test
    @RequestMapping(value = "/login/test", method = RequestMethod.POST)
    public String loginTest(@RequestBody Users users) {
        return externalApiService.loginTest(users);
    }

    // login endpoint
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Users login(@RequestBody Users users) {
        return externalApiService.login(users);
    }


    @RequestMapping(value = "/login/test", method = RequestMethod.POST)
    public List<LoginResponse> loginToGpsWox(@RequestBody LoginDto loginDto) {
        return externalApiService.loginToGpsWox(loginDto);
    }

    @RequestMapping(value = "/login/test/i", method = RequestMethod.POST)
    public String loginToGpsWoxTest(@RequestBody LoginDto loginDto) {
        return externalApiService.loginToGpsWoxTest(loginDto);
    }

    @RequestMapping(value = "/devices/test", method = RequestMethod.POST)
    public String getAllDevicesDataTest(@RequestBody DeviceData deviceData) {
        return externalApiService.getAllDevicesDataTest(deviceData);
    }

    // GET all device information available
    @RequestMapping(value = "/devices", method = RequestMethod.POST)
    public List<DeviceResponse> getAllDevicesData(@RequestBody DevicesDto devicesDto) {
        return externalApiService.getAllDevicesData(devicesDto);
    }


    @RequestMapping(value = "/devices/test/i", method = RequestMethod.POST)
    public List<DevicesDto> getAllDevicesDataTestI(@RequestBody DeviceData deviceData) {
        return externalApiService.getAllDevicesDataTestI(deviceData);
    }


}



//    @RequestMapping(value = "/devices", method = RequestMethod.GET)
//    public DeviceData getDevicesData(@RequestParam){
//
//    }




    /*
    @RequestMapping(value = "/login")
    public Users login(@RequestHeader Users users){
        Users loginResponse = externalApiService.login(users);
        return loginResponse;
    }
*/


//    @PostMapping(value = "/login")
//    public Users login(@Valid @RequestBody Users users){
//        Users model = externalApiService.login(users);
//        return model;
//    }
