package com.misha.devicemanagementmicroservice.service;

import com.misha.devicemanagementmicroservice.exception.BusinessException;
import com.misha.devicemanagementmicroservice.mapper.DeviceMapper;
import com.misha.devicemanagementmicroservice.model.device.Device;
import com.misha.devicemanagementmicroservice.pagination.PageResponse;
import com.misha.devicemanagementmicroservice.repository.DeviceRepository;
import com.misha.devicemanagementmicroservice.request.device.condition.DeviceTurnOffRequest;
import com.misha.devicemanagementmicroservice.request.device.condition.DeviceTurnOffResponse;
import com.misha.devicemanagementmicroservice.request.device.condition.DeviceTurnOnRequest;
import com.misha.devicemanagementmicroservice.request.device.condition.DeviceTurnOnResponse;
import com.misha.devicemanagementmicroservice.request.device.devReq.DeviceRequest;
import com.misha.devicemanagementmicroservice.request.device.devReq.DeviceResponse;
import com.misha.devicemanagementmicroservice.request.device.devTechReq.DeviceTechnicalRequest;
import com.misha.devicemanagementmicroservice.request.device.devTechReq.DeviceTechnicalResponse;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeviceService {

    private static final Logger log = LoggerFactory.getLogger(DeviceService.class);
    private final DeviceRepository deviceRepository;
    private final DeviceMapper deviceMapper;

    public Integer addDevice(DeviceRequest deviceRequest) {
            var device = deviceMapper.toDevice(deviceRequest);
             return deviceRepository.save(device).getId();
    }
    public void editDevice (DeviceRequest deviceRequest) {
        var device = deviceRepository.findById(deviceRequest.getId())
                .orElseThrow(() -> new BusinessException("Device not found"));
         mergeDevice(device, deviceRequest);
         this.deviceRepository.save(device);
    }

    public DeviceResponse getDeviceById(Integer id) {
        var device = deviceRepository.findById(id)
                .orElseThrow(() -> new BusinessException("Device not found"));
        return deviceMapper.toDeviceResponse(device);
    }

    public PageResponse<DeviceResponse> getAllDevices(int size, int page) {
        //todo implement searching and finding everything through customer-microservice!
        Pageable pageable = PageRequest.of(size, page, Sort.by("createdDate").descending());
        Page<Device> devices = deviceRepository.findAll(pageable);
        List<DeviceResponse> deviceResponses = devices.map(deviceMapper::toDeviceResponse).stream().toList();
        return new PageResponse<>(
                deviceResponses,
                devices.getNumber(),
                devices.getSize(),
                devices.getTotalElements(),
                devices.getTotalPages(),
                devices.isFirst(),
                devices.isLast()
        );
    }

    public DeviceResponse findDeviceById(Integer id) {
        var device = deviceRepository.findById(id)
                .orElseThrow(() -> new BusinessException("Device not found"));
        return deviceMapper.toDeviceResponse(device);
    }


    public DeviceTurnOnResponse turnOnDevice(DeviceTurnOnRequest request, Integer deviceId){
        var device = deviceRepository.findById(deviceId)
                .orElseThrow(() -> new BusinessException("Device not found"));
        if(!device.isActive()) {
            device.setTurnOn(request.getTurnOn());
        }
        deviceRepository.save(device);
        return deviceMapper.toTurnedOnDevice(device);
    }


    public DeviceTurnOffResponse turnOffDevice(DeviceTurnOffRequest request, Integer deviceId){
        var device = deviceRepository.findById(deviceId)
                .orElseThrow(() -> new BusinessException("Device not found"));
        if(device.isActive()) {
            device.setTurnOff(request.getTurnOff());
        }
        deviceRepository.save(device);
        return deviceMapper.toTurnedOffDevice(device);
    }

    public Double checkDeviceBattery(Double batteryPercentage, Integer deviceId) {
        var device = deviceRepository.findById(deviceId)
                .orElseThrow(() -> new BusinessException("Device not found"));
        log.info("Checking device battery percentage {}", batteryPercentage);
        return device.getBatteryLevel();
    }


    public DeviceTechnicalResponse setEnergyConsuming(DeviceTechnicalRequest request, Integer deviceId) {
        var device = deviceRepository.findById(deviceId)
                .orElseThrow(() -> new BusinessException("Device not found"));
        log.info("Device was founded successfully!");
        device.setVoltage(request.getVoltage());
        device.setAmps(request.getAmps());
        device.setEnergyConsumingPerHours(request.getEnergyConsumingPerHours());
        deviceRepository.save(device);
        return deviceMapper.toTechnicalDeviceResponse(device);
    }























    private void mergeDevice(Device device, DeviceRequest deviceRequest){
        if(StringUtils.isNotBlank(deviceRequest.getDeviceName())){
            device.setDeviceName(deviceRequest.getDeviceName());
        }
        if(StringUtils.isNotBlank(deviceRequest.getDeviceType().name())){
            device.setDeviceType(deviceRequest.getDeviceType());
        }
        if(StringUtils.isNotBlank(deviceRequest.getDeviceDescription())){
            device.setDeviceDescription(deviceRequest.getDeviceDescription());
        }
        if(StringUtils.isNotBlank(deviceRequest.getManufacturer())){
            device.setManufacturer(deviceRequest.getManufacturer());
        }
        if(StringUtils.isNotBlank(deviceRequest.getDeviceModel())){
            device.setDeviceModel(deviceRequest.getDeviceModel());
        }
        if(StringUtils.isNotBlank(deviceRequest.getSerialNumber())){
            device.setSerialNumber(deviceRequest.getSerialNumber());
        }
    }









}
