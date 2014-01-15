/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.spring.core4.shapes;

/**
 *
 * @author Omar
 */
public abstract class Shape {
    
    public abstract double getArea();
    
    public void printInfo() {
        System.out.printf("%s con area de %.2f\n", 
                getClass().getSimpleName(), 
                getArea());
    }
    
}
