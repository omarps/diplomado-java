<%-- 
    Document   : display
    Created on : 6/01/2014, 05:15:53 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Display</title>
    </head>
    <body>
        <h1>
            Hidden Value <bean:write name="HtmlHiddenForm" property="name" />
        </h1>
    </body>
</html>
