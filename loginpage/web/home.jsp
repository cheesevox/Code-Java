<%-- 
    Document   : home
    Created on : Jan 21, 2021, 1:19:40 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="MainController" method="POST">
            Username <input type="text" name="txtUsername"/></br>
            Password <input type="password" name="txtPassword"/></br>
            <input type="submit" name="action" value="Login"/>
            <input type="reset" name="Reset"/>
        </form>
    </body>
</html>
