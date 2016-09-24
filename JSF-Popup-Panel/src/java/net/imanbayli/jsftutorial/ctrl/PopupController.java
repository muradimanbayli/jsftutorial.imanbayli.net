/*
 * ctrl.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Sep 24, 2016  3:46:59 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.ctrl;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@ManagedBean
@SessionScoped
public class PopupController implements Serializable{
    
    private boolean showPopup;
    
    public void show(){
        showPopup=true;
    }
    public void hide(){
        showPopup=false;
    }

    public boolean isShowPopup() {
        return showPopup;
    }

    public void setShowPopup(boolean showPopup) {
        this.showPopup = showPopup;
    }
    
    
}
