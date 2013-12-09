<%-- 
    Document   : StringBean
    Created on : 3/12/2013, 10:51:47 AM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Using JavaBeans with JSP</title>
    </head>
    <body>
        <h1>Using JavaBeans with JSP</h1>
        <jsp:useBean id="stringBean" 
                     class="com.java.jspbeanapp.beans.StringBean" />
        <ol>
            <li>
                Initial value (from jsp:getProperty):
                <i>
                    <jsp:getProperty name="stringBean" 
                                     property="message" />
                </i>
            </li>
            <li>
                Initial value (from JSP expression):
                <i><%= stringBean.getMessage() %></i>
            </li>
            <li>
                <jsp:setProperty name="stringBean"
                                 property="message"
                                 value="Best string bean: Fortex" />
                Value after setting property with jsp:setProperty:
                <i>
                    <jsp:getProperty name="stringBean"
                                     property="message" />
                </i>
            </li>
            <li>
                <% stringBean.setMessage("My favorite: Kentucky Wonder"); %>
                Value after setting property with scriptlet:
                <i><%= stringBean.getMessage() %></i>
            </li>
        </ol>
    </body>
</html>
