<%-- 
    Document   : LoginForm
    Created on : 10/12/2013, 04:58:45 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Login Form</title>
    </head>
    <body>
        <h1>Login Form</h1>
        <html:errors />
        <html:form>
        <table>
            <tr>
                <td>User ID*</td>
                <td>
                    <html:text property="username" />
                </td>
            </tr>
            <tr>
                <td>Password*</td>
                <td>
                    <html:password property="password" />
                </td>
            </tr>
            <tr>
                <td><html:submit /></td>
                <td><html:cancel /></td>
            </tr>
        </table>
        </html:form>
    </body>
</html>
