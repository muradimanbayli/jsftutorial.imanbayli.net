/*
 * TabController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Jun 18, 2016  4:03:26 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.ctrl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import net.imanbayli.jsftutorial.bean.Tab;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@ManagedBean
@SessionScoped
public class TabController {
    private List<Tab> tabs = null;
    private Tab selectedtab =null;
    
    @PostConstruct
    public void init(){
        if(tabs==null){
            tabs=new ArrayList<Tab>();
        }
        
        tabs.add(new Tab("Java"));
        tabs.add(new Tab("PHP"));
        tabs.add(new Tab("Python"));
        tabs.add(new Tab("ASP.NET"));
        
        if(selectedtab==null){
            selectedtab=tabs.get(0);
        }
        
    }
    
    public void doSelect(Tab t){
        selectedtab=t;
        selectedtab.setContent(t.getTitle()+"Lorem ipsum <br/>Lorem ipsum <br/>Lorem ipsum <br/>Lorem ipsum <br/>Lorem ipsum <br/>Lorem ipsum <br/>Lorem ipsum <br/>Lorem ipsum <br/>Lorem ipsum <br/>Lorem ipsum <br/>Lorem ipsum <br/>Lorem ipsum <br/>"+new Date());
    }
    

    public List<Tab> getTabs() {
        return tabs;
    }

    public void setTabs(List<Tab> tabs) {
        this.tabs = tabs;
    }

    public Tab getSelectedtab() {
        return selectedtab;
    }

    public void setSelectedtab(Tab selectedtab) {
        this.selectedtab = selectedtab;
    }
    
    
    
    
    
    
    
}
