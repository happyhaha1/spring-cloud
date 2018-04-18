package cn.kxlove.webflux;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * <p>CityRouter</p>
 *
 * @author zhengkaixin
 * @since 2018-04-18 16:37
 */
@Configuration
public class CityRouter {

    @Bean
    public RouterFunction<ServerResponse> routerCity(CityHandler cityHandler) {
        return RouterFunctions
                .route(RequestPredicates.GET("/hello").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                        cityHandler::helloCity);
    }
}
