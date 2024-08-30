package com.misha.devicemanagementmicroservice.request.device.devTechReq;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeviceTechnicalRequest {


    private String voltage;
    private String amps;
    private String energyConsumingPerHours;
}

