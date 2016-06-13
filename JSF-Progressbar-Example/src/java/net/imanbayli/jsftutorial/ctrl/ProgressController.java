/*
 * ProgressController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Jun 13, 2016  11:11:15 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.ctrl;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@ManagedBean
@SessionScoped
public class ProgressController {
    private int progress;
    
    public void doProgress(){
        class ProgressThread extends Thread{

            @Override
            public void run() {
                while(progress<100){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProgressController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    progress=progress+5;
                }
            }
            
        }
        
        ProgressThread pt=new ProgressThread();
        pt.start();
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
    
    
}
