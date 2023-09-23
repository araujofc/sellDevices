/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.exemplo.springbootdeviceseller.service;

import com.exemplo.springbootdeviceseller.model.User;
import java.util.Optional;

/**
 *
 * @author arauj
 */
public interface UserService {

    Optional<User> findByUsername(String username);
    
}
