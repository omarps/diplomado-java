<%-- 
    Document   : welcome
    Created on : 16/01/2014, 06:44:35 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Welcome: Sring Security w/Struts</title>
    </head>
    <body>
        <h3>Welcome Page Spring Security w/Struts</h3>
        
        <%
        String message = (String) request.getAttribute("message");
        %>
        <br/>
        <div style="text-align: center;">
            Welcome <%= message %>
        </div>
        
        <br/>
        <br/>
        <div style="text-align: center;">
            <a href="<c:url value="/j_spring_security_logout" />">
                Logout
            </a>
        </div>
    </body>
</html>
