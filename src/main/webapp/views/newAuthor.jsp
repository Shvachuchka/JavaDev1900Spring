<%--
  Created by IntelliJ IDEA.
  User: Yulian
  Date: 20.07.2016
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new Author</title>
</head>
<body>
    <div>
        <form method="post" action="/author/create">
            <input type="text" name="name" value="Pupkin" required>
            <input type="text" name="secondname" value="Ivan">Hello!
            <input type="text" name="country">
            <input type="number" name="age">
            <button type="submit">Add author</button>
        </form>
    </div>
</body>
</html>
