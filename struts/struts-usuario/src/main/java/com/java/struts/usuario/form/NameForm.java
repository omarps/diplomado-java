/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.struts.usuario.form;

/**
 *
 * @author Omar
 */
public class NameForm extends org.apache.struts.action.ActionForm {
  
    private String firstName = "Missing first name";
    private String lastName = "Missing last name";
    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        if (!isMissing(firstName)) {
            this.firstName = firstName;
        }
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        if (!isMissing(lastName)) {
            this.lastName = lastName;
        }
    }
    
    private boolean isMissing(String value) {
        return ((value == null) || (value.trim().equals("")));
    }
  
}
