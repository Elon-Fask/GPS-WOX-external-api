package com.gpswoxapi.deviceinfo.controllers;

import com.gpswoxapi.deviceinfo.dto.LoginDto;
import com.gpswoxapi.deviceinfo.models.Users;
import com.gpswoxapi.deviceinfo.security.DeviceDetailsServiceImp;
import com.gpswoxapi.deviceinfo.security.JwtTokenProvider;
import com.gpswoxapi.deviceinfo.services.DeviceService;
import com.gpswoxapi.deviceinfo.services.UserServiceImpl;
import com.gpswoxapi.deviceinfo.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

public class UserController {


    private final UserServiceImpl userServiceImpl;
    private UserService userService;
    private PasswordEncoder passwordEncoder;
    private JwtTokenProvider jwtTokenProvider;
    private AuthenticationManager authenticationManager;
    private DeviceDetailsServiceImp deviceDetailsServiceImp;


    private Logger logger = LoggerFactory.getLogger(DeviceController.class);

    public UserController(UserService userService, PasswordEncoder passwordEncoder, UserServiceImpl userServiceImpl,
                          JwtTokenProvider jwtTokenProvider, AuthenticationManager authenticationManager){
        this.userService=userService;
        this.passwordEncoder=passwordEncoder;
        this.jwtTokenProvider=jwtTokenProvider;
        this.authenticationManager=authenticationManager;
        this.userServiceImpl=userServiceImpl;
    }






//    @PostMapping("")
//    public ResponseEntity<?> createUser(@RequestBody LoginDto loginDto){
//        String email = loginDto.getEmail();
//        String password = loginDto.getPassword() == null ? "" : loginDto.getPassword();
//
//        Map errorMessage = new HashMap();
//
//        //Validation
//
//        Users user = this.userService.findByEmail(email);
//        if (user!=null){
//            errorMessage.put("email, ", "Email already exists");
//        } if (password.length() == 0 ){
//            errorMessage.put("Password, ", "password is required");
//        }
//        if (!errorMessage.isEmpty()){
//            return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
//        }
//
//        user= new Users();
//        user.setEmail(email);
//        user.setPassword(this.passwordEncoder.encode(password));
//
//        this.userService.save(user);
//        return new ResponseEntity<>("User created Successfully", HttpStatus.OK);
//    }
}
