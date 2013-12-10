<%-- 
    Document   : ShowName
    Created on : 9/12/2013, 04:58:22 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Mostrar el nombre</title>
    </head>
    <body>
        <h1>Mostrar el nombre</h1>
        <p>
            <bean:write name="NameForm" property="firstName" /><br/>
            <bean:write name="NameForm" property="lastName" />
        </p>
    </body>
</html>
