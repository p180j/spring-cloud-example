package com.springcloud.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengjw
 * @date 2019年03月19日 17:03
 * @description 服务生产者提供方法
 * @Version 1.0
 */
@RestController
public class ProducerController {

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello "+name+"，this is first messge";
    }

}
