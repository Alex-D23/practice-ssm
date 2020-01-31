<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/1/31 0031
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增用户</title>
</head>
<body>
    <form action="/user/addUser" method="post">
        用户名：<input type="text" name="userName"/><br>
        手机号：<input type="text" name="phone"/><br>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
