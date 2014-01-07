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
public class HtmlSelectOptionForm extends org.apache.struts.action.ActionForm {

    private String year;

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        
        if (getYear() == null || ("".equals(getYear()))) {
            errors.add("common.select.err", 
                new ActionMessage("error.common.html.select.required"));
        }
        
        return errors;
    }
    
    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        year = "";
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }
    
}
