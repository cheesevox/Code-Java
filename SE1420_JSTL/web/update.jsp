<%-- 
    Document   : update
    Created on : 16-10-2020, 10:58:07
    Author     : cheeese vox
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Update Page</h1>
        <form action=" MainController" method="POST">
            Usename: <input type="text" name="txtUsername" readonly="true"
                            value="${requestScope.DTO.username}"/>
            <font color="red"></font><br/>
            Fullname:<<input type="text" name="txtFullname" 
                            value="${requestScope.DTO.fullname}"/>
            <font color="red">
            ${requestScope.INVALID.fullnameError}
            </font><br/>
        </form>
            <br/>
            Role:<select name="cboRole">
                <option <c:if test ="${requestScope.DTO.role eq 'admin'}">selected="true"</c:if>admin</option>
                <option <c:if test ="${requestScope.DTO.role eq 'user'}">selected="true"</c:if>user</option>
            </select>
            <br/>
            <input type="hidden" name="txtSearch1" value="${param.txtSearch}"/>
            <input type="submit" name="action" value="Update"/>
            
    </body>
</html>
