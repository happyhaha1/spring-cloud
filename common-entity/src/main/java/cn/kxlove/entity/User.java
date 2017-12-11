package cn.kxlove.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * <p>User</p>
 *
 * @author zhengkaixin
 * @since 2017-10-21 上午11:42
 */
@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String username;

    @Column
    private String name;

    @Column
    private Short age;

    @Column
    private BigDecimal balance;
}
