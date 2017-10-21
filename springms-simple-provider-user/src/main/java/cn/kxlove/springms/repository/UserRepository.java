package cn.kxlove.springms.repository;

import cn.kxlove.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>UserRepository</p>
 *
 * @author zhengkaixin
 * @since 2017-10-21 上午11:46
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
