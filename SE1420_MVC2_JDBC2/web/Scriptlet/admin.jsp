<%-- 
    Document   : admin
    Created on : Sep 28, 2020, 11:12:39 AM
    Author     : KHAM
--%>

<%@page import="java.util.List"%>
<%@page import="khamdd.registration.RegistrationDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Admin</h1>
        <form action="/SE1420_MVC2_JDBC2/searchController" method="POST">
            Name: <input type='text' name ='txtSearch'/><br/>
            <input type ='submit' name = 'action' value='Search'/>
        </form>
        <%
            List<RegistrationDTO> listAccount = (List<RegistrationDTO>) request.getAttribute("listAccount");
            if (listAccount != null) {
                if (listAccount.size() == 0) {


        %>
        <font color ='red'>No record found</font>
        <%      } else {

        %>
        <table border="1">
            <thead>
                <tr>
                    <th>No</th>
                    <th>Username</th>
                    <th>Fullname</th>
                    <th>Role</th>
                    <th>Delete</th>
                    <th>Edit</th>
                </tr>
            </thead>
            <tbody>
                <%                    int count = 0;
                    for (RegistrationDTO dto : listAccount) {
                        count++;
                %>
            <form action="MainController" method="POST">
                <tr>
                    <td><%=count%></td>
                    <td><%= dto.getUsername()%></td>
                    <td><%= dto.getFullname()%></td>
                    <td><%= dto.getRole()%></td>
                <a href="MainCtroller?action=Delete&id=<%=dto.getUsername()%>&txtSearch=<%=request.getParameter("txtSearch")%>">Delete</a>
                <td>
                    <input type="hiden" name ="id" value="<%=dto.getUsername%>"/>;
                    <input type="hiden" name ="txtSearch" value="<%= request.getParameter("txtSearch")%>"/>;
                    <input type="submit" name ="action" value=""/>
                </td>
                </tr>
            </form>
            <%%>
        </tbody>
    </table>

    <%
                }
            }
        
    %>
</body>
</html>
