package com.iflytek.dubbo;

import com.iflytek.dubbo.service.ShopService;
import com.iflytek.dubbo.model.Order;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 不良使
 * @Date 2023/9/5 12:46
 * @Version 1.0
 * @Description TODO  消费者启动
 */
public class ShopApplication {
    public static void main(String[] args) {
        //  配置文件地址
//        String configLocationXml="shop-consume.xml";
        String configLocationXml="shop-consume.xml";
        //  获取spring容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocationXml);
        //  启动容器
        applicationContext.start();
        //  获取容器中的shopService对象
        ShopService shopService = (ShopService) applicationContext.getBean("shopService");
        Order phone = shopService.buGoods(1, "phone", "190000", "10");
        System.out.println("phone = " + phone);
    }
}
