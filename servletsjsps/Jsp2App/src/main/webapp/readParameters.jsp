<%-- 
    http://pastebin.com/q863mFpu
    Document   : readParameters
    Created on : 2/12/2013, 04:32:23 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Leyendo los parametros</title>
    </head>
    <body>
        <h1>Los parametros son:</h1>
        <ul>
            <li>Apellidos: <%= request.getParameter("apellidos") %> </li>
            <li>Nombre: <%= request.getParameter("nombre") %></li>
        </ul>
        El método es: <b><%= request.getMethod() %></b>
    </body>
</html>
