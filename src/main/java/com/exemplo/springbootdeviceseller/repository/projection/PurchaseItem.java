/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.exemplo.springbootdeviceseller.repository.projection;

import com.exemplo.springbootdeviceseller.model.DeviceType;
import java.time.LocalDateTime;

/**
 *
 * @author arauj
 */
public interface PurchaseItem {
    
    String getName();
    DeviceType getype();
    Double getPrice();
    String getColor();
    LocalDateTime getPurchaseTime();
    
}
