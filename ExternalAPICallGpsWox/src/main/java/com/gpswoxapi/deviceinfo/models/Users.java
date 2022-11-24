package com.gpswoxapi.deviceinfo.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
@Getter
@Setter
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private int id;

    @Column(name = "email")
    @NotNull
    @Size(max=100)
    private String email;

    @Column(name = "password")
    @NotNull
    @Size(min=8,max=16)
    private String password;
}
