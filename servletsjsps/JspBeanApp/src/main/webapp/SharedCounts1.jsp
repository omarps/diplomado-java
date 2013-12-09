<%-- 
    Document   : SharedCounts1
    Created on : 4/12/2013, 04:25:13 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Shared Access Counts: Page 1</title>
    </head>
    <body>
        <h1>Shared Access Counts: Page 1</h1>
        <jsp:useBean id="counter"
                     class="com.java.jspbeanapp.beans.AccessCountBean"
                     scope="application">
            <jsp:setProperty name="counter"
                             property="firstPage"
                             value="SharedCounts1.jsp" />
        </jsp:useBean>
        <p>
            De SharedCounts1.jsp (esta pagina),
            <a href="SharedCounts2.jsp">SharedCounts2.jsp</a> y 
            <a href="SharedCounts3.jsp">SharedCounts3.jsp</a>,
            <jsp:getProperty name="counter" property="firstPage" />
            fue accesada primero.
        </p>
        Colectivamente, las tres paginas han sido accesadas 
        <jsp:getProperty name="counter" property="accessCount" />
        veces.
        <jsp:setProperty name="counter" 
                         property="accessCountIncrement"
                         value="1"/>
    </body>
</html>
