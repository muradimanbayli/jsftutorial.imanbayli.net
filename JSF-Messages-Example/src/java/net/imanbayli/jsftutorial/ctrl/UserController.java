/*
 * UserController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 23, 2016  11:34:44 AM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.ctrl;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@ManagedBean
@SessionScoped
public class UserController {
    private String input;
    
    public void doSomeThing(){
        FacesContext context=FacesContext.getCurrentInstance();
        if("1".equals(input)){
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info Message", "detail..."));
        }else if("2".equals(input)){
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning Message", "detail..."));
        }else if("3".equals(input)){
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Fatal Message", "detail..."));
        }else if("4".equals(input)){
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error Message", "detail..."));
        }
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    
    
}
