package com.gpswoxapi.external.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;



@Entity
@Getter
@Setter
@Table(name = "Users")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "id",
        "user_api_hash",
        "email",
        "password"
})
public class Users {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private int id;

    @JsonProperty("user_api_hash")
    private String userApiHash;


    @JsonProperty("email")
    @NotNull
    private String email;


    @NotNull
    private String password;


    public Users(){

    }


    public Users(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
