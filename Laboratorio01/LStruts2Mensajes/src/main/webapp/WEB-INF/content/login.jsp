<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:property value="titulo"/></title>
    </head>
    <body>
        <h1><s:property value="titulo"/></h1>
        <s:form>
            <s:textfield key="usuarioV" name="usuario"/>
            <s:password key="passwordV" name="password"/>
            <s:submit key="boton" name="submit"/>
        </s:form>
        <div>
            <s:property value="valorUsuario"/><s:property value="usuario"/>
            <br/> 
            <s:property value="valorPassword"/><s:property value="password"/>
        </div>
    </body>
</html>
