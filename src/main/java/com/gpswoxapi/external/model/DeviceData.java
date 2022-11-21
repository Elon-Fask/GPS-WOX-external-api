package com.gpswoxapi.external.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "DeviceData")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "id",
        "user_id",
        "name",
        "online"
})
public class DeviceData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("user_id")
    private Integer userId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("online")
    private String status;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "deviceData", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("device_data")
    private List<Sensor> sensorList = new ArrayList<>();



}