<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="form.titulo"/></title>
        <s:head/>
    </head>
    <body>
        <h1><s:text name="form.titulo"/></h1>
        <s:form>
            <s:textfield key="form.propietario" name="cuenta.propietario"/>
            <s:textfield key="form.numero.cuenta" name="cuenta.numeroDeCuenta"/>
            <s:textfield key="form.saldo" name="cuenta.saldo"/>
            <s:submit key="form.enviar"/>
        </s:form>
        
        <h2><s:text name="form.valores.titulo"/><s:property value="cuenta.propietario"/></h2>
        <s:text name="form.numero.cuenta"/>: <s:property value="cuenta.numeroDeCuenta"/>
        <s:text name="form.saldo" />: <s:property value="cuenta.saldo"/>
        
        <s:url var="localeES" action="personas">
            <s:param name="request_locale">es</s:param>
        </s:url>
        <s:url var="localeEN" action="personas">
            <s:param name="request_locale">en</s:param>
        </s:url>
        <s:a href="%{localeES}"><s:text name="form.idioma.spanish" /></s:a>
                        |
        <s:a href="%{localeEN}"><s:text name="form.idioma.english"/></s:a>
    </body>
</html>
