<%-- 
    Document   : BakedBeanDisplay-request
    Created on : 3/12/2013, 02:16:11 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Baked Bean Values: request-based Sharing</title>
    </head>
    <body>
        <h1>Baked Bean Values: request-based Sharing</h1>
        <jsp:useBean id="requestBean" 
                     class="com.java.jspbeanapp.beans.BakedBean"
                     scope="request"/>
        <jsp:setProperty name="requestBean" property="*" />
        <h2>
            Bean level: 
            <jsp:getProperty name="requestBean" property="level" />
        </h2>
        <h2>
            Dish bean goes with:
            <jsp:getProperty name="requestBean" property="goesWith" />
        </h2>
    </body>
</html>
