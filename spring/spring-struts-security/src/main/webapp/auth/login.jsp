<%-- 
    Document   : login
    Created on : 20/01/2014, 04:54:26 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Login Page</title>
    </head>
    <body>
        <form name="f" 
              action="<c:url value='/j_spring_security_check'/>" 
              method="POST">
            <table style="text-align: center">
                <tr>
                    <td colspan="2">
                        <h1>Login</h1>
                        <c:if test="${not empty param.login_error}">
                            <span style="color: red">
                                El usuario y la contraseña no corresponden. Intente de nuevo.<br/><br/>
                            </span>
                        </c:if>
                    </td>
                </tr>
                <tr>
                    <td>Login:</td>
                    <td>
                        <input type="text" 
                               name="j_username" 
                               value="<c:if test='${not empty param.login_error}'>
                                   <c:out value="${SPRING_SECURITY_LAST_USERNAME}" />
                               </c:if>" />
                    </td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td>
                        <input type="password" name="j_password" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="checkbox" 
                               name="_spring_security_remember_me" />
                    </td>
                    <td>
                        No me preguntes mi contraseña por dos semanas.
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input name="submit" type="submit" value="Login" />
                        <input name="reset" type="reset" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
