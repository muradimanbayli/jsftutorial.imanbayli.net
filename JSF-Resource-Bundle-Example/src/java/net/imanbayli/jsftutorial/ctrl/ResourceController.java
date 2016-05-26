/*
 * ResourceController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 26, 2016  10:09:48 AM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.ctrl;

import java.util.Locale;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@ManagedBean
@SessionScoped
public class ResourceController {
    
    public void changeLocale(String lang){
        FacesContext context=FacesContext.getCurrentInstance();
        context.getViewRoot().setLocale(new Locale(lang));
    }
    
}
