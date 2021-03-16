<%-- 
    Document   : viewCart
    Created on : Feb 27, 2021, 2:07:37 PM
    Author     : Admin
--%>

<%@page import="trivnm.dtos.TeaDTO"%>
<%@page import="trivnm.dtos.CartDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Cart Information</title>
    </head>
    <body>
        <h1>Your selected tea</h1>
        <%  double total = 0;
            CartDTO cart = (CartDTO) session.getAttribute("CART");
            if (cart != null) {
        %>
        <table border="1">
            <thead>
                <tr>
                    <th>No</th>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Quantity</th>
                    <th>Price</th>
                    <th>Total</th>
                    <th>Delete</th>
                    <th>Update</th>
                </tr>
            </thead>
            <tbody>
                <%
                    int count = 1;
                    for (TeaDTO tea : cart.getCart().values()) {
                        total += tea.getPrice() * tea.getQuantity();
                %>
            <form action="MainController">
                <tr>
                    <td><%=count++%></td>
                    <td>
                        <input type="text" name="id" value="<%=tea.getId()%>" readonly="true"/>
                    </td>
                    <td><%=tea.getName()%></td>
                    <td>
                        <input type="number" name="quantity" value="<%=tea.getQuantity()%>" required="true"/>
                    </td>
                    <td><%=tea.getPrice()%></td>
                    <td><%=tea.getPrice() * tea.getQuantity()%></td>
                    <td>
                        <input type="submit" name="action" value="Delete">
                    </td>
                    <td>
                        <input type="submit" name="action" value="Update"/>
                    </td>
                </tr>
            </form>
            <%
                }
            %>
        </tbody>
    </table>

    <%
        }
    %>
    <h1>Total: <%=total%></h1>
    <a href="shopping.jsp">Add More</a>
</body>
</html>
