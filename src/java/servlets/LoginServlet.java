package servlets;

import java.io.IOException;
import services.AccountService;
import models.User;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Raymond Jimoh
 */
public class LoginServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            if(request.getParameter("logout") != null){
            request.getSession().invalidate();
            request.setAttribute("message", "Session has been logged out");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            
        }else if(request.getSession().getAttribute("username") != null){
           response.sendRedirect("home");
        }else{
             getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        
        if (name.equals("") && password.equals("")) {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
           
        }
        
            AccountService as = new AccountService();
            User user = as.login(name, password);
        
            if(user != null) {
                request.getSession().setAttribute("username", name);
                HttpSession session = request.getSession();
                session.setAttribute("name", name);
                response.sendRedirect("home");
            }
       
        
        
       
    }


}
