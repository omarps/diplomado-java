<%-- 
    Document   : BakedBeanDisplay-session
    Created on : 3/12/2013, 02:21:52 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Baked Bean Values: session-based Sharing</title>
    </head>
    <body>
        <h1>Baked Bean Values: session-based Sharing</h1>
        <jsp:useBean id="sessionBean" 
                     class="com.java.jspbeanapp.beans.BakedBean"
                     scope="session" />
        <jsp:setProperty name="sessionBean" property="*" />
        <h2>
            Bean level: 
            <jsp:getProperty name="sessionBean" property="level" />
        </h2>
        <h2>
            Dish bean goes with:
            <jsp:getProperty name="sessionBean" property="goesWith" />
        </h2>
    </body>
</html>
