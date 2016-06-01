/*
 * NamesConvertor.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Jun 1, 2016  3:53:01 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.convertor;

import java.util.ArrayList;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@FacesConverter(value = "net.imanbayli.jsftutorial.convertor.NamesConvertor")
public class NamesConvertor implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        String[] names=value.split("-");
        List<String> listName=new ArrayList<String>();
        
        for(String name:names){
            listName.add(name);
        }
        return listName;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return value.toString();
    }
    
}
