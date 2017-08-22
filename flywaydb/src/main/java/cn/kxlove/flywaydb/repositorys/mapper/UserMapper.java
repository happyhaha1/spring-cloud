package cn.kxlove.flywaydb.repositorys.mapper;

import cn.kxlove.flywaydb.MyMapper;
import cn.kxlove.flywaydb.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-22 13:16
 */
@Component
public interface UserMapper extends MyMapper<User> {

}
