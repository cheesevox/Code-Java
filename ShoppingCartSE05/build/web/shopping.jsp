<%-- 
    Document   : shopping
    Created on : Feb 25, 2021, 11:27:31 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cheese Milk Coffee</title>
    </head>
    <body>
        <h1>Welcome to Cheese Milk Coffee</h1>
        <form action="MainController">
            Choose your coffee
            <select name="cmbTea">
                <option value="C001-HighLand Coffee-60">HighLand Coffee Tea</option>
                <option value="C002-StartBuck Coffee-50">StartBuck Coffee Tea</option>
                <option value="C001-PhucLong Coffee-40">PhucLong Coffee Tea</option>
            </select>
            <input type="submit" name="action" value="Add">
            <input type="submit" name="action" value="View Cart"
        </form>
        <%
        String message = (String) request.getAttribute("MESSAGE");
        if(message != null){
            %>
            <h1>
                <%=message%>
            </h1>
            <%
        }
            %>
    </body>
</html>
