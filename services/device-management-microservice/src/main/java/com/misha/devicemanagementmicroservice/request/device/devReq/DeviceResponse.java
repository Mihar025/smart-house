package com.misha.devicemanagementmicroservice.request.device.devReq;

import com.misha.devicemanagementmicroservice.model.device.DeviceStatus;
import com.misha.devicemanagementmicroservice.model.device.DeviceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeviceResponse {

    private Integer id;
    private String deviceName;
    private DeviceType deviceType;
    private String deviceDescription;
    private String manufacturer;
    private String deviceModel;
    private String serialNumber;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean isActive;
    private DeviceStatus status;
    private String location;
    private boolean isConnected;
    private Double batteryLevel;
    private String voltage;
    private String amps;
    private String energyConsumingPerHours;
}
