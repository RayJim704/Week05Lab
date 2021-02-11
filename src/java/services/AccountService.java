package services;


import models.User;

/**
 *
 * @author Raymond Jimoh
 */
public class AccountService  {

    public User login(String username, String password) {
        if ((username.equals("adam") || username.equals("betty")) && password.equals("password"))
            return new User(username, null);
        
        return null;
    }

}
