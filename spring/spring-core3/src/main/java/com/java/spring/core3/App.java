package com.java.spring.core3;

import com.java.spring.core3.shapes.Shape;
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
        
        Shape shape1 = (Shape) context.getBean("shape1");
        printInfo(shape1);
        Shape shape2 = (Shape) context.getBean("shape2");
        printInfo(shape2);
    }
    
    private static void printInfo(Shape shape) {
//        System.out.println("El area de la forma es: " + 
//                shape.getArea());
        System.out.printf("Area de %s es %.2f\n", 
                shape.getClass().getSimpleName(), 
                shape.getArea());
    }
}
