/*
 * UserController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 26, 2016  4:24:27 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.ctrl;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@RequestScoped
@ManagedBean
public class UserController {
    private String username;
    private String outputtext;
    
    public void sayHello(){
        outputtext="Hello "+username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOutputtext() {
        return outputtext;
    }

    public void setOutputtext(String outputtext) {
        this.outputtext = outputtext;
    }
    
    
}
