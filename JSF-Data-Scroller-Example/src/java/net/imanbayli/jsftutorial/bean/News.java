/*
 * News.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 30, 2016  10:55:12 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.bean;

import java.util.Date;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
public class News {
    private String title;
    private String body;
    private Date newsDate;

    public News() {
    }

    public News(String title, String body, Date newsDate) {
        this.title = title;
        this.body = body;
        this.newsDate = newsDate;
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

    public Date getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(Date newsDate) {
        this.newsDate = newsDate;
    }
    
    
}
