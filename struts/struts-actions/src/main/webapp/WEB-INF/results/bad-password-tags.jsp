<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
    <HEAD><TITLE>Illegal Password</TITLE></HEAD>
    <BODY BGCOLOR="#FDF5E6">
        <CENTER>
            <H1>Password Incorrecto</H1>
            El password "<bean:write name="UserFormBean" property="password"/>" es muy corto.
            Debe tener al menos 6 caracteres. P.e.: "<bean:write name="suggestionBean" property="password"/>"
            Por favor inténtelo <A HREF="register3.jsp">de nuevo</A>.
        </CENTER>
    </BODY></HTML>
