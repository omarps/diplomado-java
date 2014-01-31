package com.java.hibernate.ejercicio08;

import com.java.hibernate.dao.BussinessException;
import com.java.hibernate.ejercicio08.controller.ProfesorController;
import com.java.hibernate.ejercicio08.domain.Profesor;
import com.java.hibernate.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private final static Logger logger = 
            Logger.getLogger(App.class);
    
    public static void main( String[] args )
    {
        ApplicationContext context = 
                new ClassPathXmlApplicationContext(
                        "applicationContext.xml");
        HibernateUtil.buildSessionFactory();
        
        try {
            HibernateUtil.openSessionAndBindToThread();
            
            ProfesorController profesorController = 
                    context.getBean(ProfesorController.class);
            Profesor profesor = new Profesor();
            profesorController.guardar(profesor);
        } catch (BussinessException e) {
            logger.error("Error al guardar!!", e);
        } finally {
            HibernateUtil.closeSessionAndUnbindFromThread();
        }
        
        HibernateUtil.closeSessionFactory();
    }
}
