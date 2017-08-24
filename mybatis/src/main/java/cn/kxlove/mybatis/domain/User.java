package cn.kxlove.mybatis.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-22 17:45
 */
@Data
public class User {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "user_name")
    private String userName;
}
