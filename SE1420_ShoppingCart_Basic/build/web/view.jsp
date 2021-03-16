<%-- 
    Document   : view
    Created on : 07-10-2020, 10:53:00
    Author     : cheeese vox
--%>

<%@page import="cheeesevox.dto.BookDTO"%>
<%@page import="cheeesevox.dto.CartObj"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart views</title>
    </head>
    <body>
        <%
            CartObj shoppingCart = (CartObj) session.getAttribute("cart");
        %>
        <h1>Welcome<%= shoppingCart.getCustomerName()%></h1></br>
        <form action="MainController" method="POST">
            <table border="1">
                <thead>
                    <tr>
                        <th>No</th>
                        <th>Book title</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        int count = 0;
                        for (BookDTO dto : shoppingCart.getCart().values()) {
                            count++;
                    %>
                    <tr>
                        <td><%=count%></td>
                        <td><%=dto.getName()%></td>
                        <td><%=dto.getQuantity()%>
                            <input type="text" name="txtQuantity" value="<%=dto.getId()%>"/>
                            <input type="hiden" name="txtId" value="<%=dto.getId()%>"/>

                        </td>
                        <td><%=dto.getPrice()%></td>
                        <td>
                            <input type="checkbok" name="chkRemove" value="<%=dto.getId()%>"
                        </td>
                    </tr>
                    <%
                        }
                    %>
                    <tr>
                        <td></td>
                        <td><a href="index.jsp">Continue</a></td>
                        <td></td>
                        <td>
                            Total: <%=shoppingCart.getTotal()%>
                        </td>
                        <td>
                            <input type="submit" name="action" value="Update"/>
                            <input type="submit" name="action" value="Remove"/>
                        </td>
                    </tr>
                </tbody>
            </table>
                        
            </form>
    </body>
</html>
