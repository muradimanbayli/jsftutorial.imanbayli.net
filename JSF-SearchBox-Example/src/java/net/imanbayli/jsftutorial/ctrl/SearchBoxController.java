/*
 * SearchBoxController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 27, 2016  12:10:02 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.ctrl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@ManagedBean
@SessionScoped
public class SearchBoxController {
    private List<String> data =null;
    private List<String> result = null;
    private String display="";
    
    @PostConstruct
    public void init(){
        data=new ArrayList<String>();
        result=new ArrayList<String>();
        
        data.add("Antigua and Barbuda");
        data.add("Argentina");
        data.add("Aruba");
        data.add("Afghanistan");
        data.add("Azerbaijan");
    }
    
    public void search(){
        result.clear();
        for(String country:data){
            if(country.toLowerCase().startsWith(display.toLowerCase())){
                result.add(country);
            }
        }
        
        if(result.isEmpty()){
            result.add("Not Found");
        }
    }

    public List<String> getResult() {
        return result;
    }

    public void setResult(List<String> result) {
        this.result = result;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
    
    
}
