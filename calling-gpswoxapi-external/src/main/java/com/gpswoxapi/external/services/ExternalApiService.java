package com.gpswoxapi.external.services;

import com.gpswoxapi.external.dto.DeviceResponse;
import com.gpswoxapi.external.dto.DevicesDto;
import com.gpswoxapi.external.dto.LoginDto;
import com.gpswoxapi.external.dto.LoginResponse;
import com.gpswoxapi.external.model.DeviceData;
import com.gpswoxapi.external.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

/*
*  Author :       Twitter   = @ABoulaajaili
*                 Github    = github.com/Elon-Fask
*                 LinkedIn  = linkedin.com/atman-boulaajaili
* */

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

    // loging endoint test
    public String loginTest(Users users){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<Users> entity = new HttpEntity<Users>(users,headers);

        return restTemplate.exchange(
                "http://app.aza-gps.ma/api/login", HttpMethod.POST, entity, String.class).getBody();
    }

    // Calling external api LOGIN endpoint
    public Users login(Users users){

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<Users> entity = new HttpEntity<Users>(users,headers);

        return restTemplate.exchange(
                loginBaseUrl,
                HttpMethod.POST,
                entity,
                Users.class
        ).getBody();
    }

    public String getAllDevicesDataTest(DeviceData deviceData ){

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<DeviceData> HttpEntity = new HttpEntity<DeviceData>(deviceData,httpHeaders);

        return restTemplate.exchange(
                "http://app.aza-gps.ma/api/get_devices",
                HttpMethod.POST,
                HttpEntity,
                String.class
        ).getBody();
    }

    public List<LoginResponse> loginToGpsWox(LoginDto loginDto ) {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<LoginDto> loginEntity = new HttpEntity<LoginDto>(loginDto, httpHeaders);

        return restTemplate.exchange(
                loginBaseUrl,
                HttpMethod.POST,
                loginEntity,
                new ParameterizedTypeReference<List<LoginResponse>>() {
                }).getBody();

    }

    public String loginToGpsWoxTest(LoginDto loginDto ) {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<LoginDto> loginEntity = new HttpEntity<LoginDto>(loginDto, httpHeaders);

        return restTemplate.exchange(
                loginBaseUrl,
                HttpMethod.POST,
                loginEntity,
                String.class).getBody();

    }


    // get all devices
    public List<DeviceResponse> getAllDevicesData(DevicesDto devicesDto ){

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<DevicesDto> deviceEntity = new HttpEntity<DevicesDto>(devicesDto, httpHeaders);

        return restTemplate.exchange(
                getDevicesBaseUrl,
                HttpMethod.POST,
                deviceEntity,
                new ParameterizedTypeReference<List<DeviceResponse>>() {
                }).getBody();
    }

    public List<DevicesDto> getAllDevicesDataTestI(DeviceData deviceData ) {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<DeviceData> deviceEntity = new HttpEntity<DeviceData>(deviceData, httpHeaders);

        return restTemplate.exchange(
                getDevicesBaseUrl,
                HttpMethod.POST,
                deviceEntity,
                new ParameterizedTypeReference<List<DevicesDto>>() {
                }).getBody();

    }


}
