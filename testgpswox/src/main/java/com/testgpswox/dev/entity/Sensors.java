package com.testgpswox.dev.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;


@Getter
@Setter
@Embeddable
public class Sensors {

    @Id
    @JsonProperty("id")
    private Integer sensorId;

    @JsonProperty("type")
    private String type;

    @JsonProperty("name")
    private String SensorName;

    @JsonProperty("value")
    private String value;



}
