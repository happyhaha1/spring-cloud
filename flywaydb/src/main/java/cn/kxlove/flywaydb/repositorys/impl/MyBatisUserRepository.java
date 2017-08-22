package cn.kxlove.flywaydb.repositorys.impl;

import cn.kxlove.flywaydb.domain.User;
import cn.kxlove.flywaydb.repositorys.UserRepository;
import cn.kxlove.flywaydb.repositorys.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-22 13:21
 */
@Repository
public class MyBatisUserRepository implements UserRepository{

    private final UserMapper userMapper;

    @Autowired
    public MyBatisUserRepository(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }

    @Override
    public Optional<User> findById(String id) {
        return Optional.ofNullable(userMapper.findById(id));
    }
}
