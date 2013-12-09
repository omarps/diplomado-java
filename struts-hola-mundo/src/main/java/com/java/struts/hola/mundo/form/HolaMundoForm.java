package com.java.struts.hola.mundo.form;

import org.apache.struts.action.ActionForm;

/**
 *
 * @author Omar
 */
public class HolaMundoForm extends ActionForm {
    
    private String message;

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
}
