package com.gpswoxapi.external.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.util.GenericSignature;

@Entity
@Getter
@Setter
@Table(name = "Sensors")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "id",
        "type",
        "name",
        "value"
})
public class Sensor {

    @Id
    @JsonProperty("Sensor_id")
    private Integer sensorId;

    @JsonProperty("type")
    private String type;

    @JsonProperty("name")
    private String name;

    @JsonProperty("value")
    private String value;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "device_data_id")
    private DeviceData deviceData;

}