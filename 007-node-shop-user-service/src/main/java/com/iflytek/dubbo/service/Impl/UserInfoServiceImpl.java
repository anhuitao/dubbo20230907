package com.iflytek.dubbo.service.Impl;

import com.iflytek.dubbo.model.Address;
import com.iflytek.dubbo.service.UserInfoService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 不良使
 * @Date 2023/9/5 19:22
 * @Version 1.0
 * @Description TODO
 */
public class UserInfoServiceImpl implements UserInfoService {
    @Override
    public List<Address> queryAllAddress(String userId) {
        List<Address> addrList=new ArrayList<>();
        addrList.add(new Address(1,"安徽","宣城","宣城区"));
        addrList.add(new Address(2,"江苏","南京","雨花台"));
        return addrList;
    }
}
