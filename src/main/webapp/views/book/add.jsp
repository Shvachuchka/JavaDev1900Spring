<%--
  Created by IntelliJ IDEA.
  User: Yulian
  Date: 05.08.2016
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="/book/new?${_csrf.parameterName}=${_csrf.token}" method="post" enctype="multipart/form-data">
    <input type="text" name="title">
    <input type="number" name="pages">
    <input type="text" name="ganre">
    <input type="file" name="image">
    <button type="submit">Add!</button>
</form>