<%-- 
    http://pastebin.com/LSDBnmwJ
    Document   : sample
    Created on : 2/12/2013, 07:16:04 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Ejemplo (Sintaxis Clasica)</title>
    </head>
    <body>
    <center>
        <h1>Ejemplo (Sintaxis Clasica)</h1>
        <h2>Num1: <%= Math.random() * 10 %></h2>
        <% double num2 = Math.random() * 100; %>
        <h2>Num2: <%= num2 %></h2>
        <%! private double num3 = Math.random() * 1000; %>
        <h2>Num3: <%= num3 %></h2>
    </center>
    </body>
</html>
