<%-- 
    Document   : index
    Created on : 12-10-2020, 11:34:54
    Author     : cheeese vox
--%>

<%@page import="cheeesevox.dto.RegistractionErrorObject"%>
<%@page import="cheeesevox.daos.RegistractionDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Login Page</h2>
        <%/*
            String username = "";
            String password = "";
            RegistractionErrorObject errorObj =(RegistractionErrorObject) request.getAttribute("");
            if(errorObj !=null){
                username= errorObj.getUsernameError();
                password= errorObj.getUsernameError();
                if(username==null){
                    username ="";
                }
                if(password==null){
                    password = "";
                }
            }
            String txtUsername = request.getParameter("txtUsername");
            if(txtUsername = null){
                txtUsername="";
            }
    }
             */
        %>
        <form action="MainController" method="POST">
            <%--
                      Username: <input type="text" name="txtUsername"/>
                      <font color="red">
                          <%=username%>
                      </font>
                          <br/>
            --%>
            Username: <input type="text" name="txtUsername" value="${param.txtUsername}"/>
            <font color="red">
            ${requestScope.INVALID.usernameError}
            </font><br/>
            Password: <input type="password" name="txtPassword"/>
            <font color="red">
            ${requestScope.INVALID.passwordError}
            </font>
            <br/>
            <input type="submit" name="action" value="Login"/>
        </form>
            <a href="insert.jsp"></a>
    </body>
</html>
