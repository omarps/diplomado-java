<%-- 
    Document   : params
    Created on : 27/11/2013, 07:48:55 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Parametros!</title>
    </head>
    <body>
        <h1>Leyendo Tres Request Parameters</h1>
        <ul>
            <li>
                <b>param1</b>:
                <%= request.getParameter("param1") %>
            </li>
            <li>
                <b>param2</b>:
                <%= request.getParameter("param2") %>
            </li>
            <li>
                <b>param3</b>:
                <%= request.getParameter("param3") %>
            </li>
        </ul>
    </body>
</html>
