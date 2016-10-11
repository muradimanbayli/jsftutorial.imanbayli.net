/*
 * TagController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Oct 11, 2016  2:48:08 PM
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
public class TagController {
    private String inputTag;
    private List<String> tags;
    
    @PostConstruct
    public void init(){
        if(tags==null){
            tags=new ArrayList<String>();
        }
    }
    
    public void splitTag(){
        
        String[] tagArray=inputTag.split(",");
        inputTag="";
        for(String singleTag:tagArray){
            tags.add(singleTag);
        }
    }
    
    public void removeTag(String tag){
        tags.remove(tag);
    }

    public String getInputTag() {
        return inputTag;
    }

    public void setInputTag(String inputTag) {
        this.inputTag = inputTag;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    
    
    
}
