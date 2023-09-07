package com.iflytek.dubbo.service;


import com.iflytek.dubbo.model.Order;

public interface OrderService {
    public Order addOrder(String userId, String goodsName, Double price, Integer amount);
}
