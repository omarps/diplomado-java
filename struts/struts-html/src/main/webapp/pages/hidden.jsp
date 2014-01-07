<%-- 
    Document   : hidden
    Created on : 6/01/2014, 05:15:40 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Hidden</title>
    </head>
    <body>
        <h1>Struts html:hidden Example</h1>

        <html:form action="/Hidden">
            <html:messages id="err_name" property="common.name.err">
                <div style="color:red">
                    <bean:write name="err_name" />
                </div>
            </html:messages>

            <div style="padding:16px">
                <html:hidden property="name" value="Esto esta oculto" />
                Un campo oculto, por favor revisa el archivo fuente.
            </div>

            <div style="padding:16px">
                <div style="float: left; padding-right: 8px;">
                    <html:submit>
                        <bean:message key="label.common.html.hidden.button.submit" />
                    </html:submit>
                </div>
                <html:reset>
                    <bean:message key="label.common.html.hidden.button.reset" />
                </html:reset>
            </div>
        </html:form>
    </body>
</html>
