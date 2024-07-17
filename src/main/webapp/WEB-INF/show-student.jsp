<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 15.07.2024
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Show student</h1>
<h2>Student name: ${student.name}</h2>
<h2>Student email: ${student.email}</h2>
<h2>Student phone: ${student.phone}</h2>

<h2>Student teacher: </h2>
    <c:forEach var="teacher" items="${student.teachers}">
        <span>
                ${teacher.name}
        </span>
        <br>
    </c:forEach>
</body>
</html>
