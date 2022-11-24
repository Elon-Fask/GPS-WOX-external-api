package com.gpswoxapi.deviceinfo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@Setter
public class LoginDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @NotBlank
    private String email;

    @NotBlank
    private String password;


    public LoginDto(){

    }
}
