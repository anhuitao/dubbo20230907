package com.iflytek.dubbo.service;

import com.iflytek.dubbo.model.Order;

/**
 * @Author 不良使
 * @Date 2023/9/5 12:35
 * @Version 1.0
 * @Description TODO 消费者接口
 */
public interface ShopService {
    Order buGoods(Integer userId, String goodsname, String price, String amount);
}
