package com.java.hibernate.ejercicio05;

import com.java.hibernate.ejercicio05.domain.Profesor;
import java.util.List;
import org.hibernate.Query;
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
        
        System.out.println("Uso de list()--------");
        Query query = session.createQuery(
                "SELECT p FROM Profesor p");
        query.setMaxResults(5);
        List<Profesor> profesores = query.list();
        for (Profesor profesor : profesores) {
            System.out.println(profesor);
        }
        
        System.out.println("Obtener un par de campos---------");
        query  = session.createQuery(
                "SELECT p.id, p.nombre FROM Profesor p");
        query.setMaxResults(5);
        query.setFirstResult(2 * 5);
        List<Object[]> datosList = query.list();
        for (Object[] datos : datosList) {
            System.out.println(datos[0] + " : " + datos[1]);
        }
        
        System.out.println("Obtener un solo registro--------");
        query = session.createQuery(
                "SELECT p FROM Profesor p WHERE id=1001");
        Profesor profesor = (Profesor) query.uniqueResult();
        System.out.println("Profesor con id 1001 = " + 
                profesor.getNombre());
        
        System.out.println("Obtener query con nombre-------");
        query = session.getNamedQuery("findAllProfesores");
        query.setMaxResults(5);
        profesores = query.list();
        for (Profesor p : profesores) {
            System.out.println(p);
        }
        
        session.close();
        sessionFactory.close();
    }
}
