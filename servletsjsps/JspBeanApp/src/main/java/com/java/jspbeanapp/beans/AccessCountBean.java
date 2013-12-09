package com.java.jspbeanapp.beans;

/**
 *
 * @author Omar
 */
public class AccessCountBean {

    private String firstPage;
    private int accessCount = 1;

    /**
     * @return the firstPage
     */
    public String getFirstPage() {
        return firstPage;
    }

    /**
     * @param firstPage the firstPage to set
     */
    public void setFirstPage(String firstPage) {
        this.firstPage = firstPage;
    }

    /**
     * @return the accessCount
     */
    public int getAccessCount() {
        return accessCount;
    }

    /**
     * @param accessCount the accessCount to set
     */
    public void setAccessCount(int accessCount) {
        this.accessCount = accessCount;
    }
    
    public void setAccessCountIncrement(int increment) {
        accessCount = accessCount + increment;
    }

}
