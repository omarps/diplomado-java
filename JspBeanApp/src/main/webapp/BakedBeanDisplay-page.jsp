<%-- 
    Document   : BakedBeanDisplay-page
    Created on : 3/12/2013, 02:13:27 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Baked Bean Values: page-based Sharing</title>
    </head>
    <body>
        <h1>Baked Bean Values: page-based Sharing</h1>
        <jsp:useBean id="pageBean" 
                     class="com.java.jspbeanapp.beans.BakedBean" />
        <jsp:setProperty name="pageBean" property="*" />
        <h2>
            Bean level:
            <jsp:getProperty name="pageBean" property="level" />
        </h2>
        <h2>
            Dish bean goes with:
            <jsp:getProperty name="pageBean" property="goesWith" />
        </h2>
    </body>
</html>
