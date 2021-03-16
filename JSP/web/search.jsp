<%-- 
    Document   : search
    Created on : Jan 21, 2021, 4:30:36 AM
    Author     : Admin
--%>

<%@page import="trivnm.dtos.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search</title>
    </head>
    <body>
        <%
            UserDTO user = (UserDTO) session.getAttribute("LOGIN_USER");
            if(user==null){
                response.sendRedirect("login.html");
                return;
            }
        %>
        <%%>
        <h1>Welcome:<%= user.getFullname() %></h1>
        <form action="MainController">
            <input type="submit" name="action" value="Loout"/>
        </form>
    </body>
</html>
