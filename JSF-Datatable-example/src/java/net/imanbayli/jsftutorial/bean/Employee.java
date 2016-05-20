/*
 * Employee.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 20, 2016  2:34:22 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.bean;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
public class Employee {
    private String name;
    private String surname;
    private int birthYear;

    public Employee(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public Employee() {
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", surname=" + surname + ", birthYear=" + birthYear + '}';
    }
    
    
    
    
}
