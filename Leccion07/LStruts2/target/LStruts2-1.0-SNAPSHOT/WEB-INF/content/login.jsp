<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="titulo" /></title>
        <s:head/>
    </head>
    <body>
        <h1><s:text name="titulo"/></h1>
        <s:actionerror/>
        
        <s:form action="validarUsuario">
            <s:textfield key="usuarioV" name="usuario"/>
            <s:password key="passwordV" name="password"/>
            <s:submit key="boton" name="submit"/>
        </s:form>
    </body>
</html>
