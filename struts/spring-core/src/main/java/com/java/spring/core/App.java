package com.java.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = 
                new ClassPathXmlApplicationContext("applicationContext.xml");
        
        HelloWorld helloBean = (HelloWorld)context.getBean("helloBean");
        helloBean.printHello();
    }
}
