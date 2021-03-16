<%-- 
    Document   : insertAnno
    Created on : Oct 30, 2020, 11:30:31 AM
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
    <h1>Create a account</h1>
        <s:form action="insert" method="POST">
            <s:textfield name="username" label="Username"/>
            <s:password name="password" label="Password"/>
            <s:password name="confirm" label="Confirm"/>
            <s:textfield name="email" label="Email"/>
            <s:textfield name="phoneNo" label="Phone: {012-12345678"/>
            <s:submit value="Insert"/>
            
        </s:form>
        <s:if test="%{exception.message.indexOf('duplicate')>-1}">
            <s:property value="username"/> is existed!
        </s:if>
    </body>
</html>
