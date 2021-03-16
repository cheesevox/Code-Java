<%-- 
    Document   : error
    Created on : 06-10-2020, 16:31:28
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
        <%
        String error = (String) request.getAttribute("ERROR");
        %>
        <h2>
            <font color='red'><%=error%><font/> 
        </h2>
        <a href="/TestNewAgain/homepage.jsp">Back to home page</a>
    </body>
</html>
