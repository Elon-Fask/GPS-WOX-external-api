package com.gpswoxapi.external.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class LoginResponse {

    @JsonProperty("user_api_hash")
    private String userApiHash;


}
