<%-- 
    Document   : error
    Created on : 24-10-2020, 12:38:37
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
        <h1>Error page</h1>
        <h2>
            <font color ="red" >${requestScope.ERROR}
            </font>
        </h2>
            <a href="index.jsp">Back to login page</a>
    </body>
</html>
