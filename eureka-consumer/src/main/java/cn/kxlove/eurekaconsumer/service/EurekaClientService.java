package cn.kxlove.eurekaconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-16 19:35
 */
@Service
public class EurekaClientService {


    private final RestTemplate restTemplate;

    @Autowired
    public EurekaClientService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public Integer addService() {
        return restTemplate.getForEntity("http://EUREKA-CLIENT/add?a=10&b=20", Integer.class).getBody();
    }

    public Integer addServiceFallback() {
        return -9999;
    }
}
