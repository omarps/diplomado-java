<%-- 
    Document   : Success
    Created on : 10/12/2013, 07:02:35 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Success</title>
    </head>
    <body>
        <h1>
            Login Success. Welcome 
            <bean:write name="LoginForm" property="username" />
        </h1>
    </body>
</html>
