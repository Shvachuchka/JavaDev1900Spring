<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Yulian
  Date: 31.07.2016
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form:form action="/author/edit" method="post" modelAttribute="author">
    <form:hidden path="id"/>
    <form:input path="name"/>
    <form:input path="secondname"/>
    <form:input path="country"/>
    <form:input path="age"/>
    <form:button>Edit</form:button>
</form:form>