package com.gpswoxapi.deviceinfo.controllers;


import com.gpswoxapi.deviceinfo.dto.LoginDto;
import com.gpswoxapi.deviceinfo.models.Users;
import com.gpswoxapi.deviceinfo.security.DeviceDetailsServiceImp;
import com.gpswoxapi.deviceinfo.security.JwtTokenProvider;
import com.gpswoxapi.deviceinfo.services.DeviceService;
import com.gpswoxapi.deviceinfo.services.UserService;
import com.gpswoxapi.deviceinfo.services.UserDetailsImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import org.springframework.validation.Errors;
import org.springframework.security.core.Authentication;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import reactor.core.publisher.Flux;


import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1")
public class DeviceController {

    @GetMapping("/health")
    public String checkHealth(){
        return "I am workin fine !";
    }


    private DeviceService deviceService;
    private PasswordEncoder passwordEncoder;
    private JwtTokenProvider jwtTokenProvider;
    private UserService userService;
    private AuthenticationManager authenticationManager;
    private DeviceDetailsServiceImp deviceDetailsServiceImp;


    private Logger logger = LoggerFactory.getLogger(DeviceController.class);

    public DeviceController(DeviceService deviceService){
        this.deviceService=deviceService;
    }





//    @PostMapping("/auth/login")
//    public ResponseEntity<?> login(@Valid @RequestBody LoginDto loginDto, Errors errors){
//
//        if (errors.hasErrors()){
//            return new ResponseEntity<>("Bad Credentials", HttpStatus.BAD_REQUEST);
//        }
//
//        Authentication authentication = this.authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(loginDto.getEmail(), loginDto.getPassword()));
//
//        Users users = this.userService.findByEmail(loginDto.getUsername());
//
//        String token = this.jwtTokenProvider.generateToken(new UserDetailsImp(users));
//
//        // I'm not sure about this block!!!!!
//
//        Map responseBody = new HashMap();
//        responseBody.put("token", token);
//        responseBody.put("email", users.getEmail());
//
//        return new ResponseEntity<>(responseBody, HttpStatus.OK);
//    }



    
    
    
    

}





