/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spring.struts.hibernate.service.impl;

import com.java.spring.struts.hibernate.dao.CustomerDao;
import com.java.spring.struts.hibernate.domain.Customer;
import com.java.spring.struts.hibernate.service.CustomerService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Omar
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;
    
    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    public List<Customer> findAllCustomer() {
        List<Customer> customerList = 
                customerDao.findAllCustomer();
        return customerList;
    }

    /**
     * @param customerDao the customerDao to set
     */
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

}
