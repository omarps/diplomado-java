<%-- 
    Document   : RandomNumber
    Created on : 5/12/2013, 07:19:41 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Random Number</title>
    </head>
    <body>
        <h1>
            Random Number: 
            <bean:write name="NumberForm" property="number" />
        </h1>
    </body>
</html>
