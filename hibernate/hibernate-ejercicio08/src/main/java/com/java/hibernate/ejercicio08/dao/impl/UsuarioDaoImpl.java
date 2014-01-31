/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.hibernate.ejercicio08.dao.impl;

import com.java.hibernate.dao.impl.GenericDaoImpl;
import com.java.hibernate.ejercicio08.dao.UsuarioDao;
import com.java.hibernate.ejercicio08.domain.Usuario;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Omar
 */
public class UsuarioDaoImpl extends
        GenericDaoImpl<Usuario, Integer> implements
        UsuarioDao {

    public List<Usuario> getUsuariosByName(String name) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(
                "SELECT u FROM Usuario u WHERE nombre = ?");
        query.setParameter(0, name);
        List<Usuario> usuarios = query.list();
        return usuarios;
    }
    
}
