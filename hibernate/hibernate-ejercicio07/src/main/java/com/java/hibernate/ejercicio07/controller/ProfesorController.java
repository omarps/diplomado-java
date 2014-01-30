/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.hibernate.ejercicio07.controller;

import com.java.hibernate.dao.BussinessException;
import com.java.hibernate.ejercicio07.dao.ProfesorDao;
import com.java.hibernate.ejercicio07.dao.impl.ProfesorDaoImpl;
import com.java.hibernate.ejercicio07.domain.Profesor;

/**
 *
 * @author Omar
 */
public class ProfesorController {
    
    private ProfesorDao profesorDao;
    
    public ProfesorController() {
        profesorDao = new ProfesorDaoImpl();
    }
    
    public void guardar(Profesor profesor) 
            throws BussinessException {
        profesorDao.saveOrUpdate(profesor);
    }
    
}
