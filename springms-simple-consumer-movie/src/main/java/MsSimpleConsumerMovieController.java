import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>MsSimpleConsumerMovieController</p>
 *
 * @author zhengkaixin
 * @since 2017-10-21 下午8:12
 */
@SpringBootApplication
public class MsSimpleConsumerMovieController {


    public static void main(String[] args) {
        SpringApplication.run(MsSimpleConsumerMovieController.class,args);
        System.out.println("【【【【【【 简单电影微服务 】】】】】】已启动.");
    }
}
