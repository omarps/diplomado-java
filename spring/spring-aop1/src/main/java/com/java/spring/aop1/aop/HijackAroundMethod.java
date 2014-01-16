/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.spring.aop1.aop;

import java.util.Arrays;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 *
 * @author Omar
 */
public class HijackAroundMethod implements MethodInterceptor {

    public Object invoke(MethodInvocation mi) throws Throwable {
        System.out.println("Nombre del metodo : " + 
                mi.getMethod().getName());
        System.out.println("Arguimentos del metodo : " + 
                Arrays.toString(mi.getArguments()));
        
        // antes de
        System.out.println(
                "HijackAroundMethod: Aqui estamos antes del metodo!");
        try {
            // procedemos con el metodo original
            Object result = mi.proceed();
            
            // despues de
            System.out.println(
                    "HijackAroundMethod: Aqui estamos despues del metodo!");
            return result;
        } catch(IllegalArgumentException e) {
            // cada que se lance una exception
            System.err.println(
                    "HijackAroundMethod: Se lanzo una exception!");
            throw e;
        }
    }
    
}
