package cn.kxlove.shell;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.shell.jline.PromptProvider;

/**
 * <p>ShellApplication</p>
 *
 * @author zhengkaixin
 * @since 2017-09-20 16:19
 */
@SpringBootApplication
public class ShellApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShellApplication.class,args);
    }

    @Bean
    public PromptProvider myPromptProvider() {
        return () -> new AttributedString("my-shell:>", AttributedStyle.DEFAULT.foreground(AttributedStyle.YELLOW));
    }
}
