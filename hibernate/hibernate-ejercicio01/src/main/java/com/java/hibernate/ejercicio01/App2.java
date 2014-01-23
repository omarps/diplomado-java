/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.hibernate.ejercicio01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Omar
 */
public class App2 {

    public static void main(String[] args) {
        SessionFactory sessionFactory;

        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        // create
        Direccion direccion = new Direccion(1111,
                "Calle Siempre Viva", 0, "Springfield", "MA");
        session.beginTransaction();
        session.save(direccion);
        session.getTransaction().commit();

        // read
        Direccion d = (Direccion) session.get(Direccion.class, 1111);
        System.out.println("id : " + d.getId());
        System.out.println("calle : " + d.getCalle());
        System.out.println("numero : " + d.getNumero());
        System.out.println("poblacion : " + d.getPoblacion());
        System.out.println("provincia : " + d.getProvincia());

        // update
        d.setCalle("Me cambie de calle");
        d.setNumero(22222);
        session.beginTransaction();
        session.update(d);
        session.getTransaction().commit();
        
        // delete
        session.beginTransaction();
        session.delete(d);
        session.getTransaction().commit();
        
        session.close();
        sessionFactory.close();
    }

}
