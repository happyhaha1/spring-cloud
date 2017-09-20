package cn.kxlove.flywaydb.repositorys.impl;

import cn.kxlove.flywaydb.domain.User;
import cn.kxlove.flywaydb.repositorys.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.autoconfigure.AutoConfigurationMapper;

import java.util.Optional;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-22 13:25
 */
@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigurationMapper
@Import(MyBatisUserRepository.class)
public class MyBatisUserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void save() throws Exception {
        User user = new User();
        user.setUsername("happyhaha");
        userRepository.save(user);
        Optional<User> userOptional = userRepository.findById(user.getId());
        System.out.println(user.toString());
        System.out.println(userOptional.get().toString());
    }

    @Test
    public void findById() throws Exception {
    }

}