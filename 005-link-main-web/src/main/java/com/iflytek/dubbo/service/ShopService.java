package com.iflytek.dubbo.service;

import com.iflytek.dubbo.model.Order;

/**
 * @Author 不良使
 * @Date 2023/9/5 18:49
 * @Version 1.0
 * @Description TODO
 */
public interface ShopService {
    Order buyGoods(String userId, String goodsName, Double price, Integer amount);
}
