<%--
  Created by IntelliJ IDEA.
  User: Yulian
  Date: 20.07.2016
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add new Author</title>
</head>
<body>
<div>
    <%--        <form method="post" action="/author/create">
                <input type="text" name="name" value="Pupkin" required>
                <input type="text" name="secondname" value="Ivan">Hello!
                <input type="text" name="country">
                <input type="number" name="age">
                <button type="submit">Add author</button>
            </form>--%>

    <form:form action="/author/create" method="post" modelAttribute="author">
        <form:label path="name">Name: </form:label>
        <form:input path="name"/>
        <form:label path="secondname">Secondname: </form:label>
        <form:input path="secondname"/>
        <form:label path="country">Country: </form:label>
        <form:input path="country"/>
        <form:label path="age">Age: </form:label>
        <form:input path="age"/>
        <form:button>Add Author</form:button>
    </form:form>

</div>
</body>
</html>
