package com.gpswoxapi.deviceinfo.services;

import com.gpswoxapi.deviceinfo.models.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    UserService userService;

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        logger.info("username : " + username );
        Users users = this.userService.findByEmail(username);

        if (users==null){
            throw new UsernameNotFoundException("User cannot be found");
        }
        return new UserDetailsImp(users);
    }

    public UserDetails loadUserById(Long userId) throws UsernameNotFoundException{
        Optional<Users> userOptional = this.userService.findById(userId);

        Users user = userOptional.isPresent() ? userOptional.get() : null;

        if (user == null){
            throw new UsernameNotFoundException("User cannot be found");
        }
        return new UserDetailsImp(user);
    }



}
