<%-- 
    http://pastebin.com/hCPyvJRM
    Document   : deseoDia
    Created on : 2/12/2013, 05:20:56 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Deseo del día</title>
    </head>
    <body>
        <% if (Math.random() < 0.5) { %>
        <h1>Que tengas un <i>buen</i> día!</h1>
        <% } else { %>
        <h1>Que tengas un <i>mal</i> día!</h1>
        <% } %>
    </body>
</html>
