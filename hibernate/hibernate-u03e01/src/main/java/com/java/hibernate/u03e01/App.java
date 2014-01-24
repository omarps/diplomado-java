package com.java.hibernate.u03e01;

import com.java.hibernate.u03e01.domain.CorreoElectronico;
import com.java.hibernate.u03e01.domain.Profesor;
import java.util.ArrayList;
import java.util.List;
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
        if (session.get(Profesor.class, 9) != null) {
            Profesor p = (Profesor) session.get(Profesor.class, 9);
            session.beginTransaction();
            session.delete(p);
            session.getTransaction().commit();
        }
        
        Profesor profesor = new Profesor();
        profesor.setId(9);
        profesor.setNombre("Noe");
        profesor.setApe1("Gonzalez");
        profesor.setApe2("Torres");
        
        CorreoElectronico correo;
        List<CorreoElectronico> correosElectronicos = 
                new ArrayList<CorreoElectronico>();
        correo = new CorreoElectronico(1, 
                "noe@gmail.com", 
                profesor);
        correosElectronicos.add(correo);
        correo = new CorreoElectronico(2, 
                "noe@hotmail.com", 
                profesor);
        correosElectronicos.add(correo);
        correo = new CorreoElectronico(3, 
                "noe@yahoo.com", 
                profesor);
        correosElectronicos.add(correo);
        
        profesor.setCorreosElectronicos(correosElectronicos);
        
        session.beginTransaction();
        session.save(profesor);
        session.getTransaction().commit();;
        
        session.close();
        sessionFactory.close();
    }
}
