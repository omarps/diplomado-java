<%-- 
    Document   : numerosAzar
    Created on : 2/12/2013, 05:37:05 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<%!
// http://pastebin.com/Pk7nLnnm
public static int randomInt(int range) {
    return (1 + ((int) (Math.random() * range)));
}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Números al Azar</title>
    </head>
    <body>
        <h1>Números al Azar</h1>
        <ul>
            <li><%= randomInt(50) %></li>
            <li><%= randomInt(50) %></li>
            <li><%= randomInt(50) %></li>
            <li><%= randomInt(50) %></li>
            <li><%= randomInt(50) %></li>
            <li><%= randomInt(50) %></li>
        </ul>
    </body>
</html>
