/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.struts.validation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;

/**
 *
 * @author Omar
 */
public class LoginAction extends Action {

    @Override
    public ActionForward execute(
            ActionMapping mapping, 
            ActionForm form, 
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
        DynaValidatorForm loginForm = (DynaValidatorForm) form;
        String username = loginForm.get("username").toString();
        if ("eswar".equals(username)) {
            return mapping.findForward("success");
        } else {
            return mapping.findForward("failure");
        }
    }
    
}
