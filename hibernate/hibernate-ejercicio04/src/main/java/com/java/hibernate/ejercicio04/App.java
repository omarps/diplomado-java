package com.java.hibernate.ejercicio04;

import com.java.hibernate.ejercicio04.domain.TiposBasicos;
import java.math.BigDecimal;
import java.math.BigInteger;
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
        
        Date date = new Date();
        byte[] array = {
            (byte)0x45, (byte)0xF5, (byte)0x3A, 
            (byte)0x67, (byte)0xFF
        };
        
        TiposBasicos tiposBasicos1 = new TiposBasicos();
        tiposBasicos1.setInte(1);
        tiposBasicos1.setLong1(12);
        tiposBasicos1.setShort1((short)13);
        tiposBasicos1.setFloat1(14.1f);
        tiposBasicos1.setDouble1(15.2);
        tiposBasicos1.setCharacter1('w');
        tiposBasicos1.setByte1((byte)16);
        tiposBasicos1.setBoolean1(true);
        tiposBasicos1.setYesno1(true);
        tiposBasicos1.setTruefalse1(true);
        tiposBasicos1.setStri("Hola Mundo");
        tiposBasicos1.setDateDate(date);
        tiposBasicos1.setDateTime(date);
        tiposBasicos1.setDateTimestamp(date);
        tiposBasicos1.setTexto("texto muyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy largo");
        tiposBasicos1.setBinario(array);
        tiposBasicos1.setBigDecimal(new BigDecimal("0.3"));
        tiposBasicos1.setBigInteger(new BigInteger("5345345324532"));
        
        TiposBasicos tiposBasicos2 = new TiposBasicos();
        tiposBasicos2.setInte(2);           // <<< Cambie a 2
        tiposBasicos2.setLong1(12);
        tiposBasicos2.setShort1((short)13);
        tiposBasicos2.setFloat1(14.1f);
        tiposBasicos2.setDouble1(15.2);
        tiposBasicos2.setCharacter1('w');
        tiposBasicos2.setByte1((byte)16);
        tiposBasicos2.setBoolean1(false);   // <<< Cambie a false
        tiposBasicos2.setYesno1(false);     // <<< Cambie a false
        tiposBasicos2.setTruefalse1(false); // <<< Cambie a false
        tiposBasicos2.setStri("Hola Mundo");
        tiposBasicos2.setDateDate(date);
        tiposBasicos2.setDateTime(date);
        tiposBasicos2.setDateTimestamp(date);
        tiposBasicos2.setTexto("texto muyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy largo");
        tiposBasicos2.setBinario(array);
        tiposBasicos2.setBigDecimal(new BigDecimal("0.3"));
        tiposBasicos2.setBigInteger(new BigInteger("5345345324532"));
        
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        session.save(tiposBasicos1);
        session.save(tiposBasicos2);
        session.getTransaction().commit();
        
        session.close();
        sessionFactory.close();
    }
}
