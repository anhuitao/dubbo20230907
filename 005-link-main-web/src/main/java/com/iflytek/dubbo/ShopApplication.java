package com.iflytek.dubbo;

import com.iflytek.dubbo.model.Order;
import com.iflytek.dubbo.service.ShopService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 不良使
 * @Date 2023/9/5 18:53
 * @Version 1.0
 * @Description TODO
 */
public class ShopApplication {
    public static void main(String[] args) {
        //  配置项信息
        String configLocationXml="shop-consume.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocationXml);
        ShopService shopServiceImpl = (ShopService) applicationContext.getBean("shopServiceImpl");
        Order order = shopServiceImpl.buyGoods("001","西瓜",100.98,12);
        System.out.println("order = " + order);
    }
}
