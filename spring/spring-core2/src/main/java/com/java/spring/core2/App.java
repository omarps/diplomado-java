package com.java.spring.core2;

import com.java.spring.core2.output.OutputHelper;
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
        
        OutputHelper output1 = 
                (OutputHelper) context.getBean("outputHelper1");
        output1.generateOutput();
        
        OutputHelper output2 = 
                (OutputHelper) context.getBean("outputHelper2");
        output2.generateOutput();
    }
}
