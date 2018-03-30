package cn.kxlove.zhuishu;

import okhttp3.OkHttpClient;

import java.util.*;

/**
 * <p>ZhuiShu</p>
 *
 * @author zhengkaixin
 * @since 2017-12-05 10:40
 */
public class ZhuiShu {

    private final static OkHttpClient okHttpClient = new OkHttpClient();

    enum HappyTest{
        HA1,HA2,HA3
    }

    public static void main(String[] args) throws Exception{
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入你要下载的书");
//        String bookName = scanner.nextLine();
//
//        Request request = new Request.Builder()
//                .url(""+id+"?view=chapters")
//                .build();
//        Response response = okHttpClient.newCall(request).execute();
//
//        String result = response.body().string();
//        Map<HappyTest, Boolean> map = Collections.synchronizedMap(new EnumMap<>(HappyTest.class));
//        map.put(HappyTest.HA1,false);
//        map.put(HappyTest.HA1,true);
        List<Integer> lists = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        lists.parallelStream().forEach(System.out::println);

//        for (Map.Entry<HappyTest, Boolean> happyTestBooleanEntry : map.entrySet()) {
//            System.out.println(happyTestBooleanEntry.getKey()+":"+happyTestBooleanEntry.getValue());
//        }
    }

//    private List<>
}
