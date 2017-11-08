package com.blue.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.blue.dubbo.service.DemoService;
import org.springframework.stereotype.Component;

/**
 * @author: 沈杰
 * @e-mail: 1075850619@qq.com
 * @description:
 * @date: 2017/11/7
 */
//@Component("demoService")
@Service(interfaceClass = DemoService.class,version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}