<%-- 
    Document   : index
    Created on : 21-10-2020, 10:40:58
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
        <h1>Login</h1>
        <form action="LoginController" method="POST">
            Username:<input type="texr" name="txtUsername"/><br/>
            Password: <input type="password" name="txtPassword"/><br/>
            <input type="submit" name="action" value="Login"/>
            
        </form>
    </body>
</html>
