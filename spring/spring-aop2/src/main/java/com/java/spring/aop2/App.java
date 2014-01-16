package com.java.spring.aop2;

import com.java.spring.aop2.service.CustomerService;
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
                new ClassPathXmlApplicationContext(
                        "applicationContext.xml");
        
        CustomerService customerService = 
                (CustomerService) context.getBean(
                        "customerServiceProxy");
        
        System.out.println("*************************");
        customerService.printName();
        System.out.println("*************************");
        customerService.printURL();
        System.out.println("*************************");
        try {
            customerService.printThrowException();
        } catch(Exception e) {
            System.err.println(e);
        }
    }
}
