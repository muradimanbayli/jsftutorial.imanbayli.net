/*
 * ExplorerElement.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Nov 9, 2016  12:26:30 AM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.bean;

import net.imanbayli.jsftutorial.type.ElementType;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
public class ExplorerElement {
    private ElementType type;
    private String name;
    private long size;

    public ElementType getType() {
        return type;
    }

    public void setType(ElementType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
    
    public String sizeWithFormat(){
        if(size>1024*1024){
            return size/1024/1024 + "MByte";
        }else if (size>1024){
            return size/1024+" KByte";
        }else{
            return size+ "Byte";
        }
    }
    
}
