<%-- 
    Document   : index
    Created on : 07-10-2020, 10:32:01
    Author     : cheeese vox
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Book Shop</h1>
        <h2>Please choose your book</h2>
        <form action="MainController" method="POST">
        Book title: <select name ="List book">
            <option value="B01-Java Desktop-100">PRJ311</option>
            <option value="B02-Java Web-200">PRJ321</option>
            <option value="B03-Android-300">PRM391</option>
            <option value="B04-XML-400">PRX301</option>
        </select>
        <input type="submit" name ="action" value="Add to cart"/>
        </form>
        <a href="view.jsp">view your cart</a>
    </body>
</html>
