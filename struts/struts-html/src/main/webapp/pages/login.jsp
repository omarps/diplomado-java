<%-- 
    Document   : login
    Created on : 12/12/2013, 05:13:43 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Ejemplo html:text</title>
    </head>
    <body>
        <html:form action="/login">
            <%-- Mensajes de Error --%>
            <html:messages id="err_name" property="common.name.error">
            <div style="color:red">
                <bean:write name="err_name" />
            </div>
            </html:messages>
            
            <%-- Etiqueta y campo username --%>
            <div style="padding:16px;">
                <div style="float:left;padding-right:8px;">
                    <bean:message key="label.common.name" /> :
                </div>
                <html:text property="username" size="20" maxlength="20" />
            </div>
            
            <%-- Botones --%>
            <div style="padding:16px;">
                <div style="float:left;padding-right:8px;">
                    <html:submit>
                        <bean:message key="label.common.button.submit" />
                    </html:submit>
                </div>
                <html:reset>
                    <bean:message key="label.common.button.reset" />
                </html:reset>
            </div>
        </html:form>
    </body>
</html>
