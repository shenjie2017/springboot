package com.blue;

import com.blue.dubbo.service.DemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author: 沈杰
 * @e-mail: 1075850619@qq.com
 * @description:
 * @date: 2017/11/7
 */
@SpringBootApplication
public class ClientApplication {
    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        ConfigurableApplicationContext run = SpringApplication.run(ClientApplication.class, args);
        DemoService demoService = run.getBean(DemoService.class);
        String result = demoService.sayHello("Bob");
        System.out.println(result);
    }
}
