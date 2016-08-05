<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Yulian
  Date: 05.08.2016
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<a href="/book/add">Add new Book</a>
<c:forEach items="${books}" var="b">
    <div onclick=" window.location = "" style="height: 500px; width: 500px; background-image: url(data:image/jpeg;base64,${b.image}")>
        <p>${b.title}</p>
        <p>${b.pages}</p>
        <p>${b.ganre}</p>
    </div>
</c:forEach>