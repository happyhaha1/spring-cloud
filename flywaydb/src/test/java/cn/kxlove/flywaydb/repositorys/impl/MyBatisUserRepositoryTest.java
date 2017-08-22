package cn.kxlove.flywaydb.repositorys.impl;

import cn.kxlove.flywaydb.domain.User;
import cn.kxlove.flywaydb.repositorys.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;
import java.util.UUID;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-22 13:25
 */
@RunWith(SpringRunner.class)
@MybatisTest
@Import(MyBatisUserRepository.class)
public class MyBatisUserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void save() throws Exception {
        User user = new User(UUID.randomUUID().toString(), "abc");
        userRepository.save(user);
        Optional<User> userOptional = userRepository.findById(user.getId());
        assertThat(userOptional.get(), is(user));
    }

    @Test
    public void findById() throws Exception {
    }

}