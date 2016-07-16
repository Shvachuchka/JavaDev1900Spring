<%--
  Created by IntelliJ IDEA.
  User: Yulian
  Date: 15.07.2016
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${authors}" var="a">
        <div style="width: 300px; height: 300px; background-color: darkgrey; color: white; float: left; margin: 20px; border: 3px double black; border-radius: 10px;">
            <p style="text-align: center; padding: 0 10px;">${a.name}</p>
            <p style="text-align: center; padding: 0 10px;">${a.secondname}</p>
            <p style="text-align: center; padding: 0 10px;">${a.country}</p>
            <p style="text-align: center; padding: 0 10px;">${a.age}</p>
            <p style="text-align: center; padding: 0 10px;">${a.age}</p>
            <p style="text-align: center; padding: 0 10px;">${a.age}</p>
            <p style="text-align: center; padding: 0 10px;">${a.age}</p>
            <p style="text-align: center; padding: 0 10px;">${a.age}</p>
        </div>
    </c:forEach>
</body>
</html>
