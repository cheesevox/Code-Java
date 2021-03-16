<%-- 
    Document   : search
    Created on : Jan 29, 2021, 10:45:43 PM
    Author     : Admin
--%>

<%@page import="trivnm.dtos.RegistrationDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        RegistrationDTO user = (RegistrationDTO) session.getAttribute("LOGIN_USER");
        if(user==null || user.getRole().equals("admin")){
            response.sendRedirect("home.jsp");
            return;
        }
        %>
        <h1>Welcome <%=user.getFullname()%></h1>
    </body>
</html>
