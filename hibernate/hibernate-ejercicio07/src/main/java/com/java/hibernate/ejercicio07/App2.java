/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.hibernate.ejercicio07;

import com.java.hibernate.dao.BussinessException;
import com.java.hibernate.ejercicio07.controller.ProfesorController;
import com.java.hibernate.ejercicio07.domain.Profesor;
import com.java.hibernate.util.HibernateUtil;
import org.apache.log4j.Logger;

/**
 *
 * @author Omar
 */
public class App2 {
    
    private final static Logger logger = 
            Logger.getLogger(App2.class);
    
    public static void main(String[] args) {
        HibernateUtil.buildSessionFactory();
        
        try {
            HibernateUtil.openSessionAndBindToThread();
            
            ProfesorController profesorControler = 
                    new ProfesorController();
            Profesor profesor = new Profesor();
            profesorControler.guardar(profesor);
        } catch(BussinessException e) {
            logger.error(
                    "No se ha podido guardar el profesor", e);
        } finally {
            HibernateUtil.closeSessionAndUnbindFromThread();
        }
        
        HibernateUtil.closeSessionFactory();
    }
    
}
