/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.exemplo.springbootdeviceseller.repository;

import com.exemplo.springbootdeviceseller.model.Purchase;
import com.exemplo.springbootdeviceseller.repository.projection.PurchaseItem;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author arauj
 */
public interface PurchaseRepository extends JpaRepository<Purchase, Long>{
    
    @Query ("select" + 
            " d.name as name, d.deviceType as type, p.price as price, p.color as color, p.purchaseTime as purchaseTime" + 
            " from Purchase p left join Device d on d.id = p.deviceId"+
            " where p.userId = :userId")
    List<PurchaseItem> findAllPurchasesOfUser(@Param("userId") Long userId);
}
