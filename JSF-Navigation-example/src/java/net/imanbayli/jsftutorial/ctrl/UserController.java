package net.imanbayli.jsftutorial.ctrl;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * UserController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 16, 2016  10:03:12 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@ManagedBean(name = "UserCtrl")
@SessionScoped
public class UserController {
    private String pageNumber;
    
    public String forwardPage(){
        if("2".equals(pageNumber)){
            return "second.xhtml?faces-redirect=true";
        }else{
            return "third.xhtml?faces-redirect=true";
        }
    }

    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }
    
    
}
