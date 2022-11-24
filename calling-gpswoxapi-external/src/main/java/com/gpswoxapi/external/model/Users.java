package com.gpswoxapi.external.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.gpswoxapi.external.dto.UserDto;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Table(name = "Users")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "user_api_hash",
        "2"
})
public class Users {

    @JsonProperty("2")
    public com.gpswoxapi.external.dto.UserDto userDto;

    @JsonProperty("user_api_hash")
    private String userApiHash;


}
