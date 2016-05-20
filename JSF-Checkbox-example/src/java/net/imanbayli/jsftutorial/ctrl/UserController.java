/*
 * UserController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 18, 2016  5:04:48 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.ctrl;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@ManagedBean(name = "UserCtrl")
@SessionScoped
public class UserController {
    private boolean married;

    public void show(){
        System.out.println("Married :"+married);
    }
    
    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
    
    
}
