package com.misha.devicemanagementmicroservice.request.device.condition;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeviceTurnOnRequest {
    private String turnOn;
}
