package cn.kxlove.flywaydb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-22 13:12
 */
@SpringBootApplication
@MapperScan(basePackages = "cn.kxlove.flywaydb.repositorys.mapper")
public class FlywaydbApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlywaydbApplication.class,args);
    }
}
