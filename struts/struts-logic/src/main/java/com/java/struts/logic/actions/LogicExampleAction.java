/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.struts.logic.actions;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Omar
 */
public class LogicExampleAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

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
        
        // messageList0 - Contiene valores
        List<String> messageList0 = new ArrayList<String>();
        
        messageList0.add("Mensaje A");
        messageList0.add("Mensaje B");
        messageList0.add("Mensaje C");
        messageList0.add("Mensaje D");
        
        request.setAttribute("messageList0", messageList0);
        
        // messageList1 - Es una lista vacia
        List<String> messageList1 = new ArrayList<String>();
        request.setAttribute("messageList1", messageList1);
        
        // messageList2 - Esta lista no va a existir
        
        return mapping.findForward(SUCCESS);
    }
}
