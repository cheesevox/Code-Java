<%-- 
    Document   : index
    Created on : 20-10-2020, 14:12:19
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
        <h1>Login page</h1>
        <form action ="/LT_Login/MainController" method="POST">
            username: <input type="text" name="txtUsername"/><br/>
            password:<input type="password" name="txtPassword"/><br/>
            <input type="submit" value="Login" name="action"/>
        </form>
        <a href="/LT_Login/Scriptletregister.jsp">Creat a new account</a>
    </body>
</html>
