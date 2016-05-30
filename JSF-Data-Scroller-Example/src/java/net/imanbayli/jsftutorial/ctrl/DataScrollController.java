/*
 * DataScrollController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 30, 2016  10:56:36 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.ctrl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import net.imanbayli.jsftutorial.bean.News;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@ManagedBean
@SessionScoped
public class DataScrollController {
    private List<News> news =null;
    
    @PostConstruct
    public void init(){
        news=new ArrayList<News>();
        
        for(int i=0;i<20;i++){
            news.add(new News("Title "+news.size(), "Lorem ipsum Lorem ipsum Lorem ipsum", new  Date()));
        }
    }
    
    public void loadData(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(DataScrollController.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<5;i++){
            news.add(new News("Title "+news.size(), "Lorem ipsum Lorem ipsum Lorem ipsum", new  Date()));
        }
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
    
    
}
