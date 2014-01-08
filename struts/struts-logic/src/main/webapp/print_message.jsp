<%-- 
    Document   : print_message
    Created on : 7/01/2014, 04:26:45 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Print Message</title>
    </head>
    <body>
        <h1>Struts logic:iterate example</h1>

        <h2>Lista de Mensajes</h2>
        <logic:iterate name="messageList" id="message">
            <p>
                Lista de Mensajes <bean:write name="message" />
            </p>
        </logic:iterate>

        <h2>Lista de Usuarios</h2>
        <logic:iterate name="userList" id="user">
            <p>
                Lista de Usuarios 
                <bean:write name="user" property="username" />, 
                <bean:write name="user" property="url" />
            </p>
        </logic:iterate>
    </body>
</html>
