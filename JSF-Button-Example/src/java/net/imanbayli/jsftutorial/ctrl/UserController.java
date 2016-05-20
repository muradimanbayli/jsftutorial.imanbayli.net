/*
 * UserController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 16, 2016  7:14:07 PM
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
    
    public void clickMe(){
        System.out.println("Clicked Me !!!");
    }
}
