/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.jspbeanapp.beans;

/**
 *
 * @author Omar
 */
public class Automovil {
    
    private String color;
    private String marca;
    private String modelo;
    private double cilindros;
    private double velocidad;
    private int puertas;
    private boolean quemacocos;
    private String serie;
    private int pasajeros;
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the cilindros
     */
    public double getCilindros() {
        return cilindros;
    }

    /**
     * @param cilindros the cilindros to set
     */
    public void setCilindros(double cilindros) {
        this.cilindros = cilindros;
    }

    /**
     * @return the velocidad
     */
    public double getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * @return the puertas
     */
    public int getPuertas() {
        return puertas;
    }

    /**
     * @param puertas the puertas to set
     */
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    /**
     * @return the quemacocos
     */
    public boolean isQuemacocos() {
        return quemacocos;
    }

    /**
     * @param quemacocos the quemacocos to set
     */
    public void setQuemacocos(boolean quemacocos) {
        this.quemacocos = quemacocos;
    }

    /**
     * @return the serie
     */
    public String getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * @return the pasajeros
     */
    public int getPasajeros() {
        return pasajeros;
    }

    /**
     * @param pasajeros the pasajeros to set
     */
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    
}
