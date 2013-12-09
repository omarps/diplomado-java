<%-- 
    Document   : unminuto
    Created on : 27/11/2013, 07:34:44 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Expressions!</title>
    </head>
    <body>
        <h1>JSP Expressions!</h1>
        <ul>
            <li>Tiempo Actual: <%= new java.util.Date() %></li>
            <li>Servidor: <%= application.getServerInfo() %></li>
            <li>ID Session: <%= session.getId() %></li>
            <li>
                El parametro <code>testParam</code>: 
                <%= request.getParameter("testParam") %>
            </li>
        </ul>
    </body>
</html>
