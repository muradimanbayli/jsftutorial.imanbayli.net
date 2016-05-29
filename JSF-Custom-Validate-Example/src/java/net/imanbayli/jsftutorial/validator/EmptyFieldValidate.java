/*
 * EmptyFieldValidate.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 29, 2016  1:08:14 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@FacesValidator(value = "net.imanbayli.jsftutorial.validator.EmptyFieldValidate")
public class EmptyFieldValidate implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
       
        
        if(value!=null){
           if(value.toString().trim().equals("")){
               FacesMessage message=new FacesMessage(component.getAttributes().get("label")+" is empty");
               message.setSeverity(FacesMessage.SEVERITY_WARN);
               throw new ValidatorException(message);
           }
       }
    }
    
}
