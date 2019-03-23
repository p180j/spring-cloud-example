package com.springCloud.node2.feign;
import com.springCloud.node2.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author pengjw
 * @date 2019年03月19日 17:09
 * @description feign生产者服务接口
 * @Version 1.0
 * @FeignClient name中属性值和生产服务名一致
 */
@FeignClient(name = "spring-boot-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    /**
     * @author pengjw
     * @date 2019/3/19 17:11
     * @param name
     * @return java.lang.String
     * 方法名要和生产者方法名一致
     */
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);


}
