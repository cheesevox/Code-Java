<%-- 
    Document   : Regitter
    Created on : 30-09-2020, 11:09:38
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
        <h1>Create new account</h1>
        <form action="/SE1420_MVC2_JDBC2/MainController" method="POST">
            Username : <input type="text" name="txtUsername" value="" />
            Fullname : <input type="text" name="txtFullname" value="" />
            Role <select name="cbRole">
                <option>admin</option>
                <option>user</option>
            </select><br/>
            <input type="submit" name="action" value="Register" />
        </form>
    </body>
</html>
