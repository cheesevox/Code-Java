<%-- 
    Document   : error
    Created on : 12-10-2020, 11:43:13
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
        <h1>ERROR Page</h1>
        <h2>
            <font color="red">
            ${requestScope.ERROR}
            </font>
        </h2>
            <a href="index.jsp">Back to Login page</a>
    </body>
</html>
