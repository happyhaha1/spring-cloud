package cn.kxlove.mybatis;

import cn.kxlove.mybatis.domain.User;
import cn.kxlove.mybatis.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-22 18:37
 */
@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserMapperTest {


    @Autowired
    private UserMapper userMapper;


    @Test
    public void test() {
       User user = new User();
       user.setUserName("happy");
       userMapper.insert(user);
    }
}
