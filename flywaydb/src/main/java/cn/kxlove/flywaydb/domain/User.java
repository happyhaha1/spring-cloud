package cn.kxlove.flywaydb.domain;

import lombok.*;

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
public class User {

    private String Id;

    private String username;
}
