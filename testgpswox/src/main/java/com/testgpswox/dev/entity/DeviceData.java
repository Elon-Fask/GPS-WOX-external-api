package com.testgpswox.dev.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.jws.soap.SOAPMessageHandlers;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.JdbcTypeCode;

import java.util.ArrayList;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "user_id",
        "active",
        "name",
        "sensors",
        "users"
})
@Getter
@Setter
@NoArgsConstructor
@Embeddable

public class DeviceData {


    @JsonProperty("id")
    public Integer nestedId;


    @JsonProperty("user_id")
    public Integer userId;
//    @JsonProperty("active")
//    public Integer active;
    @JsonProperty("name")
    public String deviceName;




    @JsonProperty("sensors")
    @ElementCollection
    public List<Sensors> sensors;




}
