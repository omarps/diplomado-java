package com.java.simplemvcapp.beans;

import java.util.HashMap;

/**
 *
 * @author Omar
 */
public class BankCustomer {

    private String id;
    private String firstName;
    private String lastName;
    private double balance;

    public BankCustomer(String id, String firstName,
            String lastName, double balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getBalanceNoSign() {
        return Math.abs(balance);
    }

      // Makes a small table of banking customers.
    private static HashMap customers;

    static {
        customers = new HashMap();
        customers.put("id001",
                new BankCustomer("id001",
                        "John",
                        "Hacker",
                        -3456.78));
        customers.put("id002",
                new BankCustomer("id002",
                        "Jane",
                        "Hacker",
                        1234.56));
        customers.put("id003",
                new BankCustomer("id003",
                        "Juan",
                        "Hacker",
                        987654.32));
    }

    /**
     * Finds the customer with the given ID. Returns null if there is no match.
     */
    public static BankCustomer getCustomer(String id) {
        return ((BankCustomer) customers.get(id));
    }

}
