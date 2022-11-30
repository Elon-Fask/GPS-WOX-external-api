package com.testgpswox.dev.config;



import com.testgpswox.dev.entity.DeviceData;
import com.testgpswox.dev.entity.Root;
import com.testgpswox.dev.repo.Repo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Configuration
@EnableScheduling
public class Config {


    @Bean
    CommandLineRunner commandLineRunner(Repo repo){
        return args -> {
            String URL = "http://app.aza-gps.ma/api/get_devices?lang=en&user_api_hash=$2y$10$/0F2gLuA4Fcdm6iSPwzFAeDrc9Y9rdOAfzFEKg7dffMd0ATFpNGDu";

            RestTemplate restTemplate = new RestTemplate();

            ResponseEntity<List<Root>> entity = restTemplate.exchange(
                    URL,
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<Root>>() {});

            List<Root> results = entity.getBody();

            repo.saveAll(results);


            System.out.println(results);

        };
    }



}
