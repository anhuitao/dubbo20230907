package com.iflytek.dubbo.service.Impl;

import com.iflytek.dubbo.service.ShopService;
import com.iflytek.dubbo.model.Order;
import com.iflytek.dubbo.service.OrderService;

/**
 * @Author 不良使
 * @Date 2023/9/5 12:37
 * @Version 1.0
 * @Description TODO 消费者对象
 */
public class shopServiceImpl implements ShopService {

    //  使用远程服务接口
    private OrderService orderService;
    //  为setter注入做准备
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }



//    //  使用远程服务接口
//    private OrderService orderService;
//    //  为构造注入做准备
//    public shopServiceImpl(OrderService orderService) {
//        this.orderService = orderService;
//    }



    public Order buGoods(Integer userId, String goodsname, String price, String amount) {
        return orderService.addOrder(userId,goodsname,price,amount);
    }
}
