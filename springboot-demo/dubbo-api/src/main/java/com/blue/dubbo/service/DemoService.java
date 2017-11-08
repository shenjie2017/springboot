package com.blue.dubbo.service;

/**
 * @author: 沈杰
 * @e-mail: 1075850619@qq.com
 * @description:
 * @date: 2017/11/7
 */
public interface DemoService {
    /**
     * 返回一个带有hello+名字的字符串
     * @param name
     * @return hello+名字
     */
    String sayHello(String name);
}
