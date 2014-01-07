/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.struts.html.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Omar
 */
public class HtmlHiddenForm extends org.apache.struts.action.ActionForm {

    private String name;

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        
        if (getName() == null || ("".equals(getName()))) {
            errors.add("common.name.err", 
                new ActionMessage("error.common.html.hidden.name.required"));
        }
        
        return errors;
    }

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        name = "";
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
}
