/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.hibernate.ejercicio06.domain;

import java.io.Serializable;

/**
 *
 * @author Omar
 */
public class CorreoElectronico implements Serializable {
    
    private int idCorreo;
    private String direccionCorreo;
    private Profesor profesor;

    /**
     * @return the idCorreo
     */
    public int getIdCorreo() {
        return idCorreo;
    }

    /**
     * @param idCorreo the idCorreo to set
     */
    public void setIdCorreo(int idCorreo) {
        this.idCorreo = idCorreo;
    }

    /**
     * @return the direccionCorreo
     */
    public String getDireccionCorreo() {
        return direccionCorreo;
    }

    /**
     * @param direccionCorreo the direccionCorreo to set
     */
    public void setDireccionCorreo(String direccionCorreo) {
        this.direccionCorreo = direccionCorreo;
    }

    /**
     * @return the profesor
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
}
