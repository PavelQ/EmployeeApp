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
    <LINK href="${pageContext.request.contextPath}/style/style.css" rel="stylesheet" type="text/css">
    <title></title>
</head>
<body>
<ul>
    <li><a href="${pageContext.request.contextPath}/view">view</a></li>
    <li><a href="${pageContext.request.contextPath}/CreateEmployee">create</a></li>
</ul>
<table>
    <tr>
        <td>id</td>
        <td>first name</td>
        <td>second name</td>
        <td>last name</td>
        <td>age</td>
        <td>experience</td>
        <td>description</td>
        <td>изменить</td>
        <td>удалить</td>
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
            <td><a href = "${pageContext.request.contextPath}/EditEmployee/${employee.id}"> edit</a></td>
            <td><a href = "${pageContext.request.contextPath}/delete/${employee.id}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
