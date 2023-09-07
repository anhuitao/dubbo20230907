package com.iflytek.dubbo.service;


import com.iflytek.dubbo.model.Address;
import java.util.List;

public interface UserInfoService {
    public List<Address> queryAllAddress(String userId);
}
