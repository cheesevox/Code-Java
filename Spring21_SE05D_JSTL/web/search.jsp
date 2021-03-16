<%-- 
    Document   : search
    Created on : Jan 21, 2021, 4:31:29 PM
    Author     : hiep
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="sample.dtos.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search </title>
    </head>
    <body>
        <h1>Welcome:${sessionScope.LOGIN_USER.fullName} </h1>

        <c:url var="logout" value="MainController">
            <c:param name="action" value="Logout" ></c:param>
        </c:url>
        <a href="${logout}">Logout</a>      
        <form action="MainController">
            Search <input type="text" name="search" value="${param.search}"/>
            <input type="submit" name="action" value="Search"/>
        </form>
        <c:set var="list" value="${requestScope.LIST_USER}"/>
        <c:if test="${not empty list}">
            <table border="1">
                <thead>
                    <tr>
                        <th>No</th>
                        <th>User ID</th>
                        <th>Full Name</th>
                        <th>Role ID</th>
                        <th>Password</th>
                        <th>Delete</th>
                        <th>Update</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="dto" items="${list}" varStatus="counter">
                    <form action="MainController">
                        <tr>
                            <td>${counter.count}</td>
                            <td>${dto.userID}</td>
                            <td>
                                <input type="text" name="fullName" value="${dto.fullName}"/>
                            </td>
                            <td>
                                <input type="text" name="roleID" value="${dto.roleID}"/>
                            </td>
                            <td>${dto.password}</td>
                            <td>
                                <c:url var="delete" value="MainController">
                                    <c:param name="action" value="Delete"></c:param>
                                    <c:param name="search" value="${param.search}"></c:param>
                                    <c:param name="userID" value="${dto.userID}"></c:param>
                                </c:url>
                                <a href="${delete}">Delete</a>
                            </td>
                            <td>
                                <input type="hidden" name="userID" value="${dto.userID}"/>
                                <input type="hidden" name="search" value="${param.search}"/>

                                <input type="submit" name="action" value="Update"/>
                            </td>
                        </tr>
                    </form>

                </c:forEach>
            </tbody>
        </table>
    </c:if>

</body>
</html>
