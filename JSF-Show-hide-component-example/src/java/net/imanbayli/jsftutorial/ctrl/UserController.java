/*
 * UserController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Jun 2, 2016  12:58:32 PM
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
    private boolean visible;
    
    public void show(){
        visible=true;
    }
    
    public void hide(){
        visible=false;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    
}
