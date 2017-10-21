package cn.kxlove.springms.controller;

import cn.kxlove.springms.entity.User;
import cn.kxlove.springms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>ProviderUserController</p>
 *
 * @author zhengkaixin
 * @since 2017-10-21 上午11:46
 */
@RestController
public class ProviderUserController {

    private final UserRepository userRepository;


    @Autowired
    public ProviderUserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {
        return userRepository.getOne(id);
    }
}
