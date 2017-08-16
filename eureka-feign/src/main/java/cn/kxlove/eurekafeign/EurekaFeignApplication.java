package cn.kxlove.eurekafeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-16 18:36
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignApplication.class,args);
    }

}
