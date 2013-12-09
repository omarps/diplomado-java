<%-- 
    http://pastebin.com/XP1gE5AQ
    Document   : bgcolor
    Created on : 2/12/2013, 05:00:21 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Prueba de Color</title>
    </head>
    <%
        String bgcolor = request.getParameter("bgcolor");
        if ((bgcolor == null) || (bgcolor.trim().equals(""))) {
            bgcolor = "WHITE";
        }
    %>
    <body bgcolor="<%= bgcolor %>">
        <h1>Probando el fondo de color "<%= bgcolor %>"</h1>
        <br/>
        <form>
            Color: <input type="text" name="bgcolor" /><br/>
            <input type="submit"/>
        </form>
    </body>
</html>
