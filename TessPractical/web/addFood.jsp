<%-- 
    Document   : addFood.jsp
    Created on : Mar 11, 2021, 3:35:21 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Food</title>
    </head>
    <body>
        <form action="MainController" method="POST">
            ID <input type="text" name="foodID" required="true"/></br>
            Name <input type="text" name="name" required="true"/></br>
            Description <input type="text" name="description" required="true"/></br>
            Price <input type="text" name="price" required="true"/></br>
            Cooking Time <input type="text" name="cookingTime" required="true"/></br>
            Status <input type="text" name="status" required="true"/></br>
            Create Date <input type="time" name="createDate" required="true"/></br>
            <input type="submit" name="action" value="Add"/>
            <input type="submit" value="reset"/>
        </form>
    </body>
</html>
