/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemplo.springbootdeviceseller.utils;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

/**
 *
 * @author arauj
 */
public class SecurityUtils {
    
    public static final String ROLE_PREFIX  = "ROLE_";
    
    public static SimpleGrantedAuthority convertToAuthority(String role){
        String formattedRole = role.startsWith(ROLE_PREFIX)? role: ROLE_PREFIX + role;
        return new SimpleGrantedAuthority(formattedRole);
    }
    
    
    
}
