/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemplo.springbootdeviceseller.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.Set;
import lombok.Data;
import lombok.Generated;

/**
 *
 * @author arauj
 */
@Data
@Entity
@Table (name = "devices")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name", nullable = false , length = 100)
    private String name;
    
    @Column(name = "description", nullable = false, length = 1000)
    private String description;
    
    @Column(name = "price", nullable = false )
    private Double price;
    
    @Column(name ="creat_time", nullable = false)
    private LocalDateTime createTime;
    
    //device-type
    @Enumerated(EnumType.STRING)
    @Column (name ="device_type", nullable = false)
    private DeviceType deviceType;
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy = "device" )
    private Set<Purchase> purchaseList;
}
