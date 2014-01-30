package com.java.hibernate.ejercicio07;

import com.java.hibernate.ejercicio07.domain.Profesor;
import com.java.hibernate.util.HibernateUtil;
import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        HibernateUtil.buildSessionFactory();
        
        try {
            HibernateUtil.openSessionAndBindToThread();
            
            Session session = HibernateUtil
                    .getSessionFactory().openSession();
            Profesor profesor = (Profesor) session
                    .get(Profesor.class, 1001);
            System.out.println(profesor);
        } finally {
            HibernateUtil.closeSessionAndUnbindFromThread();
        }
        
        HibernateUtil.closeSessionFactory();
    }
}
