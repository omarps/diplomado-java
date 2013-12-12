/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.struts.actions;

/**
 *
 * @author Omar
 */
public class SuggestionUtils {

    private static String[] suggestedAddresses = {
        "emiliobotin@bsch.es",
        "gates@microsoft.com",
        "ortega@inditex.com",
        "ellison@oracle.com"
    };
    
    private static String chars = 
            "abcdefghijklmnopqrstuvwxyz0123456789#@$%^&*?!";
    
    public static SuggestionBean getSuggestionBean() {
        String address = randomString(suggestedAddresses);
        String password = randomString(chars, 8);
        return new SuggestionBean(address, password);
    }
    
    public static int randomInt(int range) {
        return (int)(Math.random() * range);
    }
    
    public static String randomString(String[] strings) {
        return strings[randomInt(strings.length)];
    }
    
    public static char randomChar(String string) {
        return string.charAt(randomInt(string.length()));
    }
    
    public static String randomString(String string, int length) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(randomChar(string));
        }
        return result.toString();
    }

}
