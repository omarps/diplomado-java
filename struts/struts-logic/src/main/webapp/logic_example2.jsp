<%-- 
    Document   : logic_example2
    Created on : 7/01/2014, 06:32:50 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Logic Example 2</title>
    </head>
    <body>
        <h2>Struts Example logic:equal</h2>
        <logic:equal name="user" 
                     property="email" 
                     value="correo@micorreo.com">
            <h3>El correo del usuario es el mismo.</h3>
        </logic:equal>
        <h2>Struts Example logic:notEqual</h2>
        <logic:notEqual name="user" 
                        property="email" 
                        value="otrocorreo@micorreo.com">
            <h3>El correo del usuario *NO* es el mismo.</h3>
        </logic:notEqual>

        <h2>Struts Example logic:greaterThan</h2>
        <logic:greaterThan name="number" value="99">
            <h3>Numero 100 > 99 = true</h3>
        </logic:greaterThan>
        <h2>Struts Example logic:greaterEqual</h2>
        <logic:greaterEqual name="number" value="100">
            <h3>Numero 100 >= 100 = true</h3>
        </logic:greaterEqual>
        <h2>Struts Example logic:lessThan</h2>
        <logic:lessThan name="number" value="101">
            <h3>Numero 100 < 101 = true</h3>
        </logic:lessThan>
        <h2>Struts Example logic:lessEqual</h2>
        <logic:lessEqual name="number" value="100">
            <h3>Numero 100 <= 100 = true</h3>
        </logic:lessEqual>

        <h3>Match / not match [omarps@gmail.com]</h3>
        <ol>
            <li>
                "gmail"forma parte del correo - 
                <logic:match name="email" value="gmail">
                    true
                </logic:match>
                <logic:notMatch name="email" value="gmail">
                    false
                </logic:notMatch>
            </li>
            <li>
                "Omar" forma parte del correo - 
                <logic:match name="email" value="Omar">
                    true
                </logic:match>
                <logic:notMatch name="email" value="Omar">
                    false
                </logic:notMatch>
            </li>
            <li>
                Inicia con "omarps" - 
                <logic:match name="email" value="omarps" 
                             location="start">
                    true
                </logic:match>
                <logic:notMatch name="email" value="omarps" 
                                location="start">
                    false
                </logic:notMatch>
            </li>
            <li>
                Inicia con "jorge" - 
                <logic:match name="email" value="jorge" 
                             location="start">
                    true
                </logic:match>
                <logic:notMatch name="email" value="jorge" 
                                location="start">
                    false
                </logic:notMatch>
            </li>
            <li>
                Termina con "gmail.com" - 
                <logic:match name="email" value="gmail.com" 
                             location="end">
                    true
                </logic:match>
                <logic:notMatch name="email" value="gmail.com" 
                                location="end">
                    false
                </logic:notMatch>
            </li>
            <li>
                Termina con "hotmail.com" - 
                <logic:match name="email" value="hotmail.com" 
                             location="end">
                    true
                </logic:match>
                <logic:notMatch name="email" value="hotmail.com" 
                                location="end">
                    false
                </logic:notMatch>
            </li>
        </ol>
    </body>
</html>
