<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Yulian
  Date: 29.07.2016
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form:form action="/loginprocessing" method="post">
    <input name="username" type="text" placeholder="Login">
    <input name="password" type="password" placeholder="Password">
    <input type="submit" value="Sign in">
</form:form>