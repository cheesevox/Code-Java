<%-- 
    Document   : error
    Created on : 20-10-2020, 20:15:01
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
        <h2><font color="red">
            ${requestScope.ERROR}
            </font>
            <a href="index.jsp">Back to home login</a>
        </h2>
    </body>
</html>
