<%--
  Created by IntelliJ IDEA.
  User: Pavel
  Date: 23.09.2014
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>view</title>

    <LINK href="${pageContext.request.contextPath}/style/style.css" rel="stylesheet" type="text/css"/>

</head>
<body>
<%@include file="navigate.jsp"%>
<table class="list">
    <tr>
        <th>id</th>
        <th>first name</th>
        <th>second name</th>
        <th>last name</th>
        <th>age</th>
        <th>experience</th>
        <th>description</th>
        <th>изменить</th>
        <th>удалить</th>
    </tr>
    <c:forEach var="employee" items="${allEmployees}">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.firstName}</td>
            <td>${employee.secondName}</td>
            <td>${employee.lastName}</td>
            <td>${employee.age}</td>
            <td>${employee.experience}</td>
            <td>${employee.description}</td>
            <td><a href="${pageContext.request.contextPath}/EditEmployee/${employee.id}"> edit</a></td>
            <td><a href="${pageContext.request.contextPath}/delete/${employee.id}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
