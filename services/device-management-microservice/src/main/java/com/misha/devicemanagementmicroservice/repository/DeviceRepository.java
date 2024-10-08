package com.misha.devicemanagementmicroservice.repository;

import com.misha.devicemanagementmicroservice.model.device.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer> {
}
