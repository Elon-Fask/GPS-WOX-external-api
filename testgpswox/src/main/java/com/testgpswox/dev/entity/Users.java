package com.testgpswox.dev.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "user_api_hash",
        "2"
})
@Data
@Embeddable
public class Users {

    @JsonProperty("2")
    public _2 _2;

    @JsonProperty("user_api_hash")
    private String userApiHash;


}
