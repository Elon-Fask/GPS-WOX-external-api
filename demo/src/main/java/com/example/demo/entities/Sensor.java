package com.example.demo.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class Sensor {

    @JsonProperty("id")
    private Integer sensorId;

    @JsonProperty("type")
    private String sensorType;

    @JsonProperty("name")
    private String sensorName;

    @JsonProperty("value")
    private String sensorValue;



}
