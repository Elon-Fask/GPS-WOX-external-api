package com.testgpswox.dev.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class _2 {



    @JsonProperty("id")
    public Integer id;

    @JsonProperty("email")
    public String email;

}
