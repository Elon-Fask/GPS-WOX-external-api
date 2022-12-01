package com.gpswoxapi.external.services.gpswoxservice;

import com.gpswoxapi.external.dto.response.DeviceResponse;
import com.gpswoxapi.external.dto.DevicesDto;
import com.gpswoxapi.external.dto.LoginDto;
import com.gpswoxapi.external.dto.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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


    /*
    * Login into GPS-WOX External API
    * */
    public LoginResponse loginToGpsWoxTest(LoginDto loginDto ) {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<LoginDto> loginEntity = new HttpEntity<LoginDto>(loginDto, httpHeaders);

        return restTemplate.exchange(
                loginBaseUrl,
                HttpMethod.POST,
                loginEntity,
                LoginResponse.class).getBody();

    }

    // get all devices from the GPS-Wox external api
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

}
