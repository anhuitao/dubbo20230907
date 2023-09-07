package com.iflytek.dubbo.service;

import com.iflytek.dubbo.model.Order;

/**
 * @Author 不良使
 * @Date 2023/9/5 11:45
 * @Version 1.0
 * @Description TODO  生产者接口
 */
public interface OrderService {
    Order addOrder(Integer userId,String goodsname,String price,String amount);
}
