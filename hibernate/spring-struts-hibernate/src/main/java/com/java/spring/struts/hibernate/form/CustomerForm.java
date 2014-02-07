/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.spring.struts.hibernate.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Omar
 */
public class CustomerForm extends ActionForm {
    
    private String name;
    private String address;
    
    @Override
    public ActionErrors validate(ActionMapping mapping, 
            HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        
        if (name == null || "".equals(name)) {
            errors.add("customer.error.name",
                    new ActionMessage(
                            "customer.error.name.required"));
        }
        
        if (address == null || "".equals(address)) {
            errors.add("customr.error.address", 
                    new ActionMessage(
                            "customer.error.address.required"));
        }
        
        return errors;
    }

    @Override
    public void reset(ActionMapping mapping, 
            HttpServletRequest request) {
        name = "";
        address = "";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
}
