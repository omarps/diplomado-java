<%-- 
    Document   : BakedBeanDisplay-application
    Created on : 3/12/2013, 02:24:42 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Baked Bean Values: application-based Sharing</title>
    </head>
    <body>
        <h1>Baked Bean Values: application-based Sharing</h1>
        <jsp:useBean id="applicationBean" 
                     class="com.java.jspbeanapp.beans.BakedBean" 
                     scope="application" />
        <jsp:setProperty name="applicationBean" property="*" />
        <h2>
            Bean level: 
            <jsp:getProperty name="applicationBean" property="level" />
        </h2>
        <h2>
            Dish bean goes with:
            <jsp:getProperty name="applicationBean" property="goesWith" />
        </h2>
    </body>
</html>
