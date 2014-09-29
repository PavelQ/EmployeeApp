<%--
  Created by IntelliJ IDEA.
  User: Pavel
  Date: 26.09.2014
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>search</title>
    <LINK href="${pageContext.request.contextPath}/style/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<%@include file="navigate.jsp"%>
<form action="${pageContext.request.contextPath}/search" method="post">
    <p>Поиск ищет на совпадение с начала строки оп полям имени и описания</p>

    Введите текст:
    <input type="text" id="word" name="word"/>
    <input type="submit"/>
</form>
<c:if test="${employees!=null}">
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
        <c:forEach var="employee" items="${employees}">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.firstName}</td>
                <td>${employee.secondName}</td>
                <td>${employee.lastName}</td>
                <td>${employee.age}</td>
                <td>${employee.experience}</td>
                <td>${employee.description}</td>
                <td><a href="${pageContext.request.contextPath}/EditEmployee/${employee.id}">edit</a></td>
                <td><a href="${pageContext.request.contextPath}/delete/${employee.id}">delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>
