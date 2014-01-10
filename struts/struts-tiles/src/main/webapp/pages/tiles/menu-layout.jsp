<%-- 
    Document   : menu-layout
    Created on : 9/01/2014, 06:31:27 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>
            <tiles:getAsString name="title" ignore="true" />
        </title>
    </head>
    <body>
        <div id="container" style="width:500px">
            <div id="header" style="background-color:#FFA500">
                <tiles:insert attribute="header" ignore="true" />
            </div>
            <div id="menu" 
                 style="background-color:#FFD700;height:200px;width:100px;float:left;">
                <tiles:insert attribute="menu" />
            </div>
            <div id="body" 
                 style="background-color:#EEEEEE;height:200px;width:400px;float:left;">
                <tiles:insert attribute="body" />
            </div>
            <div id="footer" 
                 style="background-color:#FFA500;clear:both;text-align:center;">
                <tiles:insert attribute="footer" />
            </div>
        </div>
    </body>
</html>
