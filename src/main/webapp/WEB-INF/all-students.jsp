<%--
  Created by IntelliJ IDEA.
  User: Evgeniy
  Date: 24.02.2024
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.name}</td>
            <td>${student.email}</td>
            <td>${student.phone}</td>
            <td>${student.group.name}</td>
            <td><a href="/student/info${student.id}">Info</a></td>
            <td><a href="/student/update${student.id}"> Update</a></td>
            <td><a href="/student/delete${student.id}"> Delete</a></td>
        </tr>
        </c:forEach>
    </table>

        <%--                <c:if test="${student.phone.equals('333')}">--%>
        <%--                    <div style="color: aqua">${student.name} ${student.phone}--%>
        <%--                        <a href="/single/developer/${student.phone}">Info</a>--%>
        <%--                        <a href="/update/developer/${student.id}"> Update</a>--%>
        <%--                        <a href="/delete/developer/${student.id}"> Delete</a>--%>
        <%--                    </div>--%>
        <%--                </c:if>--%>


        <%--                <c:if test="${!student.phone.equals('333')}">--%>
        <%--                    <div style="color: coral">${student.name} ${student.phone}--%>
        <%--                        <a href="/single/developer/${student.phone}">Info</a>--%>
        <%--                        <a href="/update/developer/${student.id}"> Update</a>--%>
        <%--                        <a href="/delete/developer/${student.id}"> Delete</a>--%>
        <%--                    </div>--%>
        <%--                </c:if>--%>


    <br>

    <%--<c:forEach var="firm" items="${firms}">--%>
    <%--    <div>${firm.name} <a href="/single/firm/${firm.idFirm}">firm</a></div>--%>
    <%--</c:forEach>--%>


    <br>

    <a href="/student">Add student</a>

</body>
</html>
