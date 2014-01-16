/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.spring.aop1.aop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author Omar
 */
public class HijackBeforeMethod implements MethodBeforeAdvice {

    public void before(Method method, Object[] os, Object o) 
            throws Throwable {
        System.out.println(
                "HijackBeforeMethod: Estamos antes del metodo!");
    }
    
}
