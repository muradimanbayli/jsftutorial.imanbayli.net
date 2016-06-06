/*
 * Experience.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Jun 6, 2016  4:44:01 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.bean;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
public class Experience {
    private String company;
    private String position;

    public Experience() {
    }

    public Experience(String company, String position) {
        this.company = company;
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    
}
