/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.spring.core.web.beans;

import java.io.Serializable;

/**
 *
 * @author Omar
 */
public class ColorPreferences implements Serializable {
    
    private String background;
    private String foreground;

    /**
     * @return the background
     */
    public String getBackground() {
        return background;
    }

    /**
     * @param background the background to set
     */
    public void setBackground(String background) {
        if (!isEmpty(background)) {
            this.background = background;
        }
    }

    /**
     * @return the foreground
     */
    public String getForeground() {
        return foreground;
    }

    /**
     * @param foreground the foreground to set
     */
    public void setForeground(String foreground) {
        if (!isEmpty(foreground)) {
            this.foreground = foreground;
        }
    }
    
    private boolean isEmpty(String value) {
        return ((value == null) || "".equals(value));
    }
    
}
