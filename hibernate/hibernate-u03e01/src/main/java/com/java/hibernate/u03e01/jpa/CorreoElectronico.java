/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.hibernate.u03e01.jpa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Omar
 */
@Entity
@Table(name = "correoelectronico")
public class CorreoElectronico implements Serializable {
    
    @Id
    @Column(name = "idCorreoElectronico")
    private int idCorreo;
    @Column(name = "direccionCorreo")
    private String direccionCorreo;
    @ManyToOne
    @JoinColumn(name = "idProfesor")
    private Profesor profesor;
    
    public CorreoElectronico() {
        
    }
    
    public CorreoElectronico(int idCorreo, 
            String direccionCorreo, 
            Profesor profesor) {
        this.idCorreo = idCorreo;
        this.direccionCorreo = direccionCorreo;
        this.profesor = profesor;
    }

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
