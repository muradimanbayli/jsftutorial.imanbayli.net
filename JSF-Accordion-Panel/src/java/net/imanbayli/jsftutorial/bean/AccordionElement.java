/*
 * AccordionElement.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 30, 2016  2:38:21 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.bean;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
public class AccordionElement {
    private String title;
    private String body;

    public AccordionElement() {
    }

    public AccordionElement(String title, String body) {
        this.title = title;
        this.body = body;
    }
    
     

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    
}
