package cn.kxlove.eurekaclient;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-16 10:43
 */
@RestController
public class IndexController {

    private final DiscoveryClient discoveryClient;
    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    public IndexController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }


    @GetMapping("/dc")
    public String dc(){
        String service = "Service: " + discoveryClient.getServices();
        System.out.println(service);
        return service;
    }

    @GetMapping("/add")
    public Integer add(@RequestParam Integer a,@RequestParam Integer b) {

        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        Integer r = a + b;
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }
}
