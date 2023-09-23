/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemplo.springbootdeviceseller.security;

import com.exemplo.springbootdeviceseller.model.User;
import com.exemplo.springbootdeviceseller.service.UserService;
import com.exemplo.springbootdeviceseller.utils.SecurityUtils;
import static java.lang.reflect.Array.set;
import java.util.Set;
import static org.hibernate.Hibernate.set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 *
 * @author arauj
 */
@Service
public class CustomUserDetailsService implements UserDetailsService{
     
    @Autowired
    private UserService userService;
         

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        User user = userService.findByUsername(username)
                .orElseThrow(()-> new UsernameNotFoundException(username));
        Set<GrantedAuthority> authorities = Set.of(SecurityUtils.convertToAuthority(user.getRole().name()));
        
        //UserDetails
        return UserPrincipal.builder()
                .user(user)
                .id(user.getId())
                .username(username)
                .password(user.getPassword())
                .authorities(authorities)
                .build();
    }
    
}
