<%-- 
    Document   : HomePage
    Created on : 06-10-2020, 12:09:03
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
        <h1>Login Page</h1>
        <form action="/LoginForm/LoginController" method="POST">
            username: <input type="text" name="txtusername"/><br>
            password: <input type="text" name="txtpassword"/><br>
            <input type="submit" value="login"/>
        </form>
    </body>
</html>
