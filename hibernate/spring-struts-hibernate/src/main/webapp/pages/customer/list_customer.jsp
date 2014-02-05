<%-- 
    Document   : list_customer
    Created on : 4/02/2014, 07:26:40 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Lista todos los clientes</title>
    </head>
    <body>
        <h1>Lista todos los clientes</h1>
        
        <table border="1">
            <tr>
                <td>Nombre de Cliente</td>
                <td>Direccion</td>
            </tr>
            
            <logic:iterate id="customer" 
                           name="dynaCustomerListForm" 
                           property="customerList">
                <tr>
                    <td>
                        <bean:write name="customer" 
                                    property="name" />
                    </td>
                    <td>
                        <bean:write name="customer" 
                                    property="address" />
                    </td>
                </tr>
            </logic:iterate>
        </table>
        <br/>
        <br/>
        <html:link action="/AddCustomerPage.do">
            Agregar Cliente
        </html:link>
    </body>
</html>
