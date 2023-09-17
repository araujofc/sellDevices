/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.exemplo.springbootdeviceseller.repository;

import com.exemplo.springbootdeviceseller.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author arauj
 */
public interface DeviceRepository extends JpaRepository<Device, Long>{
    
}
