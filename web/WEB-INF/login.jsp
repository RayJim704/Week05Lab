<%-- 
    Document   : login
    Created on : Feb 11, 2021, 2:00:52 PM
    Author     : Raymond Jimoh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>This is a title</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="POST" action="login">
            <label>Enter your username:</label>
            <input type="text" name="username"><br><br>
            
            <label>Enter your password:</label>
            <input type="password" name="password"><br><br>
            
            <input type="submit" name="login" value="Log In">
        </form>
        
    </body>
</html>
