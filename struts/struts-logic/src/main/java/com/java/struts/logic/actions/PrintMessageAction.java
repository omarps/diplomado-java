/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.struts.logic.actions;

import com.java.struts.logic.User;
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
public class PrintMessageAction extends org.apache.struts.action.Action {

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
        
        List<String> messageList = new ArrayList<String>();
        
        messageList.add("Mensaje A");
        messageList.add("Mensaje B");
        messageList.add("Mensaje C");
        messageList.add("Mensaje D");
        
        request.setAttribute("messageList", messageList);
        
        List<User> userList = new ArrayList<User>();
        
        userList.add(new User("usuario 1", "http://www.usuario1.com"));
        userList.add(new User("usuario 2", "http://www.usuario2.com"));
        userList.add(new User("usuario 3", "http://www.usuario3.com"));
        userList.add(new User("usuario 4", "http://www.usuario4.com"));
        
        request.setAttribute("userList", userList);
        
        return mapping.findForward(SUCCESS);
    }
}
