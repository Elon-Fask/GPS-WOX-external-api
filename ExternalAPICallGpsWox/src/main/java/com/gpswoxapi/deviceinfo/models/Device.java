package com.gpswoxapi.deviceinfo.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Devices")
@Getter
@Setter
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DeviceId")
    private int id;

    @Column(name = "DeviceName")
    @NotBlank
    private String deviceName;

    @Column(name = "DeviceSensors")
    private String deviceSensors;

    @Column(name = "DeviceSensorId")
    private String deviceSensorId;

    @Column(name = "DeviceSensorName")
    private String deviceSensorName;

    @Column(name = "DeviceSensorValue")
    private String deviceSensorValue;



}
