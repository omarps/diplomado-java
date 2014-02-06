<%-- 
    Document   : add_customer
    Created on : 5/02/2014, 05:41:36 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Add Customer</title>
    </head>
    <body>
        <h1>Agregar Cliente</h1>
        <div style="color:red">
            <html:errors/>
        </div>

        <html:form action="/AddCustomer.do">
            <div style="padding: 16px">
                <div style="float: left; width: 100px;">
                    <bean:message key="customer.label.name" /> :
                </div>
                <html:text property="name" size="40" maxlength="20" />
            </div>
            <div style="padding: 16px">
                <div style="float: left; width: 100px;">
                    <bean:message key="customer.label.address" /> :
                </div>
                <html:textarea property="address" cols="50" rows="5" />
            </div>
            <div style="padding: 16px">
                <div style="float: left; padding-right: 8px;">
                    <html:submit>
                        <bean:message 
                            key="customer.label.button.submit" />
                    </html:submit>
                </div>
                <html:reset>
                    <bean:message key="customer.label.button.reset" />
                </html:reset>
            </div>
        </html:form>
    </body>
</html>
