package com.misha.devicemanagementmicroservice.request.device.devTechReq;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeviceTechnicalResponse {

    private Integer deviceId;
    private boolean isActive;
    private Double batteryLevel;
    private String voltage;
    private String amps;
    private String energyConsumingPerHours;
}
