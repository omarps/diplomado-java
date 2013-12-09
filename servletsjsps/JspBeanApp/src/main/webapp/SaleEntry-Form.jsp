<%-- 
    http://pastebin.com/KzaGydXV
    Document   : SaleEntry-Form
    Created on : 3/12/2013, 11:04:51 AM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Invoking SaleEntry.jsp</title>
    </head>
    <body>
        <h1>Invoking SaleEntry.jsp</h1>
        <form action="SaleEntry.jsp">
            Item ID: <input type="text" name="itemID" value="a1234" /><br/>
            Number of Items: <input type="text" name="numItems" /><br/>
            Discount Code: <input type="text" name="discountCode" /><br/>
            <input type="submit" value="Show Price" />
        </form>
    </body>
</html>
