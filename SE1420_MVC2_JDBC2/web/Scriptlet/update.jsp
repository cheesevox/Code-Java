<%-- 
    Document   : update
    Created on : 02-10-2020, 10:58:23
    Author     : cheeese vox
--%>

<%@page import="khamdd.registration.RegistrationDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            RegistrationDTO dto = (RegistrationDTO)request.getAttribute("DTO");
        %>
        <h1>Update Account!</h1>
        <form action="MainController" method="POST">
            Username = <input type="text" name =" txtUsername" value="<%=dto.getUsername()%>" readonly="true"/><br/>
            Fullname = <input type="text" name =" txtFullname" value="<%=dto.getFullname()%>"/><br/>
            Role: <select nmae ="cbRole">
                <option <%if(dto.getRole().equals("admin")) {%>selected="true" <% } %>>admin</option> 
                <option <%if(dto.getRole().equals("user")) {%>selected="true" <% } %>>user</option>
            </select>
            <br/>
            <input type="hiden" name ='txtSearch' value ="<%request,getParameter("txtSearch")%>"/>
            <input type ="submit" nmae ="action" value="Update"/>
            
        </form>
    </body>
</html>
