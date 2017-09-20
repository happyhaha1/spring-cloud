package cn.kxlove.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * <p>TranslationService</p>
 *
 * @author zhengkaixin
 * @since 2017-09-20 16:29
 */
@ShellComponent
public class TranslationCommands {

    @ShellMethod("say hello world")
    public String hello() {
       return "hello world";
    }
}
