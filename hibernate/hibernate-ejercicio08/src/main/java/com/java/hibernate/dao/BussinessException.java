/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.hibernate.dao;

/**
 *
 * @author Omar
 */
public class BussinessException extends RuntimeException {

    public BussinessException() {
        super();
    }
    
    public BussinessException(Exception e) {
        super(e);
    }
}
