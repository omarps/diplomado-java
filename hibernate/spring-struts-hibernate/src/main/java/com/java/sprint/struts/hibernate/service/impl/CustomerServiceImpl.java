/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.sprint.struts.hibernate.service.impl;

import com.java.sprint.struts.hibernate.domain.Customer;
import com.java.sprint.struts.hibernate.service.CustomerService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Omar
 */
public class CustomerServiceImpl implements CustomerService {

    public void addCustomer(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Customer> findAllCustomer() {
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer(1, "Raul", "", new Date()));
        customerList.add(new Customer(2, "Jesus", "", new Date()));
        customerList.add(new Customer(3, "Alvaro", "", new Date()));
        return customerList;
    }

}
