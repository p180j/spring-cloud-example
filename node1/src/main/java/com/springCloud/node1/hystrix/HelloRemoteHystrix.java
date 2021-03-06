package com.springCloud.node1.hystrix;

import com.springCloud.node1.feign.HelloRemote;
import org.springframework.stereotype.Component;

/**
 * @author pengjw
 * @date 2019年03月19日 19:30
 * @description 熔断器
 * @Version 1.0
 */
@Component
public class HelloRemoteHystrix  implements HelloRemote {
    @Override
    public String hello2(String name) {
        return "hello"+name+"系统异常，请稍后重试！";
    }
}
