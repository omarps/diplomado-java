<%-- 
    whats-new - http://pastebin.com/eW157bdx
    item1 - http://pastebin.com/3eY5PUeq
    item2 - http://pastebin.com/iAvAS0F5
    item3 - http://pastebin.com/av5cnJXX
    Document   : whats-new
    Created on : 2/12/2013, 06:48:43 PM
    Author     : Omar
--%>


<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Que hay de nuevo!?</title>
    </head>
    <body>
        <h1>Que hay de nuevo?!</h1>
        <p>
            Aqui estan las tres historias mas recientes:
        </p>
        <ol>
            <li><jsp:include page="/WEB-INF/includes/item1.jsp" /></li>
            <li><jsp:include page="/WEB-INF/includes/item2.jsp" /></li>
            <li><jsp:include page="/WEB-INF/includes/item3.jsp" /></li>
        </ol>
    </body>
</html>
