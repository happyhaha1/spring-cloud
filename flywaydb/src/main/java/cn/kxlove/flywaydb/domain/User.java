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
@NoArgsConstructor
@ToString
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "select uuid()")
    private String Id;

    private String username;
}
