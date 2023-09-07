package com.iflytek.dubbo.service;


import com.iflytek.dubbo.model.Address;
import com.iflytek.dubbo.model.Goods;
import com.iflytek.dubbo.model.Order;

import java.util.List;

public interface ShopService {
    public Order createOrder(String userId, Goods goods);
    public List<Address> showAddress(String userId);
    public List<Address> showAddress2(String userId);
}
