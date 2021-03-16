<%-- 
    Document   : admin.jsp
    Created on : Oct 9, 2020, 11:53:00 AM
    Author     : KHAM
--%>

<%@page import="khamdd.models.TestBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="KhamBean" class="khamdd.models.TestBean" scope="session"/>
        <h1>Stand action - welcome,<jsp:getProperty name="KhamBean" property="username"/>></h1>
                <h1>Scripting - Welcome,<%=KhamBean.getUsername()%></h1>
                <h1>EL with Scope - welcome, ${pageScope.KhamBean.username}</h1>
                <h1>EL without Scope - welcome, ${KhamBean.username}</h1>
            </body>
        </html>
