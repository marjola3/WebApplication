<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page pageEncoding="utf-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="/resources/css/style.css"/>
    <title>WebApp</title>
</head>

<body>
<div id="content">
    <form:form method="post" action="add" commandName="user">
        <table>
            <tr>
                <td><form:label path="firstName"><spring:message code="users.label.firstName"/></form:label></td>
                <td><form:input path="firstName" maxlength="30"/></td>
            </tr>
            <tr>
                <td><form:label path="lastName"><spring:message code="users.label.lastName"/></form:label></td>
                <td><form:input path="lastName" maxlength="30"/></td>
            </tr>
            <tr>
                <td><form:label path="login"><spring:message code="users.label.login"/></form:label></td>
                <td><form:input path="login" maxlength="20"/></td>
            </tr>
            <tr>
                <td><form:label path="password"><spring:message code="users.label.password"/></form:label></td>
                <td><form:password path="password" maxlength="20"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="<spring:message code="users.label.save"/>"/></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>