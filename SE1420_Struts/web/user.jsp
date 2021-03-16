<%-- 
    Document   : user
    Created on : Oct 28, 2020, 11:07:23 AM
    Author     : KHAM
--%>
<%@taglib prefix="s" uri = "/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello, <s:property value="%{#session.USER}"/> !</h1>
        <h2>Search user</h2>
        <s:form action = "SearchAction" method = "POST">
            <s:textfield name = "searchValue" label = "Fullname"/>
            <s:submit value = "Search"/>
        </s:form>

        <s:if test="%{listUser != null}">
            <table border="1">
                <thead>
                    <tr>
                        <th>No</th>
                        <th>Username</th>
                        <th>Fullname</th>
                        <th>Role</th>
                        <th>Link</th>
                        <th>Button</th>
                    </tr>
                </thead>
                <tbody>
                    <s:iterator value = "listUser" status="counter">
                        <tr>
                            <td><s:property value="%{#counter.count}"/></td>
                            <td><s:property value="username"/></td>
                            <td><s:property value="password"/></td>
                            <td><s:property value="role"/></td>
                            <td>
                                <s:url action = "DeleteAction" id = "DeleteLink">
                                    <s:param name="lastSearchValue" value="searchValue"/>
                                    <s:param name="id" value="username"/>
                                </s:url>
                                <s:a href="%{DeleteLink}">Delete</s:a>
                                </td>
                                <td>
                                <s:form action = "DeleteAction" method="POST">
                                    <s:hidden name="id" value="username"/>
                                    <s:hidden name="lastSearchValue" value="searchValue"/>
                                    <s:submit value="Delete"/>
                                </s:form>>
                                <s:a href="%{DeleteLink}">Delete</s:a>
                                </td>
                            </tr>
                    </s:iterator>
                </tbody>
            </table>

        </s:if>
    </body>
</html>
