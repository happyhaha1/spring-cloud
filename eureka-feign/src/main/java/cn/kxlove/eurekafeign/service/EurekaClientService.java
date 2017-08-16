package cn.kxlove.eurekafeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-16 18:38
 */
@FeignClient(value = "eureka-client",fallback = EurekaClientServiceHystrix.class)
public interface EurekaClientService {


    @GetMapping("/add")
    Integer add(@RequestParam("a") Integer a,@RequestParam("b") Integer b);
}
