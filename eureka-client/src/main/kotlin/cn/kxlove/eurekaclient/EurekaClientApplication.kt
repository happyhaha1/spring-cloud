package cn.kxlove.eurekaclient

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class EurekaClientApplication

fun main(args: Array<String>) {
    SpringApplication.run(EurekaClientApplication::class.java, *args)
}
