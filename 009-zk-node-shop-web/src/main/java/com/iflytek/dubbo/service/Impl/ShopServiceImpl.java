package com.iflytek.dubbo.service.Impl;

import com.iflytek.dubbo.model.Address;
import com.iflytek.dubbo.model.Goods;
import com.iflytek.dubbo.model.Order;
import com.iflytek.dubbo.service.OrderService;
import com.iflytek.dubbo.service.ShopService;
import com.iflytek.dubbo.service.UserInfoService;

import java.util.List;

/**
 * @Author 不良使
 * @Date 2023/9/5 19:54
 * @Version 1.0
 * @Description TODO
 */
public class ShopServiceImpl implements ShopService {
    private OrderService orderService;
    private UserInfoService userInfoService;
    private UserInfoService userInfoService2;

    //  setter 方法    setter 注入
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public void setUserInfoService(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    public void setUserInfoService2(UserInfoService userInfoService2) {
        this.userInfoService2 = userInfoService2;
    }

    @Override
    public Order createOrder(String userId, Goods goods) {
        return orderService.addOrder(userId,goods.getName(), goods.getPrice(), goods.getAmount());
    }

    @Override
    public List<Address> showAddress(String userId) {
        return userInfoService.queryAllAddress(userId);
    }

    @Override
    public List<Address> showAddress2(String userId) {
        return userInfoService2.queryAllAddress(userId);
    }
}
