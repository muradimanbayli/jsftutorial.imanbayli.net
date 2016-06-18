/*
 * Tab.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Jun 18, 2016  4:02:25 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.bean;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
public class Tab {
    private String title;
    private String content;

    public Tab() {
    }
    
    public Tab(String title) {
        this.title = title;
    }

    public Tab(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
}
