package cn.kxlove.flywaydb.repositorys;

import cn.kxlove.flywaydb.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-22 13:15
 */
@Repository
public interface UserRepository {

    void save(User user);

    Optional<User>  findById(String id);
}
