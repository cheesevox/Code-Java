<%-- 
    Document   : index
    Created on : 24-10-2020, 12:26:45
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
        <h1>Login Form</h1>
        <form name=" " action="MainController" method="POST">
            username:<input name="txtUsername" type="text"><br/>
            password:<input type="password" name="txtPassword"><br/>
            <input type="submit" name="action" value="Login"><br/>
            
        </form>
    </body>
</html>
