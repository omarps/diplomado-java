/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.struts.prime.form;

import java.math.BigInteger;

/**
 *
 * @author Omar
 */
public class PrimeForm extends org.apache.struts.action.ActionForm {
    
    private BigInteger prime;
    private int length = 150;
    
    public PrimeForm() {
        
    }

    /**
     * @return the prime
     */
    public BigInteger getPrime() {
        return prime;
    }

    /**
     * @param prime the prime to set
     */
    public void setPrime(BigInteger prime) {
        this.prime = prime;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }
    
}
