<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Yulian
  Date: 22.07.2016
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<sec:authorize access="isAnonymous()"><a href="/login">Login</a></sec:authorize>
<sec:authorize access="isAuthenticated()">
    <form:form method="post" action="/logout">
        <button type="submit">Logout!</button>
    </form:form>
</sec:authorize>