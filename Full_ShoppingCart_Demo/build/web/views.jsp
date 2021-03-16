<%-- 
    Document   : views
    Created on : Oct 31, 2020, 9:36:34 AM
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
        <h1>${sessionScope.shoppingCart.cutomerName}'s cart</h1>
        <form name="MainController" method="POST">
            <table>
                <thead>
                    <tr>
                        <th>No</th>
                        <th>Name</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${sessionScope.shoppingCart.shoppingCart.values()}"var="dto" varStatus="">

                        <tr>
                            <td>${counter.count}</td>
                            <td>${dto.name}</td>
                            <td>${dto.price}</td>
                            <td><input type="text" name="txtQuantity" value="${dto.quantity}"/>
                                <input type="hidden" name="txtProductID" value="${dto.productID}"/>
                            </td>
                            <td><input type="submit" name="chkRemove" value="${dto.productID}"/></td>
                        </tr>
                    </c:forEach>
                    <tr>
                        <td></td>
                        <td><a href="index.jsp">Continue shopping</a>
                        </td>
                        <td>${sessionScope.shoppingCart.total}</td>
                        <td>
                            <input type="submit" name="action" value="Update"/>
                        </td>
                        <td><input type="submit" name="action" value="Remove"</td>
                    </tr>

                </tbody>
            </table>
            <input type="submit" value="Order" name="action"/>
        </form>
    </body>
</html>
