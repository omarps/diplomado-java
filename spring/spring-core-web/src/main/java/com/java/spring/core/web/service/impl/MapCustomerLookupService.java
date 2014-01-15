/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.spring.core.web.service.impl;

import com.java.spring.core.web.beans.Customer;
import com.java.spring.core.web.service.CustomerLookupService;
import java.util.Map;

/**
 *
 * @author Omar
 */
public class MapCustomerLookupService 
        implements CustomerLookupService {
    
    private Map<String, Customer> sampleCustomers;

    /**
     * Dado el id que estamos recibiendo, vamos a obtener
     * un cliente del mapa de sampleCustomer
     * @param id el id
     * @return el cliente
     */
    public Customer getCustomer(String id) {
        if (id == null)
            id = "unknown";
        Customer customer = sampleCustomers.get(id.toLowerCase());
        return customer;
    }

    /**
     * Traernos al cliente mas rico
     * @return cliente mas rico
     */
    public Customer getRichestCustomer() {
        double maxBalance = -Double.MAX_VALUE;
        Customer richestCustomer = null;
        for (Customer c: sampleCustomers.values()) {
            if (c.getBalance() > maxBalance) {
                maxBalance = c.getBalance();
                richestCustomer = c;
            }
        }
        return richestCustomer;
    }

    /**
     * @return the sampleCustomers
     */
    public Map<String, Customer> getSampleCustomers() {
        return sampleCustomers;
    }

    /**
     * @param sampleCustomers the sampleCustomers to set
     */
    public void setSampleCustomers(Map<String, Customer> sampleCustomers) {
        this.sampleCustomers = sampleCustomers;
    }
    
}
