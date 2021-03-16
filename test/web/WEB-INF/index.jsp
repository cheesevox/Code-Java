<%-- 
    Document   : index
    Created on : 06-10-2020, 10:12:53
    Author     : cheeese vox
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            Date date = new Date();
        %>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Today</h1>
        <p>Today's date is<%= date %></p>
    </body>
</html>
