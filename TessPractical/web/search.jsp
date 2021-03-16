<%-- 
    Document   : search
    Created on : Mar 11, 2021, 3:42:33 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Food</title>
    </head>
    <body>
        <h1>Welcome to Food Management</h1>
        <form action="MainController">
            Search<input type="text" name="search" value="${param.search}"/>
            <input type="submit" name="action" value="Search"/>
        </form>
        <c:set var="list" value="${requestScope.LIST_FOOD}"/>
        <c:if test="${not empty list}">
            <table border="1">
                <thead>
                    <tr>
                        <th>No</th>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Description</th>
                        <th>Price</th>
                        <th>Cooking Time</th>
                        <th>Status</th>
                        <th>Create Date</th>
                        <th>Update</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="dto" items="${list}" varStatus="counter">
                    <form action ="MainController">
                        <tr>
                            <td>${counter.count}</td>
                            <td>${dto.foodID}</td>
                            <td>
                                <input type="text" name="name" value="${dto.name}"/>
                            </td>
                            <td>
                                <input type="text" name="description" value="${dto.description}"/> 
                            </td>
                            <td>
                                <input type="text" name="price" value="${dto.price}"/>
                            </td>
                            <td>
                                <input type="text" name="cookingTime" value="${dto.cookingTime}"/>
                            </td>
                            <td>
                                <input type="text" name="status" value="${dto.status}"/>
                            </td>
                            <td>
                                <input type="time" name="create" value="${dto.createDate}"/>
                            </td>
                            <td>
                                <input type="hidden" name="foodID" value="${dto.foodID}"/>
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
