/*
 * UserController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Jun 6, 2016  4:42:09 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.crtl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import net.imanbayli.jsftutorial.bean.Experience;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@SessionScoped
@ManagedBean
public class UserController {
    private List<Experience> experienceGroup = null;
    
    @PostConstruct
    public void init(){
        experienceGroup=new ArrayList<Experience>();
    }
    
    public void add(){
        experienceGroup.add(new Experience());
    }
    
    public void remove(Experience e){
        experienceGroup.remove(e);
    }
    
    public String save(){
        return "result.xhtml?faces-redirect=true";
    }

    public List<Experience> getExperienceGroup() {
        return experienceGroup;
    }

    public void setExperienceGroup(List<Experience> experienceGroup) {
        this.experienceGroup = experienceGroup;
    }
    
    
}
