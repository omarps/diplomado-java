<%-- 
    Document   : ShowPrime
    Created on : 9/12/2013, 06:37:14 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Mostrar los numeros primos</title>
    </head>
    <body>
        <h1>Mostrar los numeros primos</h1>
        <p>
            Para
            <bean:write name="PrimeForm" property="length" />
            =
            <bean:write name="PrimeForm" property="prime" />
        </p>
    </body>
</html>
