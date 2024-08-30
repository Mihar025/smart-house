package com.misha.devicemanagementmicroservice.request.device.condition;

import lombok.*;




@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeviceTurnOffResponse {

    private Integer deviceId;
    private String turnOff;
}
