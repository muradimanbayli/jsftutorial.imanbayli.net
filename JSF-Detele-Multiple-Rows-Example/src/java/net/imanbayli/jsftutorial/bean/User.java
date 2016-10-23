/*
 * User.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Oct 23, 2016  1:11:21 AM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.bean;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
public class User {
    private String name;
    private String surname;
    private int age;
    private boolean selected;

    public User() {
    }

    public User(String name, String surname, int age, boolean selected) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.selected = selected;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    
    
            
}
