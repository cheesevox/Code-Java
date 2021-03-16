<%-- 
    Document   : index.jsp
    Created on : 06-10-2020, 16:19:58
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
        <h1>Hello World!</h1>
        <form action="/TestNewAgain/MainController" method="POST">
            username: <input type="text" name="txtuername"/><br/>
            password:<input type="password" name="txtpassword"/><br/>
            <input type="submit" value="Login" name="action"/>
        </form>
        <a href="/TestNewAgain/Scriplet/register.jsp">Create New Account<a/>
    </body>
</html>
