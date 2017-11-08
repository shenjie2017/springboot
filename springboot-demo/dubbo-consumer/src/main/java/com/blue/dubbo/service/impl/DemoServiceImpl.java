package com.blue.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.blue.dubbo.service.DemoService;
import org.springframework.stereotype.Component;

/**
 * @author: 沈杰
 * @e-mail: 1075850619@qq.com
 * @description:
 * @date: 2017/11/8
 */
@Component("demoService")
public class DemoServiceImpl implements DemoService {
    @Reference(interfaceClass = DemoService.class,version = "1.0.0")
    private DemoService demoService;
    @Override
    public String sayHello(String name) {
        return demoService.sayHello(name);
    }
}
