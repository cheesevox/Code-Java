<%-- 
    Document   : login
    Created on : Oct 28, 2020, 10:44:25 AM
    Author     : cheeese vox
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <s:head/>
    </head>
    <body>
        <h1>Login Page</h1>
        <s:form action="LoginAction" method="POST">
            <s:textfield name="username" label="Username"/>
            <s:password name="password" label="Password"/>
            <s:submit value="Login"/>
        </s:form>
        <a href="insert.jsp">Register</a>
        <a href="insertAnno.jsp">Register with Anotation</a>
</body>
</html>
