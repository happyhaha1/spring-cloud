package cn.kxlove.flywaydb.repositorys.mapper;

import cn.kxlove.flywaydb.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-22 13:16
 */
@Component
@Mapper
public interface UserMapper {

    void insert(@Param("user") User user);


    User findById(@Param("id") String id);
}
