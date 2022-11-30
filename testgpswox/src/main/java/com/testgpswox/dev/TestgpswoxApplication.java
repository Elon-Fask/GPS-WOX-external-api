package com.testgpswox.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TestgpswoxApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestgpswoxApplication.class, args);
    }

}
