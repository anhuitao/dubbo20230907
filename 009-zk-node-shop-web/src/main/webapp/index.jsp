<%--
  Created by IntelliJ IDEA.
  User: NING MEI
  Date: 2023/6/8
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="margin-left:400px">
<table border="1" cellpadding="1" cellspacing="1" width="60%">
    <p>商品列表</p>
    <tr>
        <td>iphone11</td>
        <td>5000</td>
        <td>8</td>
        <td><a href="javascript:void(0)" onClick="buyGoods(1,'iphone11','5000','8')">购买</td>
    </tr>

    <tr>
        <td>电视</td>
        <td>2000</td>
        <td>2</td>
        <td><a href="javascript:void(0)" onClick="buyGoods(2,'电视','2000','2')">购买</td>
    </tr>

</table>
</div>

<div style="margin-left:450px">
    <a href="javascript:void(0)" onClick="showAddress(2)" >我的收件地址1</a>
    <a href="javascript:void(0)" onClick="showAddress2(2)" >我的收件地址2</a>
</div>


js代码

<script type="text/javascript">
    var URL_PREFIX="${pageContext.request.contextPath}";
    function buyGoods(userId,name,price,amount){
        window.location.href= URL_PREFIX +"/shop/buy?userId="+userId
            +"&name="+name
            +"&price="+price
            +"&amount="+amount;
    }

    function showAddress(userId){
        window.location.href= URL_PREFIX +"/shop/addresses?userId="+userId;
    }

    function showAddress2(userId){
        window.location.href= URL_PREFIX +"/shop/addresses2?userId="+userId;
    }
</script>
</body>
</html>
