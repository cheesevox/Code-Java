<%-- 
    Document   : LoginController
    Created on : Oct 9, 2020, 11:48:58 AM
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
        <jsp:useBean id="KhamBean" class="khamdd.models.TestBean" scope="session"/>
        <jsp:setProperty name="KhamBean" property="username" value="${param.username}"/>
        <jsp:setProperty name="KhamBean" property="password" value="${param.password}"/>
        
        <%
            String role = KhamBean.checkLogin();
            if(role.equals("admin")){
                response.sendRedirect("admin.jsp");
            } else{
                response.sendRedirect("error.jsp");
            }
        %>
    </body>
</html>
