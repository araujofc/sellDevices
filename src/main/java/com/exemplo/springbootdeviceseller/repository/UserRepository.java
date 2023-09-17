/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.exemplo.springbootdeviceseller.repository;

import com.exemplo.springbootdeviceseller.model.Role;
import com.exemplo.springbootdeviceseller.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author arauj
 */
public interface UserRepository extends JpaRepository<User, Long>{
    //FindBy + fieldName
    Optional<User> findByUsername(String username);
    
    @Modifying
    @Query("update User set role = :role where username = :username")
    void updateUserRole(@Param("username") String Username, @Param("role") Role role);
    
    
}
