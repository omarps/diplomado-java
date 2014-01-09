<%-- 
    Document   : login
    Created on : 8/01/2014, 07:36:30 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JS validation</title>
    </head>
    <body>
        <html:form action="/Login" 
                   onsubmit="validateLoginForm(this);">
            <html:javascript formName="LoginForm" />
            Username: 
            <html:text name="LoginForm" property="username" />
            <br/>
            Password:
            <html:password name="LoginForm" property="password" />
            <br/>
            <html:submit value="Login" />
        </html:form>
    </body>
</html>

