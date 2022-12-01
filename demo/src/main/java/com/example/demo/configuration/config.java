package com.example.demo.configuration;


import com.example.demo.entities.Item;
import com.example.demo.entities.Root;
import com.example.demo.repository.Repo;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Configuration
@ComponentScan("com.example.demo")
//@EnableScheduling
public class config {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

//    @Bean
//    RestTemplate restTemplate() {
//        RestTemplate restTemplate = new RestTemplate();
////        MappingJacksonHttpMessageConverter converter = new MappingJacksonHttpMessageConverter();
////        converter.setObjectMapper(new ObjectMapper());
////        restTemplate.getMessageConverters().add(converter);
//        return restTemplate;
//    }


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

            repo.saveAllAndFlush(results);


            System.out.println(results);

        };
    }


}
