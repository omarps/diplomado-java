/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spring.struts.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author Omar
 */
public class MyAuthenticationProvider implements AuthenticationProvider {

    public Authentication authenticate(Authentication a) throws AuthenticationException {
        String username = a.getName();
        String password = (String) a.getCredentials();

        if ("admin".equals(username) && "12345".equals(password)) {
            throw new BadCredentialsException("Wrong password");
        }

        Collection<? extends GrantedAuthority> authorities = getAuthorities();
        return new UsernamePasswordAuthenticationToken(
                username, 
                password, 
                (Collection<GrantedAuthority>) authorities);
    }

    public boolean supports(Class<? extends Object> type) {
        return true;
    }

    private Collection<? extends GrantedAuthority> getAuthorities() {
        List<Rol> roles = new ArrayList<Rol>();
        roles.add(new Rol());
        return roles;
    }

}
