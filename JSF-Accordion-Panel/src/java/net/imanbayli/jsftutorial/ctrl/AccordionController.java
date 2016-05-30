/*
 * AccordionController.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 30, 2016  2:39:24 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.ctrl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import net.imanbayli.jsftutorial.bean.AccordionElement;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@ManagedBean
@SessionScoped
public class AccordionController {
    private List<AccordionElement> elements=null;
    
    @PostConstruct
    public void init(){
        elements=new ArrayList<AccordionElement>();
        elements.add(new AccordionElement("Title 1", "Lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum "));
        elements.add(new AccordionElement("Title 2", "Lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum "));
        elements.add(new AccordionElement("Title 3", "Lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum "));
        elements.add(new AccordionElement("Title 4", "Lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum "));
        elements.add(new AccordionElement("Title 5", "Lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum "));
        elements.add(new AccordionElement("Title 6", "Lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum "));
        elements.add(new AccordionElement("Title 7", "Lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum "));
    }

    public List<AccordionElement> getElements() {
        return elements;
    }

    public void setElements(List<AccordionElement> elements) {
        this.elements = elements;
    }
    
    
}
