package cn.kxlove.zhui

import com.alibaba.fastjson.JSON
import com.mzlion.core.json.TypeRef
import com.mzlion.easyokhttp.HttpClient
import java.io.File
import java.io.FileOutputStream
import java.net.URLEncoder
import java.util.*

/**
 *
 * <p>ZhuiMain</p>
 *
 * @author zhengkaixin
 * @since 2017-12-11 下午7:20
 */
fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    println("请输入搜索的书籍或作者")
//    while (scanner.hasNext()) {
    val keyword = scanner.next()
    val search = search(keyword)
    search?.withIndex()?.forEach { (index, value) ->
        println("$index: $value")
    }
    println("输入你想要的书")
    var select = scanner.next()

    val book = search?.get(select.toInt())
    if (book != null) {
        val atocs = atoc(book._id)
        atocs.withIndex().forEach { (index, value) ->
            println("$index: $value")
        }
        println("输入你想要的源")
        select = scanner.next()
        val atoc = atocs[select.toInt()]
        val chapters = chapters(atoc._id)
        chapters?.subList(0,1)
        val file = File("/Users/zhengkaixin/Desktop/java/${book.title}.txt")
        val fileOutputStream = FileOutputStream(file)
        chapters?.withIndex()?.forEach {
            (index,it) ->
            val chapterContent = chapterContent(atocs,it,select = select.toInt())
            val content = it.title + "\n" + chapterContent + "\n"
            fileOutputStream.write(content.toByteArray(Charsets.UTF_8))
            println("下载进度$index/${chapters.size}")
        }
        fileOutputStream.close()
    }
}

fun search(keyword: String): List<Book>? {
    val URL = "http://api.zhuishushenqi.com/book/fuzzy-search"
    val result = HttpClient
            .get(URL)
            .queryString("query",keyword)
            .execute()
            .asBean(ApiResult::class.java)
    return result.books
}

fun atoc(_id: String): List<Atoc> {
    val URL = "http://api.zhuishushenqi.com/atoc"
    val result = HttpClient
            .get(URL)
            .queryString("view","summary")
            .queryString("book",_id)
            .execute()
            .asBean(object: TypeRef<List<Atoc>>() {})
    return result
}

fun chapters(_id: String): List<Chapter>? {
    val URL = "http://api.zhuishushenqi.com/atoc/$_id"
    val result = HttpClient
            .get(URL)
            .queryString("view","chapters")
            .execute()
            .asBean(ChapterResult::class.java)
    return result.chapters
}

fun chapterContent(atocs: List<Atoc>,chapter: Chapter,select: Int): String {
    try {
        val link = URLEncoder.encode(chapter.link,"utf-8")
        val URL = "http://chapterup.zhuishushenqi.com/chapter/$link"
        val result = HttpClient
                .get(URL)
                .queryString("view","chapters")
                .execute()
                .asString()
        val jsonObject = JSON.parseObject(result).getJSONObject("chapter")
        return if (!jsonObject.getString("body").isNullOrEmpty()) {
            jsonObject.getString("body")
        }else if (!jsonObject.getString("cpContent").isNullOrEmpty()) {
            jsonObject.getString("cpContent")
        } else {
            println(jsonObject)
            val atoc = atocs[select+1]
            val chapters = chapters(atoc._id)
            chapters?.forEach { it ->
                if (it.title == chapter.title) {
                    return chapterContent(atocs, it, select+1)
                }
            }
            throw RuntimeException()
        }
    }catch (e: Exception) {
        println(chapter.title)
    }
    return ""
}

class ApiResult {
    var books: List<Book>? = null
}
class  ChapterResult {
    var chapters: List<Chapter>? = null
}

data class Book(val _id: String, val title: String, val author: String)
data class Atoc(val _id: String, val lastChapter: String, val name: String, val updated: Date)
data class Chapter(val title: String, val link: String)



