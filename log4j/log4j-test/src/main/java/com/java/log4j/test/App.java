package com.java.log4j.test;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private final static Logger logger = 
            Logger.getLogger(App.class);
    
    public static void main( String[] args )
    {
        if (logger.isTraceEnabled()) {
            logger.trace("esto es un trace");
            String s = "";
            for (int i = 0; i < 10000; i++) {
                s += i + ", ";
            }
            logger.trace(s);
        }
        if (logger.isDebugEnabled())
            logger.debug("esto es un debug");
        if (logger.isInfoEnabled())
            logger.info("esto es un info");
        logger.warn("esto es un warn");
        logger.error("esto es un error");
        logger.fatal("esto es un fatal");
    }
}
