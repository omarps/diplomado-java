/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.hibernate.ejercicio07;

import com.java.hibernate.dao.BussinessException;
import com.java.hibernate.ejercicio07.controller.UsuarioController;
import com.java.hibernate.ejercicio07.domain.Usuario;
import com.java.hibernate.util.HibernateUtil;
import org.apache.log4j.Logger;

/**
 *
 * @author Omar
 */
public class App3 {
    
    private final static Logger logger = 
            Logger.getLogger(App3.class);
    
    public static void main(String[] args) {
        HibernateUtil.buildSessionFactory();
        
        try {
            HibernateUtil.openSessionAndBindToThread();
            
            UsuarioController usuarioController = 
                    new UsuarioController();
            Usuario usuario = new Usuario();
            usuario.setLogin("nuevo2");
            usuario.setNombre("Neww");
            usuario.setApe1("Lopez");
            usuario.setApe2("Lopez");
            usuario.setPassword("12345");
            usuarioController.guardar(usuario);
            logger.info("Usuario ID: " + usuario.getIdUsuario());
        } catch (BussinessException e) {
            logger.error(
                    "Error en las operaciones de hibernate", e);
        } finally {
            HibernateUtil.closeSessionAndUnbindFromThread();
        }
        
        HibernateUtil.closeSessionFactory();
    }
    
}
