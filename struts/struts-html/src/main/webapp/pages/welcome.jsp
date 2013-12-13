<%-- 
    Document   : welcome
    Created on : 12/12/2013, 05:13:34 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
    </head>
    <body>
        <h1>
            Welcome <bean:write name="UserForm" property="username" />
        </h1>
    </body>
</html>
