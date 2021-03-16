<%-- 
    Document   : index
    Created on : Oct 29, 2020, 2:02:07 PM
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
        <form name="MainController" method="POST">
            Username:<input type="text" name="txtUsername"><br/>
            Password:<input type="password" name="txtPassword"><br/>
            <input type="submit" name="action" value="Login"><br/>
        </form>
        <a href="insert.jsp">Create a account</a>
    </body>
</html>
