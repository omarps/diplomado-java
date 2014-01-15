package com.java.spring.core4;

import com.java.spring.core4.shapes.Shape;
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
        
        for (int i = 1; i <= 3; i++) {
            Shape shape = (Shape) context.getBean("shape" + i);
            shape.printInfo();
        }
    }
}
