package com.iflytek.dubbo.service.Impl;

import com.iflytek.dubbo.model.Order;
import com.iflytek.dubbo.service.OrderService;

/**
 * @Author 不良使
 * @Date 2023/9/5 11:47
 * @Version 1.0
 * @Description TODO  这是生产者的接口实现类   执行方法的
 */
public class OrderServiceImpl implements OrderService {
    //  提供者接口实现方法
    public Order addOrder(Integer userId, String goodsname, String price, String amount) {
        return new Order(1,"水杯","200元","5");
    }
}
