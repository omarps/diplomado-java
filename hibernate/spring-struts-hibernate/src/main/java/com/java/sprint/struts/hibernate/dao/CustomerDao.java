/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.sprint.struts.hibernate.dao;

import com.java.sprint.struts.hibernate.domain.Customer;
import java.util.List;

/**
 *
 * @author Omar
 */
public interface CustomerDao {
    
    void addCustomer(Customer customer);
    
    List<Customer> findAllCustomer();
    
}
