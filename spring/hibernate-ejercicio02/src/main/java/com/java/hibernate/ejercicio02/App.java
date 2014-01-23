package com.java.hibernate.ejercicio02;

import com.java.hibernate.ejercicio02.domain.Seguro;
import java.util.Date;
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
        
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Seguro seguro;
        if (session.get(Seguro.class, 1) != null) {
            session.beginTransaction();
            seguro = (Seguro)session.get(Seguro.class, 1);
            session.delete(seguro);
            session.getTransaction().commit();
        }
        
        seguro = new Seguro();
        seguro.setIdSeguro(1);
        seguro.setNif("1234");
        seguro.setNombre("Enrique");
        seguro.setApe1("Pena");
        seguro.setApe2("Nieto");
        seguro.setEdad(50);
        seguro.setNumHijos(5);
        seguro.setFechaCreacion(new Date());
        
        session.beginTransaction();
        session.save(seguro);
        session.getTransaction().commit();
        
        seguro = null;
        seguro = (Seguro) session.get(Seguro.class, 1);
        System.out.printf(
                "%d - %s: %s %s %s, con %d años y %d hijos, se creo %s\n", 
                seguro.getIdSeguro(), seguro.getNif(), 
                seguro.getNombre(), seguro.getApe1(), seguro.getApe2(), 
                seguro.getEdad(), seguro.getNumHijos(), 
                seguro.getFechaCreacion());
        
        session.close();
        sessionFactory.close();
    }
}
