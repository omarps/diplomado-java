/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.hibernate.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Omar
 */
public interface GenericDao<T, ID extends Serializable> {

    T create() throws BussinessException;

    void saveOrUpdate(T entity) throws BussinessException;

    T get(ID id) throws BussinessException;

    void delete(ID id) throws BussinessException;

    List<T> findAll() throws BussinessException;

}
