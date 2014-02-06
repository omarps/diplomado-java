/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.sprint.struts.hibernate.action;

import com.java.sprint.struts.hibernate.domain.Customer;
import com.java.sprint.struts.hibernate.form.CustomerForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.ActionSupport;

/**
 *
 * @author Omar
 */
public class AddCustomerAction extends ActionSupport {

    @Override
    public ActionForward execute(
            ActionMapping mapping, 
            ActionForm form, 
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
        
        // TODO customerService
        
        CustomerForm customerForm = 
                (CustomerForm) form;
        Customer customer = new Customer();
        BeanUtils.copyProperties(customer, customerForm);
        
        // TODO addCustomer
        
        return mapping.findForward("success");
    }
    
}
