<%-- 
    Document   : index
    Created on : Sep 28, 2020, 10:36:30 AM
    Author     : KHAM
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
        <form action="/SE1420_MVC2_JDBC2/MainController" method="POST">
            Username: <input type='text' name = 'txtUsername'/><br/>
            Password: <input type="password" name="txtPassword" value="" /><br/>
            <input type='submit' value='Login' name= 'action' />
        </form>
        <a href="/SE1420_MVC2_JDBC2/Scriptlet/register.jsp">Create New Account</a>
    </body>
</html>
