/*
 * ButtonController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Jun 12, 2016  2:24:51 AM
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
public class ButtonController {
    private String buttonValue="No";
    
    public void changeButtonValue(){
        if("No".equals(buttonValue)){
            buttonValue="Yes";
        }else{
            buttonValue="No";
        }
    }

    public String getButtonValue() {
        return buttonValue;
    }

    public void setButtonValue(String buttonValue) {
        this.buttonValue = buttonValue;
    }
    
    
}
