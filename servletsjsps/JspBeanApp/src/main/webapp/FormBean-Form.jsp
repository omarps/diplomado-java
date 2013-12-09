<%-- 
    http://pastebin.com/yj7Jh6cz
    Document   : FormBean-Form
    Created on : 3/12/2013, 11:25:51 AM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Invoking FormBean.jsp</title>
    </head>
    <body>
        <h1>Invoking FormBean.jsp</h1>
        <form action="FormBean.jsp">
            Nombre: <input type="text" name="nombre" /><br/>
            Apellido: <input type="text" name="apellido" /><br/>
            Edad: <input type="text" name="edad" /><br/>
            <input type="submit" value="Enviar Persona" />
        </form>
    </body>
</html>
