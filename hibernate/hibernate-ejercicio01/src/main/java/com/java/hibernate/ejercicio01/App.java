package com.java.hibernate.ejercicio01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory;
        
        // config-session factory
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        
        // c - create
        Profesor profesor = new Profesor(101, "Juan", "Perez", "Garcia");
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(profesor);
        session.getTransaction().commit();
        
        // r - read
        Profesor profesor2 = (Profesor)session.get(Profesor.class, 101);
        System.out.println(profesor2.getId());
        System.out.println(profesor2.getNombre());
        System.out.println(profesor2.getApe1());
        System.out.println(profesor2.getApe2());
        
        // u - update
        profesor2.setNombre("Emilio");
        session.beginTransaction();
        session.update(profesor2);
        session.getTransaction().commit();
        
        // d - delete
        session.beginTransaction();
        session.delete(profesor2);
        session.getTransaction().commit();
        
        session.close();
        sessionFactory.close();
    }
}
