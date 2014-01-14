/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.spring.core2.output;

/**
 *
 * @author Omar
 */
public class OutputHelper {
    
    private IOutputGenerator outputGenerator;
    
    public void generateOutput() {
        outputGenerator.generateOutput();
    }
    
    public OutputHelper() {
    }
    
    /**
     * constructor-arg
     * @param outputGenerator 
     */
    public OutputHelper(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }

    /**
     * property [via setter method]
     * @param outputGenerator the outputGenerator to set
     */
    public void setOutputGenerator(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }
    
}
