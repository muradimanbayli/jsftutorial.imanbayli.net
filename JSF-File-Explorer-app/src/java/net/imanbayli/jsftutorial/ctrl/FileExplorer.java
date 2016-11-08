/*
 * FileExplorer.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Nov 9, 2016  12:25:34 AM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.ctrl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;
import net.imanbayli.jsftutorial.bean.ExplorerElement;
import net.imanbayli.jsftutorial.type.ElementType;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@ManagedBean
@SessionScoped
public class FileExplorer {

    private String currentPath;
    private List<ExplorerElement> elements;
    private File currentFile;
    private Part uploadFile;

    @PostConstruct
    public void init() {
        currentPath = "/Users";
        elements = new ArrayList<ExplorerElement>();
        loadAllFilesAndDirectories();
    }

    private void loadAllFilesAndDirectories() {
        currentFile = new File(currentPath);
        elements.clear();
        for (File f : currentFile.listFiles()) {
            if (f.isHidden()) {
                continue;
            }
            ExplorerElement ee = new ExplorerElement();
            if (f.isDirectory()) {
                ee.setType(ElementType.FOLDER);
            } else if (f.isFile()) {
                ee.setType(ElementType.FILE);
            }
            ee.setName(f.getName());
            ee.setSize(f.length());
            elements.add(ee);
        }
    }

    public void enter(ExplorerElement e) {
        currentPath = currentPath + "/" + e.getName();
        loadAllFilesAndDirectories();
    }

    public void back() {
        currentPath = currentPath.substring(0, currentPath.lastIndexOf("/"));
        loadAllFilesAndDirectories();
    }

    public void upload() {
        try {
            File copyFile = new File(currentPath + "/" + uploadFile.getSubmittedFileName());
            copyFile.createNewFile();
            InputStream inputStream = uploadFile.getInputStream();
            FileOutputStream outputStream = new FileOutputStream(copyFile);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }
            
            outputStream.close();
            
            loadAllFilesAndDirectories();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void download(ExplorerElement e){
        try {
            FacesContext context=FacesContext.getCurrentInstance();
            ExternalContext externalContext=context.getExternalContext();
            
            externalContext.responseReset();
            externalContext.setResponseHeader("Content-Disposition", "attachment;filename=\""+e.getName()+"\"");
            
            File target=new File(currentPath+"/"+e.getName());
            FileInputStream inputStream=new FileInputStream(target);
            OutputStream outputStream=externalContext.getResponseOutputStream();
            
            byte[] buffer=new byte[1024];
            int length;
            while((length=inputStream.read(buffer))!=-1){
                outputStream.write(buffer, 0, length);
            }
            
            inputStream.close();
            context.responseComplete();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String getCurrentPath() {
        return currentPath;
    }

    public void setCurrentPath(String currentPath) {
        this.currentPath = currentPath;
    }

    public List<ExplorerElement> getElements() {
        return elements;
    }

    public void setElements(List<ExplorerElement> elements) {
        this.elements = elements;
    }

    public Part getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(Part uploadFile) {
        this.uploadFile = uploadFile;
    }

}
