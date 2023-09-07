package com.iflytek.dubbo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class OrderApplication {
    public static void main(String[] args) throws IOException {
        /**
         * 启动spring容器：阅读配置信息
         *   3种：
         *     new ClassPathXmlApplicationContext("orderservce-provider.xml");
         *     new FileSystemXmlApplicationContext("E:/xxx/orderservce-provider.xml");
         *     Listener
         */
        new ClassPathXmlApplicationContext("orderservce-provider.xml");
        //标准输入：键盘输入     会让线程阻塞
        System.in.read();
    }
}
