package com.gpswoxapi.external.dto;


import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.gpswoxapi.external.model.DeviceData;
import com.gpswoxapi.external.model.Sensor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "online",
        "sensors",
        "device_data"
})
@Generated("jsonschema2pojo")
public class Item {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("online")
    public String online;
    @JsonIgnore
    @JsonProperty("sensors")
    public List<Sensor> sensors;
    @JsonProperty("device_data")
    public DeviceData deviceData;

}
