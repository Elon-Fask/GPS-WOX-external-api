package com.example.demo.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
//@Embeddable
public class Item {

    @Id
    @JsonProperty("id")
    private Integer deviceId;

    @JsonProperty("name")
    private String deviceName;

    @JsonProperty("online")
    private String status;

    @JsonProperty("time")
    private String time;


    @ManyToOne
    @JoinColumn(name = "root_fucked_up_id")
    Root root;

    @JsonProperty("sensors")
    @ElementCollection
    public List<Sensor> sensorsList;


}
