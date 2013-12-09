/*
 * Serializable por Session Scope
 */
package com.java.jspbeanapp.beans;

import java.io.Serializable;

/**
 *
 * @author Omar
 */
public class BakedBean implements Serializable {

    private String level = "half-baked";
    private String goesWith = "hot dogs";

    /**
     * @return the level
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * @return the goesWith
     */
    public String getGoesWith() {
        return goesWith;
    }

    /**
     * @param goesWith the goesWith to set
     */
    public void setGoesWith(String goesWith) {
        this.goesWith = goesWith;
    }

}
