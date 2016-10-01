/*
 * MultiUploadController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Oct 1, 2016  5:39:22 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.ctrl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import net.imanbayli.jsftutorial.bean.UploadFileBean;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@ManagedBean
@SessionScoped
public class MultiUploadController {

    private List<UploadFileBean> uploadFiles = null;
    private boolean uploadBegin = false;
    private final String uploadDir = "/Users/muradimanbayli/Desktop/";

    @PostConstruct
    public void init() {
        if (uploadFiles == null) {
            uploadFiles = new ArrayList<UploadFileBean>();
        }
    }

    public void uploadFilesAction() {
        System.out.println("begin+++++++++++++++++++");
        try {
            Collection<Part> parts = getParts();
            for (Part part : parts) {
                if (part.getSubmittedFileName() != null) {
                    UploadFileBean fileBean = new UploadFileBean();
                    fileBean.setFileName(part.getSubmittedFileName());
                    fileBean.setUploadProgress(0);
                    fileBean.setFilePart(part);
                    uploadFiles.add(fileBean);
                }
            }

            if (!uploadFiles.isEmpty()) {
                uploadBegin = true;
            }

            class UploadThread extends Thread {

                @Override
                public void run() {
                    try {
                        for (UploadFileBean fileBean : uploadFiles) {
                            File file = new File(uploadDir + fileBean.getFileName());
                            file.createNewFile();

                            FileOutputStream outputStream = new FileOutputStream(file);
                            InputStream inputStream = fileBean.getFilePart().getInputStream();

                            byte[] buffer = new byte[1024];
                            int length;

                            int sumLength = 0;

                            while ((length = inputStream.read(buffer)) != -1) {
                                sumLength += length;
                                int calculatedpercent=(int)(((double)sumLength /(double)fileBean.getFilePart().getSize()) * 100);
                                System.out.println(calculatedpercent);
                                fileBean.setUploadProgress(calculatedpercent);
                                outputStream.write(buffer, 0, length);
                            }
                            fileBean.setUploadProgress(100);

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
            
            UploadThread uploadThread=new UploadThread();
            uploadThread.start();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private Collection<Part> getParts() throws Exception {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
        return request.getParts();
    }

    public List<UploadFileBean> getUploadFiles() {
        return uploadFiles;
    }

    public void setUploadFiles(List<UploadFileBean> uploadFiles) {
        this.uploadFiles = uploadFiles;
    }

    public boolean isUploadBegin() {
        return uploadBegin;
    }

    public void setUploadBegin(boolean uploadBegin) {
        this.uploadBegin = uploadBegin;
    }
    
    

}
