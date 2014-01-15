/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.spring.core3.shapes.impl;

import com.java.spring.core3.shapes.Shape;

/**
 *
 * @author Omar
 */
public class Circle implements Shape {
    
    private double radius = 1.0;
    
    public Circle() {
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (Math.PI * radius * radius);
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
