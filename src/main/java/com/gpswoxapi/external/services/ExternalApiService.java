package com.gpswoxapi.external.services;

import com.gpswoxapi.external.model.Users;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


@Service
public class ExternalApiService {

    @Autowired
    private RestTemplate restTemplate;

    // External api endpoint, GET /api/login
    @Value("${api.login.baseUrl}")
    String loginBaseUrl;
    // External endpoint, GET /api/get_devices
    @Value("${api.getdevice.baseUrl}")
    String getDevicesBaseUrl;


//    public ResponseEntity<String> login(String email, String password){
//        // create request body
//        JSONObject request = new JSONObject();
//        request.put("elon.fask@test.com", email);
//        request.put("elon.fask@test.com", password);
//
//
//// set headers
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        HttpEntity<String> entity = new HttpEntity<String>(request.toString(), headers);
//
//// send request and parse result
//        ResponseEntity<String> loginResponse = restTemplate
//                .exchange(loginBaseUrl, HttpMethod.POST, entity, String.class);
//        if (loginResponse.getStatusCode() == HttpStatus.OK) {
//            JSONObject userJson = new JSONObject(loginResponse.getBody());
//        } else if (loginResponse.getStatusCode() == HttpStatus.UNAUTHORIZED) {
//            // nono... bad credentials
//            System.out.println("bad credentials");
//        }
//    }








    /*
    @Override
    public Users login(Users users) {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Users> loginResponse = new HttpEntity<>(users, httpHeaders);
        return restTemplate.exchange(loginBaseUrl, HttpMethod.GET, loginResponse, Users.class).getBody();
    }
    */


//    @Override
//    public Users login(Users users){
//        Users model = null;
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//
//        HttpEntity<Users> httpEntity = new HttpEntity<>(users, httpHeaders);
//        ResponseEntity<Users> loginResponse = restTemplate.postForEntity(loginBaseUrl, httpEntity, Users.class);
//
//        if (loginResponse.getStatusCode() == HttpStatus.OK) {
//            model = loginResponse.getBody();
//        }
//        return model;
//    }



}
