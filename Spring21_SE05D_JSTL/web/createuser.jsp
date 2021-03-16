<%-- 
    Document   : createuser
    Created on : Mar 2, 2021, 4:17:08 PM
    Author     : Quoc Huy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Page</title>
    </head>
    <body>
        <form action="MainController" method="POST">

            User ID <input type="text" name="userID" required="true"/></br>
            <h2>${requestScope.ERROR.userIDError}</h2>            
            Full Name <input type="text" name="fullName" required="true"/></br>
            <h2>${requestScope.ERROR.fullNameError}</h2>
            Role ID <input type="text" name="roleID" required="true"/></br>
            <h2>${requestScope.ERROR.roleIDError}</h2>
            Password <input type="password" name="password" required="true"/></br>
            <h2>${requestScope.ERROR.password}</h2>
            Confirm <input type="password" name="confirm" required="true"/></br>
            <h2>${requestScope.ERROR.confirm}</h2>        
            <input type="submit" name="action" value="Create">
            <input type="reset" value="Reset">
        </form>


    </body>
</html>
