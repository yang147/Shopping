<%--
  Created by IntelliJ IDEA.
  User: yangc002
  Date: 2018/11/20
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
<form action="file/uploadFile" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="file"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
