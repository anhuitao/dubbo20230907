<%--
  Created by IntelliJ IDEA.
  User: NING MEI
  Date: 2023/6/8
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单展示</title>
</head>
<body>
<h1>您的订单已经生成：</h1>
<h3>订单编号：${order.id}</h3>
<h3>订单金额：${order.price}</h3>
<h3>商品名称：${order.goodsName}</h3>
<h3>商品数量：${order.amount}</h3>

</body>
</html>
