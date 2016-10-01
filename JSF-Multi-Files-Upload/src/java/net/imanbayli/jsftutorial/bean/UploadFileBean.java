/*
 * UploadFileBean.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Oct 1, 2016  5:37:49 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.bean;

import javax.servlet.http.Part;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
public class UploadFileBean {
    private String fileName;
    private int uploadProgress;
    private Part filePart;

    public UploadFileBean() {
    }
    
    

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getUploadProgress() {
        return uploadProgress;
    }

    public void setUploadProgress(int uploadProgress) {
        this.uploadProgress = uploadProgress;
    }

    public Part getFilePart() {
        return filePart;
    }

    public void setFilePart(Part filePart) {
        this.filePart = filePart;
    }
    
    
}
