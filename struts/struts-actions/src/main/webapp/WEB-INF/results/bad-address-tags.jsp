<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
    <HEAD><TITLE>Illegal Email Address</TITLE></HEAD>
    <BODY BGCOLOR="#FDF5E6">
        <CENTER>
            <H1>Email incorrecto</H1>
            La dirección "<bean:write name="UserFormBean" property="email"/>"
            debe tener el formato usuario@host (p.e. "<bean:write name="suggestionBean" property="email"/>")
            <p>Inténtelo <A HREF="register3.jsp">de nuevo</A>.</p>
        </CENTER>
    </BODY></HTML>
