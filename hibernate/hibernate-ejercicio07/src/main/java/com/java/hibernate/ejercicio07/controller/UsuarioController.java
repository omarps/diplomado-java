/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.hibernate.ejercicio07.controller;

import com.java.hibernate.dao.BussinessException;
import com.java.hibernate.ejercicio07.dao.UsuarioDao;
import com.java.hibernate.ejercicio07.dao.impl.UsuarioDaoImpl;
import com.java.hibernate.ejercicio07.domain.Usuario;

/**
 *
 * @author Omar
 */
public class UsuarioController {
    
    private UsuarioDao usuarioDao;
    
    public UsuarioController() {
        usuarioDao = new UsuarioDaoImpl();
    }
    
    public void guardar(Usuario usuario) 
            throws BussinessException {
        usuarioDao.saveOrUpdate(usuario);
    }
    
}

