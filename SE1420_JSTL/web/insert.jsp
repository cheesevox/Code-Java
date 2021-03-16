<%-- 
    Document   : insert
    Created on : 16-10-2020, 11:33:21
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
        <h1>Creat new Account</h1>
        <form action="MainController" method="POST">
            Username: <input type="text" name="txtUsername"/>
            <font color="red">
            ${requestScope.INVALID.usernameError}
            </font>
            <br/>
            Fullname: <input type="text" name="txtFullname"/>
            <font color="red">
            ${requestScope.INVALID.fullnameError}
            </font>
            <br/>
            Role <select name="cboRole">
                <option>admin</option>
                <option>user</option>
            </select><br/>
            <input type="submit" name="action" value="Creat"/>
        </form>
    </body>
</html>
