package cn.kxlove.eurekafeign.service;

import org.springframework.stereotype.Component;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-16 18:56
 */
@Component
public class EurekaClientServiceHystrix implements EurekaClientService{

    @Override
    public Integer add(Integer a, Integer b) {
        return -9999;
    }
}
