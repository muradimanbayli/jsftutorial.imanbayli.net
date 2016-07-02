/*
 * UserDataManager.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Jul 2, 2016  6:11:56 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.db;

import net.imanbayli.jsftutorial.bean.User;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
public class UserDataManager {
    
    
    public User findUser(String username,String password){
        if("murad".equalsIgnoreCase(username) && "murad123".equalsIgnoreCase(password)){
            return new User("Murad","Imanbayli");
        }else if("ilkin".equalsIgnoreCase(username) && "ilkin2016".equalsIgnoreCase(password)){
            return new User("Ilkin","Abdullayev");
        }else if("fuad".equalsIgnoreCase(username) && "fuadfuad".equalsIgnoreCase(password)){
            return new User("Fuad","Pashabeyli");
        }
        return null;
    }
}
