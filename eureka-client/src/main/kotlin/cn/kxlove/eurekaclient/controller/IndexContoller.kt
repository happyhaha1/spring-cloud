package cn.kxlove.eurekaclient.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @Description:
 * @author zhengkaixin
 * @Date 2017-08-15 18:55
 */
@RestController
class MainController {

    @Value("\${words}")var word: String=""

    @GetMapping("/")
    fun Index(): String {
        val split = word.split(",")
        val i = Math.round(Math.random() * (split.size - 1))
        return split[i.toInt()]
    }
}