package cn.kxlove.zhuishu.service;

import cn.kxlove.zhuishu.model.Chapters;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URLEncoder;
import java.util.List;

/**
 * <p>SearchService</p>
 *
 * @author zhengkaixin
 * @since 2017-11-29 13:43
 */
@Service
@Slf4j
public class SearchService {

    private final RestTemplate restTemplate;

    private final OkHttpClient okHttpClient;

    @Autowired
    public SearchService(RestTemplate restTemplate, OkHttpClient okHttpClient) {
        this.restTemplate = restTemplate;
        this.okHttpClient = okHttpClient;
    }

    public String search(String query) throws Exception{
        String result = restTemplate.getForEntity("http://api.zhuishushenqi.com/book/fuzzy-search?query=" + URLEncoder.encode(query, "UTF-8"), String.class).getBody();
        JSONObject jsonObject = JSON.parseObject(result);
        return jsonObject.getString("books");
    }

//    public String chapters(String url) throws Exception{
//        Request request = new Request.Builder()
//                .url("http://chapterup.zhuishushenqi.com/chapter/"
//                                +URLEncoder.encode(url))
//                .build();
//        Response response = okHttpClient.newCall(request).execute();
//
//        String result = response.body().string();
//
//        JSONObject jsonObject = JSON.parseObject(result);
//        if (!StringUtils.isEmpty(jsonObject.getJSONObject("chapter").getString("body"))) {
//            return jsonObject.getJSONObject("chapter").getString("body");
//        }else if (!StringUtils.isEmpty(jsonObject.getJSONObject("chapter").getString("cpContent"))) {
//            return jsonObject.getJSONObject("chapter").getString("cpContent");
//        }
//        return "";
//    }

    public List<Chapters> getChapters(String id) throws Exception {
        Request request = new Request.Builder()
                .url("http://api.zhuishushenqi.com/atoc/"+id+"?view=chapters")
                .build();
        Response response = okHttpClient.newCall(request).execute();

        String result = response.body().string();

        JSONObject jsonObject = JSON.parseObject(result);
        return jsonObject.getJSONArray("chapters").toJavaList(Chapters.class);
    }

//    public void download(List<Chapters> chapters) throws Exception {
//        long time = System.currentTimeMillis();
//        int i = 0;
//        FileOutputStream fileOutputStream = new FileOutputStream(new File( System.getProperty("user.home")+"/Downloads/a.txt"));
//        for (Chapters chapter : chapters) {
//            StringBuilder sb = new StringBuilder(chapter.getTitle()+"\n");
////            String text = chapters(chapter.getLink());
////            sb.append(text+"\n");
//            fileOutputStream.write(sb.toString().getBytes());
//            i++;
//            log.info("当前下载进度"+i+"/"+chapters.size());
//        }
//        fileOutputStream.close();
//        System.out.println("消耗时间:"+(System.currentTimeMillis()-time));
//    }

    Thread filetmpThread = new Thread(
            () -> {

            }
    );
}
