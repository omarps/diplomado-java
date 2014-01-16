/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.spring.aop1.aop;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

/**
 *
 * @author Omar
 */
public class HijackAfterMethod implements AfterReturningAdvice {

    public void afterReturning(Object o, Method method, 
            Object[] os, Object o1) 
            throws Throwable {
        System.out.println(
                "HijackAfterMethod: Despues despues del metodo");
    }
    
}
