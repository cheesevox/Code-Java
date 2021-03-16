<%-- 
    Document   : Error
    Created on : Sep 28, 2020, 10:51:30 AM
    Author     : KHAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Error Page</h1>
        <%
            String error = (String) request.getAttribute("ERROR");
        %>
        <h2>
            <font color='red'><%= error%></font>
             
        </h2>
        <a href="Scriptlet/index.jsp">Back to Home Page</a>
    </body>
</html>
