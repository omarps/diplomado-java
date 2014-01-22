/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.spring.struts.security;

import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author Omar
 */
public class Rol implements GrantedAuthority {

    public String getAuthority() {
        return "ROLE_ADMIN";
    }
    
}
