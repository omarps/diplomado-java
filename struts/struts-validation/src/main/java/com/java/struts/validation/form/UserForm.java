/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.struts.validation.form;

import org.apache.struts.validator.ValidatorForm;

/**
 *
 * @author Omar
 */
public class UserForm extends ValidatorForm {
    
    private String username;
    private String pwd;
    private String pwd2;
    private String email;

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd the pwd to set
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * @return the pwd2
     */
    public String getPwd2() {
        return pwd2;
    }

    /**
     * @param pwd2 the pwd2 to set
     */
    public void setPwd2(String pwd2) {
        this.pwd2 = pwd2;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
