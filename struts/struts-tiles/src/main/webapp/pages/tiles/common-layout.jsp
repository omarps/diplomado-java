<%-- 
    Document   : common-layout
    Created on : 9/01/2014, 05:03:15 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title></title>
    </head>
    <body>
        <tiles:insert attribute="header" />
        
        <tiles:insert attribute="body" />
        
        <tiles:insert attribute="footer" />
    </body>
</html>
