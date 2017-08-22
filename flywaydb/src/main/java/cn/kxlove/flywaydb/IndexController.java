package cn.kxlove.flywaydb;

import cn.kxlove.flywaydb.domain.User;
import cn.kxlove.flywaydb.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-22 13:40
 */
@RestController
public class IndexController {

    private final UserRepository userRepository;

    @Autowired
    public IndexController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public User Index() {
        User user = new User(UUID.randomUUID().toString(), "abc");
        userRepository.save(user);
        Optional<User> userOptional = userRepository.findById(user.getId());
        return userOptional.orElse(new User("11","happy"));
    }
}
