package com.java.hibernate.ejercicio06;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        SessionFactory sessionFactory;

        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        {
            System.out.println("Navegar una propiedad--------");
            String ape1 = (String) session.createQuery(
                    "SELECT p.nombre.ape1 FROM Profesor p WHERE id=1100")
                    .uniqueResult();
            System.out.println("Ape1=" + ape1);
        }

        {
            System.out.println("Navegar por municipios de profesores -------");
            Query query = session.createQuery(
                    "SELECT p.nombre.ape1, "
                    + "p.direccion.municipio.nombre "
                    + "FROM Profesor p "
                    + "WHERE p.id IN (1100,1101,1102,1103)");
            List<Object[]> datosList = query.list();
            for (Object[] datos : datosList) {
                System.out.println(
                        "El profesor " + datos[0]
                        + " vive en " + datos[1]);
            }
        }

        {
            System.out.println("TamaÑo colecciones --------");
            Query query = session.createQuery(
                    "SELECT p.nombre.ape1, "
                    + "SIZE(p.correosElectronicos) "
                    + "FROM Profesor p "
                    + "WHERE p.id IN (1100,1101,1102,1103) "
                    + "GROUP BY p.nombre.ape1");
            List<Object[]> datosList = query.list();
            for (Object[] datos : datosList) {
                System.out.println(
                        "El profesor " + datos[0]
                        + " tiene " + datos[1]
                        + " direcciones de correo electronico");
            }
        }

        session.close();
        sessionFactory.close();
    }
}
