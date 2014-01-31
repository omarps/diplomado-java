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
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author Omar
 */
public class App4 {

    private final static Logger logger
            = Logger.getLogger(App4.class);

    public static void main(String[] args) {
        HibernateUtil.buildSessionFactory();

        try {
            HibernateUtil.openSessionAndBindToThread();
            
            UsuarioController usuarioController = 
                    new UsuarioController();
            List<Usuario> usuarios = usuarioController.
                    getUsuariosByName("Neww");
            for (Usuario usuario : usuarios) {
                logger.info("Usuario : " + usuario.getLogin());
            }
        } catch (BussinessException e) {
            logger.error(
                    "Error en las operaciones de hibernate", e);
        } finally {
            HibernateUtil.closeSessionAndUnbindFromThread();
        }

        HibernateUtil.closeSessionFactory();
    }

}
