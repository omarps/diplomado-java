<%-- 
    Document   : SaleEntry
    Created on : 3/12/2013, 11:11:25 AM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Using jsp:setProperty</title>
    </head>
    <body>
        <h1>Using jsp:setProperty</h1>
        <jsp:useBean id="entry" 
                     class="com.java.jspbeanapp.beans.SaleEntry" />
        <jsp:setProperty name="entry" property="*" />
        <br/>
        <table border="1">
            <tr>
                <th>Item ID</th>
                <th>Unit Price</th>
                <th>Number Ordered</th>
                <th>Total Price</th>
            </tr>
            <tr align="right">
                <td><jsp:getProperty name="entry" property="itemID" /></td>
                <td>$<jsp:getProperty name="entry" property="itemCost" /></td>
                <td><jsp:getProperty name="entry" property="numItems" /></td>
                <td>$<jsp:getProperty name="entry" property="totalCost" /></td>
            </tr>
        </table>
    </body>
</html>
