<%-- 
    Document   : logic_example
    Created on : 7/01/2014, 05:11:31 PM
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
        <title>Logic Example</title>
    </head>
    <body>
        <h2>Logic Example logic:empty</h2>
        <logic:empty name="messageList0">
            <h3>messageList0 esta vacio</h3>
        </logic:empty>
        <logic:empty name="messageList1">
            <h3>messageList1 esta vacio</h3>
        </logic:empty>
        <logic:empty name="messageList2">
            <h3>messageList2 esta vacio</h3>
        </logic:empty>

        <h2>Struts Example logic:notEmpty</h2>
        <logic:notEmpty name="messageList0">
            <h3>messageList0 no esta vacio</h3>
            <logic:iterate name="messageList0" id="message0">
                <p>
                    Lista de mensajes 0 - 
                    <bean:write name="message0" />
                </p>
            </logic:iterate>
        </logic:notEmpty>
        <logic:notEmpty name="messageList1">
            <h3>messageList1 no esta vacio</h3>
            <logic:iterate name="messageList1" id="message1">
                <p>
                    Lista de mensajes 1 - 
                    <bean:write name="message1" />
                </p>
            </logic:iterate>
        </logic:notEmpty>
        <logic:notEmpty name="messageList2">
            <h3>messageList2 no esta vacio</h3>
            <logic:iterate name="messageList2" id="message2">
                <p>
                    Lista de mensajes 2 - 
                    <bean:write name="message2" />
                </p>
            </logic:iterate>
        </logic:notEmpty>
    </body>
</html>
