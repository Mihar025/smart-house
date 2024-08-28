package com.misha.devicemanagementmicroservice.model.device;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "devices")
public class Device {
    //For registration device
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String deviceName;

    @Enumerated(EnumType.STRING)
    private DeviceType deviceType;
    private String deviceDescription;
    private String manufacturer;
    private String deviceModel;
    private String serialNumber;
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;
    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime updatedAt;
    private boolean isActive;

    // When device already register use that like dto for checking status of device!

    @Enumerated(EnumType.STRING)
    private DeviceStatus status;
    private String location;
    private boolean isConnected;
    private Double batteryLevel;
    private String voltage;
    private String amps;
    private String energyConsumingPerHours;
}

