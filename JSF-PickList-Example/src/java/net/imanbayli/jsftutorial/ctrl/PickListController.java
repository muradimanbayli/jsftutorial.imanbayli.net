/*
 * PickListController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 25, 2016  1:50:15 PM
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
public class PickListController {
    private String leftValue;
    private List<String> leftItems;
    private String rightValue;
    private List<String> rightItems;
    
    @PostConstruct
    public void init(){
        leftItems=new ArrayList<String>();
        leftItems.add("BMW");
        leftItems.add("Audi");
        
        rightItems=new ArrayList<String>();
        rightItems.add("Toyota");
        rightItems.add("Ford");
    }
    
    public void test(){
        System.out.println("Workd");
    }
    
    public void pushToLeftSelected(){
        if(leftValue!=null){
            rightItems.add(leftValue);
            leftItems.remove(leftValue);
        }
    }
    
    public void pushToLeftAll(){
        rightItems.addAll(leftItems);
        leftItems.clear();
    }
    
    public void pushToRightSelected(){
        if(rightValue!=null){
            leftItems.add(rightValue);
            rightItems.remove(rightValue);
        }
    }
    
    public void pushToRightAll(){
        leftItems.addAll(rightItems);
        rightItems.clear();
    }

    public String getLeftValue() {
        return leftValue;
    }

    public void setLeftValue(String leftValue) {
        this.leftValue = leftValue;
    }

    public List<String> getLeftItems() {
        return leftItems;
    }

    public void setLeftItems(List<String> leftItems) {
        this.leftItems = leftItems;
    }

    public String getRightValue() {
        return rightValue;
    }

    public void setRightValue(String rightValue) {
        this.rightValue = rightValue;
    }

    public List<String> getRightItems() {
        return rightItems;
    }

    public void setRightItems(List<String> rightItems) {
        this.rightItems = rightItems;
    }
    
    
    
    
}
