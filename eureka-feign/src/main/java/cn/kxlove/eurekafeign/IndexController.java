package cn.kxlove.eurekafeign;

import cn.kxlove.eurekafeign.service.EurekaClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-16 18:37
 */
@RestController
public class IndexController {

    private final EurekaClientService eurekaClientService;

    @Autowired
    public IndexController(EurekaClientService eurekaClientService) {
        this.eurekaClientService = eurekaClientService;
    }

    @GetMapping("/add")
    public Integer add() {
        return eurekaClientService.add(10,20);
    }
}
