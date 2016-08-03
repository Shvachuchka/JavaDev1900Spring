<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Yulian
  Date: 29.07.2016
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form:form action="/registration" method="post" modelAttribute="user">
    <form:errors path="name"/>
    <form:input path="name"/>
    <form:errors path="secondname"/>
    <form:input path="secondname"/>
    <form:errors path="email"/>
    <form:input path="email"/>
    <form:errors path="phone"/>
    <form:input path="phone"/>
    <form:errors path="password"/>
    <form:input path="password"/>
    <form:errors path="password"/>
    <form:input path="passwordConfirm"/>
    <form:button>Sign up!</form:button>
</form:form>