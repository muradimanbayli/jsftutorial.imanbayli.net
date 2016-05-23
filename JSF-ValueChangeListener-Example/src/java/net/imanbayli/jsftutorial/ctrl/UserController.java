package net.imanbayli.jsftutorial.ctrl;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

/*
 * UserController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 23, 2016  2:35:14 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@ManagedBean
@SessionScoped
public class UserController {
    private Map<String,String> countries;
    private Map<String,String> cities;
    
    @PostConstruct
    public void init(){
        countries=new LinkedHashMap<String,String>();
        cities=new LinkedHashMap<String,String>();
        
        countries.put("Azerbaijan", "Azerbaijan");
        countries.put("Turkey", "Turkey");
    }
    
    public void valueChange(ValueChangeEvent e){
        System.out.println("Old Value:"+e.getOldValue());
        System.out.println("New Value:"+e.getNewValue());
        
        if("Azerbaijan".equals(e.getNewValue())){
            cities.clear();
            cities.put("Baku", "Baku");
            cities.put("Sumgayit", "Sumgayit");
            cities.put("Absheron", "Absheron");
        }else if ("Turkey".equals(e.getNewValue())){
            cities.clear();
            cities.put("Istanbul", "Istanbul");
            cities.put("Ankara", "Ankara");
            cities.put("Izmir", "Izmir");
        }
    }

    public Map<String, String> getCountries() {
        return countries;
    }

    public void setCountries(Map<String, String> countries) {
        this.countries = countries;
    }

    public Map<String, String> getCities() {
        return cities;
    }

    public void setCities(Map<String, String> cities) {
        this.cities = cities;
    }
    
    
}
