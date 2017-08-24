package cn.kxlove.mybatis;

import cn.kxlove.mybatis.domain.User;
import cn.kxlove.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-22 18:49
 */
@RestController
public class IndexController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/{username}")
    public User index(@PathVariable String username) {
        User user = new User();
        user.setUserName(username);

        userMapper.insert(user);
        User byId = userMapper.findById(user.getId());
        return byId;
    }
}
