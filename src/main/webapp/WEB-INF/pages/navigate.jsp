<%--
  Created by IntelliJ IDEA.
  User: Pavel
  Date: 26.09.2014
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
    <LINK href="${pageContext.request.contextPath}/style/jquery-ui.css" rel="stylesheet" type="text/css"/>
    <script src="//code.jquery.com/jquery-1.10.2.js"></script>
    <script src="//code.jquery.com/ui/1.11.1/jquery-ui.js"></script>
    <script>
        $(function () {
            $("#menu").menu();
        });
    </script>
    <style>
        .ui-menu {
            width: 150px;
        }
    </style>
<ul id="menu">
    <li><a href="${pageContext.request.contextPath}/view">view</a></li>
    <li><a href="${pageContext.request.contextPath}/CreateEmployee">create</a></li>
    <li><a href="${pageContext.request.contextPath}/search">search</a></li>
    <li><a href="${pageContext.request.contextPath}/ajax">search ajax</a></li>
    <%--<li><a href="${pageContext.request.contextPath}/ajaxEdit">edit ajax</a></li>--%>
</ul>

