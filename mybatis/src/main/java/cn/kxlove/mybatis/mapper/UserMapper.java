package cn.kxlove.mybatis.mapper;

import cn.kxlove.mybatis.domain.User;
import cn.kxlove.mybatis.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-22 17:46
 */
@Mapper
public interface UserMapper extends MyMapper<User> {

    @Select("select * from user where id = #{id}")
    User findById(@Param("id") Integer id);
}
