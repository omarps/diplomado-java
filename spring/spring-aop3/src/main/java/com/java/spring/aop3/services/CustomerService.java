/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.spring.aop3.services;

/**
 *
 * @author Omar
 */
public class CustomerService {
    
    private String name;
    private String url;
    
    public void printName() {
        System.out.println("Customer name : " + name);
    }
    
    public void printURL() {
        System.out.println("Customer website : " + url);
    }
    
    public void printThrowException() {
        throw new IllegalArgumentException();
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
    
    
}