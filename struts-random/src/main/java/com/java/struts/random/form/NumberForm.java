/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.struts.random.form;

/**
 *
 * @author Omar
 */
public class NumberForm extends org.apache.struts.action.ActionForm {
    
    private double number = 0;

    /**
     * @return the number
     */
    public double getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(double number) {
        this.number = number;
    }
    
}
