package com.gpswoxapi.external.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class DevicesDto {


    @JsonProperty("lang")
    private String lang;

    @JsonProperty("user_api_hash")
    private String userApiHash;




}
