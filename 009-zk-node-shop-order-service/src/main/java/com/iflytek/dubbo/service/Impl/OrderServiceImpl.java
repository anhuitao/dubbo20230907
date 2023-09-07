package com.iflytek.dubbo.service.Impl;

import com.iflytek.dubbo.model.Order;
import com.iflytek.dubbo.service.OrderService;

/**
 * @Author 不良使
 * @Date 2023/9/5 19:31
 * @Version 1.0
 * @Description TODO
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public Order addOrder(String userId, String goodsName, Double price, Integer amount) {
        return new Order("2","火龙果王",2000.9,204);
    }
}
