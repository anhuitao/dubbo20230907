package com.iflytek.dubbo.web;


import com.iflytek.dubbo.model.Address;
import com.iflytek.dubbo.model.Goods;
import com.iflytek.dubbo.model.Order;
import com.iflytek.dubbo.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/shop")
@Controller
public class ShopController {
    @Autowired
    ShopService shopService;

    @RequestMapping("/buy")
    public String buyGoods(String userId, Goods goods, Model model){
        System.out.println("userId = " + userId);
        Order order = shopService.createOrder(userId, goods);
        model.addAttribute("order", order);
        return "view-order";
    }


    @RequestMapping("/addresses")
    public String showAddressList(String userId, HttpServletRequest request){



        List<Address> addressList = shopService.showAddress(userId);
        //model.addAttribute("order", order);
        request.setAttribute("addressList", addressList);
        return "view-address";
    }

    @RequestMapping("/addresses2")
    public String showAddressList2(String userId, HttpServletRequest request){
        List<Address> addressList = shopService.showAddress2(userId);
        //model.addAttribute("order", order);
        request.setAttribute("addressList", addressList);
        return "view-address";
    }

}
