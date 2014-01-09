<%-- 
    Document   : register_user
    Created on : 8/01/2014, 04:59:32 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Struts Validator</title>
    </head>
    <body>
        <h2>Struts Validator Example</h2>

        <h3>Registration Form</h3>
        <br/><br/>

        <div style="color:red">
            <html:errors />
        </div>
        <br/>
        
        <html:form action="/Register">
            <bean:message key="label.user.name" /> : 
            <html:text property="username" size="20" />
            <br/>
            <br/>
            <html:submit>
                <bean:message key="label.user.button.submit" />
            </html:submit>
        </html:form>
    </body>
</html>
