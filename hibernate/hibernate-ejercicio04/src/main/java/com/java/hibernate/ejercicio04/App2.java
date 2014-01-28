/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.hibernate.ejercicio04;

import com.java.hibernate.ejercicio04.jpa.Profesor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Omar
 */
public class App2 {
    
    public static void main(String[] args) throws Exception {
        SessionFactory sessionFactory;
        
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Profesor profesor = new Profesor("Carlos", "X", "Y");
        session.beginTransaction();
        session.save(profesor);
        session.getTransaction().commit();
        
        System.out.println("ID: " + profesor.getId());
        
        session.close();
        sessionFactory.close();
    }
    
}
