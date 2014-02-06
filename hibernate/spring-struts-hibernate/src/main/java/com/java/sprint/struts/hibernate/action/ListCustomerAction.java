/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.sprint.struts.hibernate.action;

import com.java.sprint.struts.hibernate.domain.Customer;
import com.java.sprint.struts.hibernate.service.CustomerService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.springframework.web.struts.ActionSupport;

/**
 *
 * @author Omar
 */
public class ListCustomerAction extends ActionSupport {
    
    @Override
    public ActionForward execute(
            ActionMapping mapping, 
            ActionForm form, 
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
        CustomerService customerService = 
                (CustomerService) getWebApplicationContext()
                .getBean("customerService");
        
        DynaActionForm dynaCustomerListForm = 
                (DynaActionForm) form;
        
        List<Customer> customerList = 
                customerService.findAllCustomer();
        
        dynaCustomerListForm.set("customerList", customerList);
        return mapping.findForward("success");
    }
    
}
