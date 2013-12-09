<%-- 
    Document   : HolaMundo
    Created on : 5/12/2013, 04:44:31 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Hola Mundo</title>
    </head>
    <body>
        <h1>
            <bean:write name="holaMundoForm" property="message" />
        </h1>
    </body>
</html>
