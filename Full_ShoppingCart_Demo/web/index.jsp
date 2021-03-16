<%-- 
    Document   : index
    Created on : Oct 31, 2020, 7:58:43 AM
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
        <h1>Shopping Cart Demo</h1>
        <h3>
            Categories
        </h3>
        <c:forEach items="${applicationScope.listCate}" var="dto" varStatus="counter">
            <c:url value="MainController" var="LinkCate">
                <c:param name="action" value="linkCate"/>
                    <c:param name="id" value="getProduct"/>
            </c:url>
            <a href="${linkCate}">${dto.name}</a>
    </c:forEach>
    <c:if test="${not empty requestScope.listPro}">
                    <h2>List Product</h2>
                    <table border="1">
                        <thead>
                            <tr>
                                <th>No</th>
                                <th>Name</th>
                                <th>Price</th>
                                <th>Add to Cart</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${requestScope.listPro} " var="dto" varStatus="counter">
                            <tr>
                                <td>${counter.count}</td>
                                <td>${dto.name}</td>
                                <td>${dto.price}</td>
                                <td>
                                    <input type="hidden" name="txtProductID" value="${dto.productID}"/>
                                    <input type="submit" name="action" value="Add"/>
                                </td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>

    </c:if>
    </body>
</html>
