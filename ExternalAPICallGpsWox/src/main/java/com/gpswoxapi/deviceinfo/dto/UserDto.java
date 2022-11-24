package com.gpswoxapi.deviceinfo.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private String email;
    private String password;

    public UserDto() {
    }

}
