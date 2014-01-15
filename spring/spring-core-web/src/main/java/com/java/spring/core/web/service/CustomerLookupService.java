/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.spring.core.web.service;

import com.java.spring.core.web.beans.Customer;

/**
 *
 * @author Omar
 */
public interface CustomerLookupService {
    
    Customer getCustomer(String id);
    
    Customer getRichestCustomer();
    
}
