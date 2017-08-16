package cn.kxlove.eurekaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-15 19:10
 */
@RestController
public class IndexController {

    private final DiscoveryClient client;

    final
    LoadBalancerClient loadBalancerClient;

    private final RestTemplate restTemplate;

    @Autowired
    public IndexController(DiscoveryClient discoveryClient, RestTemplate restTemplate, LoadBalancerClient loadBalancerClient) {
        this.client = discoveryClient;
        this.restTemplate = restTemplate;
        this.loadBalancerClient = loadBalancerClient;
    }


    @GetMapping("/dc")
    public String dc() {
        return restTemplate.getForEntity("http://EUREKA-CLIENT/add?a=10&b=20", String.class).getBody();
    }


}
