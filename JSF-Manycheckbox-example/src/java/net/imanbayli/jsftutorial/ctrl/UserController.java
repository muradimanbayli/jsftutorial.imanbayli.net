/*
 * UserController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 19, 2016  9:19:43 AM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.ctrl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@ManagedBean
@SessionScoped
public class UserController {
    private List<String> values;
    private Map<String,String> items;
    
    @PostConstruct
    public void init(){
        values=new ArrayList<String>();
        items=new HashMap<String, String>();
        
        items.put("JSF", "Java Server Faces");
        items.put("JSP", "Java Server Pages");
    }
    
    public void show(){
        System.out.println(values);
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public Map<String, String> getItems() {
        return items;
    }

    public void setItems(Map<String, String> items) {
        this.items = items;
    }
    
    
}
