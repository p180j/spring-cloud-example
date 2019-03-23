package com.springCloud.node2.controller;
import com.springCloud.node2.feign.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengjw
 * @date 2019年03月19日 17:12
 * @description 消费者控制层
 * @Version 1.0
 * HelloRemote 是获取服务的接口
 */
@RestController
public class HelloController {
    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }

}
