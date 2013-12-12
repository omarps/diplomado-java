/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.struts.actions.action;

<<<<<<< HEAD
import com.java.struts.actions.SuggestionUtils;
import com.java.struts.actions.form.UserFormBean;
=======
>>>>>>> da5fd25aa307d9a78b75e3270e27867d76560254
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Omar
 */
public class RegisterAction3 extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
<<<<<<< HEAD
    private static final String BAD_ADDRESS = "bad-address";
    private static final String BAD_PASSWORD = "bad-password";
=======
>>>>>>> da5fd25aa307d9a78b75e3270e27867d76560254

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
<<<<<<< HEAD
        UserFormBean userFormBean = (UserFormBean) form;
        String email = userFormBean.getEmail();
        String password = userFormBean.getPassword();
        
        if ((email == null) || (email.trim().length() < 3) 
                || (email.indexOf("@") == -1)) {
            request.setAttribute("suggestionBean", 
                    SuggestionUtils.getSuggestionBean());
            return mapping.findForward(BAD_ADDRESS);
        } else if ((password == null) || (password.trim().length() < 6)) {
            request.setAttribute("suggestionBean", 
                    SuggestionUtils.getSuggestionBean());
            return mapping.findForward(BAD_PASSWORD);
        } else {
            return mapping.findForward(SUCCESS);
        }
=======
        return mapping.findForward(SUCCESS);
>>>>>>> da5fd25aa307d9a78b75e3270e27867d76560254
    }
}
