<%--
  Created by IntelliJ IDEA.
  User: NING MEI
  Date: 2023/6/8
  Time: 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>展示地址</title>
</head>
<body>
<h1>收货人地址如下：</h1>
<c:forEach items="${addressList}" var="address" varStatus="status" >
    <h3>收货人姓名：${address.name}</h3>
    <h3>收货人城市：${address.city}</h3>
    <h3>收货人街道：${address.street}</h3>

    <div>---------------------------------</div>
</c:forEach>
</body>
</html>
