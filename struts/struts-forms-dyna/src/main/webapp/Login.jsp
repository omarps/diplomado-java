<%-- 
    Document   : Login
    Created on : 10/12/2013, 07:02:21 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Login</title>
    </head>
    <body>
        <html:form action="/login">
            Username: 
            <html:text name="LoginForm" property="username" /><br/>
            Password: 
            <html:password name="LoginForm" property="password"/><br/>
            <html:submit value="Login" />
        </html:form>
    </body>
</html>
 