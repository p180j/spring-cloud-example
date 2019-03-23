package com.springcloud.customer.hystrix;

import com.springcloud.customer.feign.HelloRemote;
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
    public String hello(String name) {
        return "hello"+name+"系统异常，请稍后重试！";
    }
}
