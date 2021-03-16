<%-- 
    Document   : error
    Created on : Oct 28, 2020, 11:05:19 AM
    Author     : cheeese vox
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ERROR page</h1>
        <h2>
            <font color="red"><font/>
            <s:property value="%{#request.ERROR}"/>
        </h2>
        <a href="login.jsp">Back to login</a>
    </body>
</html>
