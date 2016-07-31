<%--
  Created by IntelliJ IDEA.
  User: Yulian
  Date: 15.07.2016
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${authors}" var="a">
    <a href="/author/page/${a.id}">
        <div style="width: 300px; height: 300px; background-color: darkgrey; color: white; float: left; margin: 10px; border: 3px double black; border-radius: 50%;">
            <p style="text-align: center; padding: 0 10px; font-size: 24pt">${a.name}</p>
            <p style="text-align: center; padding: 0 10px; font-size: 24pt">${a.secondname}</p>
            <p style="text-align: center; padding: 0 10px; font-size: 24pt">${a.country}</p>
            <p style="text-align: center; padding: 0 10px; font-size: 24pt">${a.age}</p>
            <p><a href="/author/edit/${a.id}">Модифікувати</a></p>
            <p><form:form action="/author/delete/${a.id}" method="post">
                <button type="submit">Видалити</button>
            </form:form></p>
        </div>
    </a>
</c:forEach>
<p style="clear: left; text-align: center"><sec:authorize access="hasRole('ADMIN')"><a href="/author/new">Add new Author</a></sec:authorize> </p>
</body>
</html>
