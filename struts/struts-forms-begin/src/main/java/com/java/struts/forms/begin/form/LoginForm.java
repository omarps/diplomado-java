/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.struts.forms.begin.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Omar
 */
public class LoginForm extends org.apache.struts.action.ActionForm {
    
    private String username;
    private String password;

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        System.out.println("LoginForm::reset()");
        username = null;
        password = null;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        System.out.println("LoginForm::validate()");
        ActionErrors errors = new ActionErrors();
        if (username == null || "".equals(username.trim())) {
            errors.add("username", 
                    new ActionMessage("login.username.error"));
        }
        if (password == null || "".equals(password.trim())) {
            errors.add("password", 
                    new ActionMessage("login.password.error"));
        }
        return errors;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        System.out.println("LoginForm::getUsername()");
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        System.out.println("LoginForm::setUsername()");
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
