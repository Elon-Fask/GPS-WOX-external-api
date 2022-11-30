package com.testgpswox.dev.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcType;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@JsonPropertyOrder({
        "id",
        "name",
        "online",
        "sensors",
        "device_data"
})
@Embeddable
@Getter
@Setter
public class Items{

    @JsonProperty("id")
    private Integer deviceId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("online")
    private String online;

    @JsonProperty("time")
    private String time;


//    @JsonProperty("sensors")
//    @Transient
//    @Embedded
//    @ElementCollection
//    @JdbcTypeCode(SqlTypes.ARRAY)
//    public List<Sensors> sensorsList;



//    @JsonProperty("users")
//    @Embedded
//    public Users users;


    @JsonProperty("device_data")
    @Embedded
    public DeviceData deviceData;




}







//@Entity
//@Getter
//@Setter
//public class Items {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @JsonProperty("id")
//    private Integer id;
//
//    @JsonProperty("name")
//    private String name;
//
//
//    public DeviceData deviceData;
//
//
//
//}
