package com.gpswoxapi.external.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.gpswoxapi.external.model.DeviceData;
import com.gpswoxapi.external.model.Users;
import com.gpswoxapi.external.services.ExternalApiService;
import net.minidev.json.JSONObject;
import netscape.javascript.JSObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


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


    @RequestMapping(value = "/login/test", method = RequestMethod.POST)
    public String login(@RequestBody Users users) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<Users> entity = new HttpEntity<Users>(users,headers);

        return restTemplate.exchange(
                "http://app.aza-gps.ma/api/login", HttpMethod.POST, entity, String.class).getBody();


    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Users login1(@RequestBody Users users) {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<Users> entity = new HttpEntity<Users>(users,headers);

        return restTemplate.exchange(
                "http://app.aza-gps.ma/api/login",
                HttpMethod.POST,
                entity,
                Users.class
                ).getBody();

    }


    @RequestMapping(value = "/devices", method = RequestMethod.GET)
    public DeviceData getDevicesData(@RequestParam){

    }




}




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
