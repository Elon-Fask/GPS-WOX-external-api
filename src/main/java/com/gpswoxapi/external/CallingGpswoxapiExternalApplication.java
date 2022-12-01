package com.gpswoxapi.external;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.convert.Jsr310Converters;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.spring.wrapper.PatternsRequestCondition;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Set;

@SpringBootApplication
@EnableWebMvc
@EnableSwagger2
@EntityScan(basePackageClasses = {
        CallingGpswoxapiExternalApplication.class,
        Jsr310Converters.class
})
public class CallingGpswoxapiExternalApplication {

    public static void main(String[] args) {
        SpringApplication.run(CallingGpswoxapiExternalApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }


//
//    @Bean
//    public PatternsRequestCondition patternsRequestCondition(){
//        return new PatternsRequestCondition() {
//            @Override
//            public PatternsRequestCondition combine(PatternsRequestCondition other) {
//                return null;
//            }
//
//            @Override
//            public Set<String> getPatterns() {
//                return null;
//            }
//        };
//    }
//
//


}
