<%--
  Created by IntelliJ IDEA.
  User: Pavel
  Date: 24.09.2014
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Employee</title>

    <LINK href="${pageContext.request.contextPath}/style/style.css" rel="stylesheet" type="text/css"/>

</head>
<body>
<%@include file="navigate.jsp"%>
<form:form action="${navigate}" method="post" modelAttribute="employee">
    <form:hidden path="id"/>
    <table>
        <tr>
            <td><form:label path="firstName">first name</form:label></td>
            <td><form:input path="firstName"/></td>
        </tr>
        <tr>
            <td><form:label path="secondName">second name</form:label></td>
            <td><form:input path="secondName"/></td>
        </tr>
        <tr>
            <td><form:label path="lastName">last name</form:label></td>
            <td><form:input path="lastName"/></td>
        </tr>
        <tr>
            <td><form:label path="age">age</form:label></td>
            <td><form:input path="age"/></td>
        </tr>
        <tr>
            <td><form:label path="experience">experience</form:label></td>
            <td><form:input path="experience"/></td>
        </tr>
        <tr>
            <td><form:label path="description">description</form:label></td>
            <td><form:input path="description"/></td>
        </tr>
    </table>
    <input type="submit">
</form:form>

</body>
</html>
