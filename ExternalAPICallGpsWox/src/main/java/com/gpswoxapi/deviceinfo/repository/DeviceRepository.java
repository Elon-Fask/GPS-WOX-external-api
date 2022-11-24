package com.gpswoxapi.deviceinfo.repository;

import com.gpswoxapi.deviceinfo.models.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer> {
    Device findDeviceByName(String deviceName);


}
