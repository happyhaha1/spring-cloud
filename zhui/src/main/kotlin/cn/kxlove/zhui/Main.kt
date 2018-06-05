package cn.kxlove.zhui

/**
 *
 * <p>Main</p>
 *
 * @author zhengkaixin
 * @since 2018-04-26 13:44
 */

//sampleStart
class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor $i")
    }
}
//sampleEnd

fun main(args: Array<String>) {
    Constructors(1)
}

