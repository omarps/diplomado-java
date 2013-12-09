<%-- 
    http://pastebin.com/MGEymLSB
    Document   : contadorVisitas
    Created on : 2/12/2013, 05:50:44 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Declaraciones JSP</title>
    </head>
    <body>
        <h1>Declaraciones JSP</h1>
        <%! private int accessCount = 0; %>
        <h2>Accesos a esta pagina desde que se reinicio el server
        <%= ++accessCount %></h2>
    </body>
</html>
