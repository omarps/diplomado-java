<%-- 
    Document   : display_select
    Created on : 6/01/2014, 06:40:57 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Display select</title>
    </head>
    <body>
        <h1>
            El año seleccionado es: 
            <bean:write name="HtmlSelectOptionForm" property="year" />
        </h1>
    </body>
</html>
