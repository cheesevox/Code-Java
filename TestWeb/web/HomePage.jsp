<%-- 
    Document   : HomePage
    Created on : 06-10-2020, 10:36:35
    Author     : cheeese vox
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            Login Form
        </h1>
        <form action="LoginController" method="POST">
            username: <input type="text" name="user" /><br>
            password: <input type="text" name="password" /><br>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>
