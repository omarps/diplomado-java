/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.hibernate.dao.impl;

import com.java.hibernate.dao.BussinessException;
import com.java.hibernate.dao.GenericDao;
import com.java.hibernate.util.HibernateUtil;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Omar
 */
public class GenericDaoImpl<T, ID extends Serializable>
        implements GenericDao<T, ID> {

    private final static Logger logger
            = Logger.getLogger(GenericDaoImpl.class);

    protected SessionFactory sessionFactory;

    public GenericDaoImpl() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public T create() throws BussinessException {
        try {
            return getEntityClass().newInstance();
        } catch (Exception e) {
            throw new BussinessException(e);
        }
    }

    public void saveOrUpdate(T entity) throws BussinessException {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            session.saveOrUpdate(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                logger.warn("Falló al hacer un rollback", exc);
            }
            throw new BussinessException(e);
        }
    }

    public T get(ID id) throws BussinessException {
        Session session = sessionFactory.getCurrentSession();
        T entity = (T) session.get(getEntityClass(), id);
        return entity;
    }

    public void delete(ID id) throws BussinessException {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            T entity = (T) session.get(getEntityClass(), id);
            if (entity != null) {
                session.delete(entity);
            }
            session.getTransaction().commit();
        } catch (Exception e) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                logger.warn("Falló al hacer un rollback", exc);
            }
            throw new BussinessException(e);
        }
    }

    public List<T> findAll() throws BussinessException {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("SELECT e FROM " + getEntityClass().getName() + " e");
        List<T> entities = query.list();
        return entities;
    }

    private Class<T> getEntityClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

}
