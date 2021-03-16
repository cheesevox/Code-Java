<%-- 
    Document   : index
    Created on : 20-10-2020, 16:51:37
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
        <h1>Hi there!
            <form action="MainController" method="POST">
                username : <input type="text" name="txtUsername" value="${param.txtUsername}"><br/>
                <font color="red">
                
                password : <input type="password" namr ="txtPassword"><br/>
                <font color="red">
                <input type="submit" name="Login" value="action">
            </form>
    </body>
</html>
