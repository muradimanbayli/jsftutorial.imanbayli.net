/*
 * UploadController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Jun 15, 2016  5:34:30 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.ctrl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@ManagedBean
@SessionScoped
public class UploadController {
    private Part image;
    private boolean upladed;
    
    
    public void doUpload(){
        try{
            InputStream in=image.getInputStream();
            
            File f=new File("/Users/muradimanbayli/Desktop/upload/"+image.getSubmittedFileName());
            f.createNewFile();
            FileOutputStream out=new FileOutputStream(f);
            
            byte[] buffer=new byte[1024];
            int length;
            
            while((length=in.read(buffer))>0){
                out.write(buffer, 0, length);
            }
            
            out.close();
            in.close();
            
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("path", f.getAbsolutePath());
            upladed=true;
            
        }catch(Exception e){
            e.printStackTrace(System.out);
        }
    
    }

    public Part getImage() {
        return image;
    }

    public void setImage(Part image) {
        this.image = image;
    }

    public boolean isUpladed() {
        return upladed;
    }

    public void setUpladed(boolean upladed) {
        this.upladed = upladed;
    }
    
    
}
