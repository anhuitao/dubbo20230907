package com.iflytek.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author 不良使
 * @Date 2023/9/5 12:23
 * @Version 1.0
 * @Description TODO  生产者启动
 */
public class OrderApplication {
    public static void main(String[] args) throws IOException {
        //  dubbo服务提供者配置文件
        String configLocationXml="orderservce-provider.xml";
        //  获取spring容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocationXml);
        //  启动spring容器
        applicationContext.start();
        //  让服务提供者服务一致运行（阻塞操作，应用一直运行）
        System.in.read();
//        Scanner scanner = new Scanner(String.valueOf(System.in.read()));
    }
}
