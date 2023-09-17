/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemplo.springbootdeviceseller.service;

import com.exemplo.springbootdeviceseller.model.Device;
import com.exemplo.springbootdeviceseller.repository.DeviceRepository;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author arauj
 */
@Service
public class DeviceServiceImpl implements DeviceService {
    
    private DeviceRepository deviceRepository;
    
    public DeviceServiceImpl(DeviceRepository deviceRepository){
        this.deviceRepository = deviceRepository;
    }   
    
    public Device saveDevice(Device device){
        device.setCreateTime(LocalDateTime.now());
        return deviceRepository.save(device);
    }
    
    public void deleteDevice(Long id){
        deviceRepository.deleteById(id);
    }
    
    public List<Device> findAllDevices(){
        return deviceRepository.findAll();
       
    }
    
    
        
    
    
    
    
}
