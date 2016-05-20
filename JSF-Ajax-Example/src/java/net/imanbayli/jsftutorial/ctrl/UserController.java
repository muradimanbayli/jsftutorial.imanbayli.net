/*
 * UserController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 20, 2016  6:58:39 PM
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
    
    public void ajaxClick(){
        System.out.println("Ajax click event");
    }
    
    public void ajaxChange(){
        System.out.println("Ajax change event");
    }
    
    public void ajaxDoubleClick(){
        System.out.println("Ajax double click event");
    }
    
    public void ajaxFocus(){
        System.out.println("Ajax focus event");
    }
    
    public void ajaxkeyDown(){
        System.out.println("Ajax keydown event");
    }
    
    public void ajaxkeyup(){
        System.out.println("Ajax keyup event");
    }
    
    public void ajaxkeypress(){
        System.out.println("Ajax keypress event");
    }
    
    public void ajaxMouseDown(){
        System.out.println("Ajax mouse down  event");
    }
    
    public void ajaxMouseMove(){
        System.out.println("Ajax mouse move event");
    }
    
    public void ajaxMouseOut(){
        System.out.println("Ajax mouse out event");
    }
    
    public void ajaxMouseOver(){
        System.out.println("Ajax mouse over event");
    }
    
    public void ajaxMouseUp(){
        System.out.println("Ajax Mouse Up event");
    }
    
    public void ajaxSelect(){
        System.out.println("Ajax Select Event");
    }
    
    public void ajaxBlur(){
        System.out.println("Ajax blur Event");
    }
    
    
}
