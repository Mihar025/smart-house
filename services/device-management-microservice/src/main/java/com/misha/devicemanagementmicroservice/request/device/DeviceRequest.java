package com.misha.devicemanagementmicroservice.request.device;

import com.misha.devicemanagementmicroservice.model.device.DeviceType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeviceRequest {

    @NotNull(message = "This field cannot be empty!")
    @NotBlank(message = "This field cannot be blank!")
    private String deviceName;
    @NotNull(message = "This field cannot be empty!")
    @NotBlank(message = "This field cannot be blank!")
    private DeviceType deviceType;
    @NotNull(message = "This field cannot be empty!")
    @NotBlank(message = "This field cannot be blank!")
    private String deviceDescription;
    @NotNull(message = "This field cannot be empty!")
    @NotBlank(message = "This field cannot be blank!")
    private String manufacturer;
    @NotNull(message = "This field cannot be empty!")
    @NotBlank(message = "This field cannot be blank!")
    private String deviceModel;
    @NotNull(message = "This field cannot be empty!")
    @NotBlank(message = "This field cannot be blank!")
    private String serialNumber;

}
