/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.hibernate.ejercicio07.dao;

import com.java.hibernate.dao.GenericDao;
import com.java.hibernate.ejercicio07.domain.Usuario;
import java.util.List;

/**
 *
 * @author Omar
 */
public interface UsuarioDao extends 
        GenericDao<Usuario, Integer> {
    
    List<Usuario> getUsuariosByName(String name);
    
}
