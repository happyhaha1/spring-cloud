package cn.kxlove.controller;

import cn.kxlove.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>MovieController</p>
 *
 * @author zhengkaixin
 * @since 2017-10-22 17:51
 */
@RestController
public class MovieController {

    private final RestTemplate restTemplate;

    @Value("${user.userServicePath}")
    private String userServicePath;

    @Autowired
    public MovieController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id) {
        return this.restTemplate.getForObject(this.userServicePath + id, User.class);
    }
}
