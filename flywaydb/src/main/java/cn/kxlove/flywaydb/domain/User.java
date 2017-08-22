package cn.kxlove.flywaydb.domain;

import lombok.*;

import javax.persistence.*;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-22 13:13
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "UUID")
    private String Id;

    private String username;
}
