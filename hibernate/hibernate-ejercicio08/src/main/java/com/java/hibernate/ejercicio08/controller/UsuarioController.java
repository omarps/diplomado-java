/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.hibernate.ejercicio08.controller;

import com.java.hibernate.dao.BussinessException;
import com.java.hibernate.ejercicio08.dao.UsuarioDao;
import com.java.hibernate.ejercicio08.domain.Usuario;

/**
 *
 * @author Omar
 */
public class UsuarioController {
    
    private UsuarioDao usuarioDao;
    
    public void guardar(Usuario usuario) 
            throws BussinessException {
        usuarioDao.saveOrUpdate(usuario);
    }

    /**
     * @return the usuarioDao
     */
    public UsuarioDao getUsuarioDao() {
        return usuarioDao;
    }

    /**
     * @param usuarioDao the usuarioDao to set
     */
    public void setUsuarioDao(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }
    
}
