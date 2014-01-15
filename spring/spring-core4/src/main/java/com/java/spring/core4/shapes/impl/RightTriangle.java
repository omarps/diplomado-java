/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.spring.core4.shapes.impl;

import com.java.spring.core4.shapes.Shape;

/**
 *
 * @author Omar
 */
public class RightTriangle extends Shape {
    
    private double sideA;
    private double sideB;
    
    public RightTriangle() {
    }
    
    public RightTriangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return (sideA * sideB * 0.5);
    }
    
    public double getHypotenuse() {
        return 0d;
    }

    /**
     * @return the sideA
     */
    public double getSideA() {
        return sideA;
    }

    /**
     * @param sideA the sideA to set
     */
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    /**
     * @return the sideB
     */
    public double getSideB() {
        return sideB;
    }

    /**
     * @param sideB the sideB to set
     */
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    
}
