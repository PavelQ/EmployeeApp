<%--
  Created by IntelliJ IDEA.
  User: Pavel
  Date: 26.09.2014
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="navigate.jsp" %>
<html>
<head>
    <title>ajax</title>
    <LINK href="${pageContext.request.contextPath}/style/style.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript">


        $(document).ready(function () {

            //execute after keypress in searc hinput
            $("#word").change(function () {
                txt = $("#word").val();

                $(".list tr").has("td").remove()
                $.post("${pageContext.request.contextPath}/ajax", {
                    word: txt
                }, function (data, status) {
//                    if(status==200)
                    $(".list").append(data);
                });

            });

 
    </script>

</head>
<body>
<form>
    <p>Поиск ищет на совпадение с начала строки оп полям имени и описания</p>
    Введите текст:
    <input type="text" id="word"/>
</form>
<table class="list">
    <tr>
        <th>id</th>
        <th>first name</th>
        <th>second name</th>
        <th>last name</th>
        <th>age</th>
        <th>experience</th>
        <th>description</th>
        <%--<th>изменить</th>--%>
        <th>удалить</th>
    </tr>

</table>
</body>
</html>
