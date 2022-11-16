package com.gpswoxapi.external.services;

import com.gpswoxapi.external.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements ExternalApiCallService {

    @Value("${api.login.baseurl}")
    private String apiLoginBaseUrl;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Users login(Users users) {
        return null;


    }
}
