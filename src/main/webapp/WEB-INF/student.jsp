<%--
  Created by IntelliJ IDEA.
  User: Evgeniy
  Date: 24.02.2024
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/student" method="post">
    <input type="text" name="id" value="${student.id}" hidden> <br>
    <input type="text" name="name" value="${student.name}" placeholder="enter name"> <br>
    <input type="text" name="email" value="${student.email}" placeholder="enter email"> <br>
    <input type="text" name="phone" value="${student.phone}" placeholder="enter phone"> <br>

    <c:if test="${student == null}">
        <button type="submit">Add student</button>
    </c:if>


    <c:if test="${student != null}">
        <button type="submit">Update student</button>
    </c:if>
</form>

</body>
</html>
