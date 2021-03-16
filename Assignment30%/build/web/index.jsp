<%-- 
    Document   : index
    Created on : 18-10-2020, 20:00:54
    Author     : cheeese vox
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login page</h1>
        <form action="MainController" method="POST">
            Username <input type="text" name="txtUsername" value=""
                            <font clor="red"><font/><br/>
            Password <input type="password" name="txtPassword" value=""
                            <font color="red"><font/><br/>
            <input type="submit" name="action" value="Login"/>
        </form>
    </body>
</html>
