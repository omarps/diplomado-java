/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.hibernate.ejercicio08.controller;

import com.java.hibernate.dao.BussinessException;
import com.java.hibernate.ejercicio08.dao.ProfesorDao;
import com.java.hibernate.ejercicio08.domain.Profesor;

/**
 *
 * @author Omar
 */
public class ProfesorController {

    private ProfesorDao profesorDao;

    public void guardar(Profesor profesor)
            throws BussinessException {
        profesorDao.saveOrUpdate(profesor);
    }

    /**
     * @return the profesorDao
     */
    public ProfesorDao getProfesorDao() {
        return profesorDao;
    }

    /**
     * @param profesorDao the profesorDao to set
     */
    public void setProfesorDao(ProfesorDao profesorDao) {
        this.profesorDao = profesorDao;
    }

}
