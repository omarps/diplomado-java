/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.sprint.struts.hibernate.dao.impl;

import com.java.sprint.struts.hibernate.dao.CustomerDao;
import com.java.sprint.struts.hibernate.domain.Customer;
import java.util.Date;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Omar
 */
public class CustomerDaoImpl extends HibernateDaoSupport 
                             implements CustomerDao{

    public void addCustomer(Customer customer) {
        customer.setCreatedDate(new Date());
        getHibernateTemplate().save(customer);
    }

    public List<Customer> findAllCustomer() {
        return getHibernateTemplate()
                .find("from Customer");
    }
}
