/*
 * UserController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Oct 23, 2016  1:10:55 AM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.ctrl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import net.imanbayli.jsftutorial.bean.User;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@ManagedBean
@SessionScoped
public class UserController {
    private List<User> users=null;
    
    @PostConstruct
    public void init(){
        if(users==null){
            users=new ArrayList<User>();
        }
        users.add(new User("Murad","Imanbayli",25,false));
        users.add(new User("Fuad","Pashabayli",28,false));
        users.add(new User("Ilkin","Abdullayev",24,false));
        users.add(new User("Elmar","Mammadov",20,false));
    }
    
    public void delete(){
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).isSelected()){
                users.remove(i);
            }
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    
    
}
