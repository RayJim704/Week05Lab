package models;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Raymond Jimoh
 */
public class User extends HttpServlet {

    private String username;
    private String password;
    
    public User() {
        
    }
    
    public User(String username, String password) {
        username = this.username;
        password = this.password;
    }
  
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

  

}
