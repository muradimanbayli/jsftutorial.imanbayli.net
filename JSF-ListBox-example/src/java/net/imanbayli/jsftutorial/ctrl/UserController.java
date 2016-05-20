/*
 * UserController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 19, 2016  12:47:31 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.ctrl;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@ManagedBean
@SessionScoped
public class UserController {
    private String year;

    public void show(){
        System.out.println("Year :"+year);
    }
    
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    
}
