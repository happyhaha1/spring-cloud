package cn.kxlove.zhuishu;

import cn.kxlove.zhuishu.model.Chapters;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.io.FileUtils;
import org.springframework.util.StringUtils;

import java.io.File;
import java.net.URLEncoder;
import java.util.List;

/**
 * <p>FileDownloadThread</p>
 *
 * @author zhengkaixin
 * @since 2017-12-05 10:29
 */
public class FileDownloadThread extends Thread {

    private File tmp;

    private List<Chapters> chapters;

    private OkHttpClient okHttpClient = new OkHttpClient();

    public FileDownloadThread(File tmp, List<Chapters> chapters) {
        this.tmp = tmp;
        this.chapters = chapters;
    }

    @Override
    public void run() {
        super.run();
        long time = System.currentTimeMillis();
        int i = 0;
        try {
            for (Chapters chapter : chapters) {
                StringBuilder sb = new StringBuilder(chapter.getTitle() + "\n");
                String text = chapters(chapter.getLink());
                sb.append(text).append("\n");
                i++;
                FileUtils.writeStringToFile(tmp,sb.toString(),"UTF-8");
                System.out.println(tmp.getName()+"当前下载进度" + i + "/" + chapters.size());
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("消耗时间:" + (System.currentTimeMillis() - time));
    }
    private String chapters(String url) throws Exception {
        Request request = new Request.Builder()
                .url("http://chapterup.zhuishushenqi.com/chapter/"
                        + URLEncoder.encode(url))
                .build();

        Response response = okHttpClient.newCall(request).execute();

        String result = response.body().string();

        JSONObject jsonObject = JSON.parseObject(result);
        if (!StringUtils.isEmpty(jsonObject.getJSONObject("chapter").getString("body"))) {
            return jsonObject.getJSONObject("chapter").getString("body");
        } else if (!StringUtils.isEmpty(jsonObject.getJSONObject("chapter").getString("cpContent"))) {
            return jsonObject.getJSONObject("chapter").getString("cpContent");
        }
        return "";
    }
}
