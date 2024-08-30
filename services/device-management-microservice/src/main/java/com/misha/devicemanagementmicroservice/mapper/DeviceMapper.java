package com.misha.devicemanagementmicroservice.mapper;


import com.misha.devicemanagementmicroservice.model.device.Device;
import com.misha.devicemanagementmicroservice.request.device.condition.DeviceTurnOffRequest;
import com.misha.devicemanagementmicroservice.request.device.condition.DeviceTurnOffResponse;
import com.misha.devicemanagementmicroservice.request.device.condition.DeviceTurnOnRequest;
import com.misha.devicemanagementmicroservice.request.device.condition.DeviceTurnOnResponse;
import com.misha.devicemanagementmicroservice.request.device.devReq.DeviceRequest;
import com.misha.devicemanagementmicroservice.request.device.devReq.DeviceResponse;
import com.misha.devicemanagementmicroservice.request.device.devTechReq.DeviceTechnicalRequest;
import com.misha.devicemanagementmicroservice.request.device.devTechReq.DeviceTechnicalResponse;
import org.springframework.stereotype.Service;

@Service
public class DeviceMapper {



    public Device toDevice(DeviceRequest device){
        return Device.builder()
                .deviceName(device.getDeviceName())
                .deviceType(device.getDeviceType())
                .deviceDescription(device.getDeviceDescription())
                .manufacturer(device.getManufacturer())
                .deviceModel(device.getDeviceModel())
                .serialNumber(device.getSerialNumber())
                .build();
    }


    public DeviceResponse toDeviceResponse(Device device){
        return DeviceResponse.builder()
                .id(device.getId())
                .deviceName(device.getDeviceName())
                .deviceType(device.getDeviceType())
                .deviceDescription(device.getDeviceDescription())
                .manufacturer(device.getManufacturer())
                .deviceModel(device.getDeviceModel())
                .serialNumber(device.getSerialNumber())
                .createdAt(device.getCreatedAt())
                .updatedAt(device.getUpdatedAt())
                .isActive(device.isActive())
                .batteryLevel(device.getBatteryLevel())
                .voltage(device.getVoltage())
                .amps(device.getAmps())
                .energyConsumingPerHours(device.getEnergyConsumingPerHours())
                .build();
    }

    public Device toTechnicalDevice(DeviceTechnicalRequest deviceTechnicalRequest){
        return Device.builder()
                .voltage(deviceTechnicalRequest.getVoltage())
                .amps(deviceTechnicalRequest.getAmps())
                .energyConsumingPerHours(deviceTechnicalRequest.getEnergyConsumingPerHours())
                .build();
    }

    public DeviceTechnicalResponse toTechnicalDeviceResponse(Device deviceTechnicalResponse){
        return DeviceTechnicalResponse.builder()
                .deviceId(deviceTechnicalResponse.getId())
                .isActive(deviceTechnicalResponse.isActive())
                .voltage(deviceTechnicalResponse.getVoltage())
                .amps(deviceTechnicalResponse.getAmps())
                .energyConsumingPerHours(deviceTechnicalResponse.getEnergyConsumingPerHours())
                .batteryLevel(deviceTechnicalResponse.getBatteryLevel())
                .build();
    }


    public Device toTurnOnDevice (DeviceTurnOnRequest request){
        return Device.builder()
                .turnOn(request.getTurnOn())
                .build();
    }

    public Device toTurnOffDevice (DeviceTurnOffRequest request){
        return Device.builder()
                .turnOff(request.getTurnOff())
                .build();
    }

    public DeviceTurnOnResponse toTurnedOnDevice(Device deviceResponse){
        return DeviceTurnOnResponse.builder()
                .turnOn(deviceResponse.getTurnOff())
                .build();
    }

    public DeviceTurnOffResponse toTurnedOffDevice(Device device){
        return DeviceTurnOffResponse.builder()
                .turnOff(device.getTurnOff())
                .build();
    }


}
