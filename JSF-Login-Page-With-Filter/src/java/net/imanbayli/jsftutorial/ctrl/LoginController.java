/*
 * LoginController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Jul 2, 2016  6:16:15 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.ctrl;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import net.imanbayli.jsftutorial.bean.User;
import net.imanbayli.jsftutorial.db.UserDataManager;
import org.w3c.dom.UserDataHandler;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@SessionScoped
@ManagedBean
public class LoginController {
    private String username;
    private String password;
    private UserDataManager dataManager;
    private User sessionUser;
    
    @PostConstruct
    public void init(){
        if(dataManager==null){
            dataManager=new UserDataManager();
        }
    }
    
    
    public String login(){
        sessionUser=dataManager.findUser(username, password);
        
        if(sessionUser!=null){
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("username", username);
            return "inner/index.xhtml?faces-redirect=true";
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Username or Password is invalid"));
        }
        
        return "index.xhtml";
    }
    
    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("username");
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        sessionUser=null;
        return "index.xhtml?faces-redirect=true";
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getSessionUser() {
        return sessionUser;
    }

    public void setSessionUser(User sessionUser) {
        this.sessionUser = sessionUser;
    }
    
    
}
