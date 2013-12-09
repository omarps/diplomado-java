<%-- 
    Document   : FormBean
    Created on : 3/12/2013, 11:27:30 AM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Leyendo PersonaBean</title>
    </head>
    <body>
        <h1>Leyendo PersonaBean</h1>
        <jsp:useBean id="persona" 
                     class="com.java.jspbeanapp.beans.PersonaBean" />
        <jsp:setProperty name="persona" property="*" />
        <ul>
            <li>
                Nombre: 
                <jsp:getProperty name="persona" 
                                 property="nombre"/>
            </li>
            <li>
                Apellido: 
                <jsp:getProperty name="persona" 
                                 property="apellido"/>
            </li>
            <li>
                Edad: 
                <jsp:getProperty name="persona" 
                                 property="edad"/>
            </li>
        </ul>
    </body>
</html>
