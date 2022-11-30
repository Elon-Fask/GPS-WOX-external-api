package com.testgpswox.dev.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;




@Entity
@Data
@Table(name = "Root")
@Embeddable
public class Root {

    @Id
    public Integer id;

    @ElementCollection
    @JsonProperty("items")
    public List<Items> items;


}
















//@Entity
//@Getter
//@Setter
//@Table(name = "device_data")
//public class DeviceData{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "device_id", nullable = false)
//    private Integer deviceId;
//
//    private String title;
//
//    @OneToMany(cascade = CascadeType.MERGE)
//    @JsonProperty("items")
//    public Items itemArrayList;
//
//
//
//
//
//
//}
