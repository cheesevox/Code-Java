<%-- 
    Document   : admin
    Created on : 14-10-2020, 11:18:20
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
        <h1>Welcome,${sessionScope.USERNAME}</h1>
        <h2> Search User</h2>
        <form name ="MainController" method ="POST">
            Fullname <input type="submit" name="action" value="Search"/>
        </form>
        <c:if test="${requestScope.INFO != null}">
            <h3>Search Result</h3>
            <c:if test="${not empty requestScope.INFO}" var="checkList">
                <table border="1">
                    <thead>
                        <tr>
                            <th>No</th>
                            <th>Username</th>
                            <th>Fullname</th>
                            <th>Role</th>
                            <th>Delete</th>
                            <th>Exit</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="dto" items="${requestScope.INFO}" varStatus="counter">

                            <tr>
                                <td>${counter.count}</td>
                                <td>${dto.username}</td>
                                <td>${dto.fullname}</td>
                                <td>${dto.role}</td>
                                <td>
                                    <c:url value="MainController" var="DeleteLink">
                                        <c:param name="action" value="Delete"/>
                                        <c:param name="id" value="${dto.username}"/>
                                        <c:param name="txtSearch" value="${param.txtSearch}"/>
                                    </c:url>
                                    <a href="${DeleteLink}">Delete</a>
                                </td>
                                <td>
                                    <inupt type="hidden" name="id" value="${dto.username}"/>
                                    <inupt type="hidden" name="txtSearch" value="${param.txtSearch}"/>
                                    <input type="submit" value="Edit" name="action"/>
                                </td>
                            </tr>
                        </c:forEach>

                    </tbody>
                </table>

            </c:if>
            <c:if test="${!checkList}">
                No record found
            </c:if>
        </c:if>
    </body>
</html>
