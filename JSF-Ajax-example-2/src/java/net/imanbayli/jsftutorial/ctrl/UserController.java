/*
 * UserController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 21, 2016  5:46:45 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.ctrl;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@SessionScoped
@ManagedBean
public class UserController {
    private String name;
    private String outputext;
    
    public void sayHelloAction(){
        outputext="Hello "+name;
        System.out.println("it works");
        System.out.println("Name:"+name);
        System.out.println("outputtext:"+outputext);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOutputext() {
        return outputext;
    }

    public void setOutputext(String outputext) {
        this.outputext = outputext;
    }
    
    
}
