package cn.kxlove.eurekaclient;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-18 16:06
 */
public class FileHelper {


    public static void main(String[] args) throws Exception{
//        File file = FileUtils.getFile("/Users/zhengkaixin/Downloads/sss");
//        if (file.isDirectory()) {
//            File[] files = file.listFiles();
//            StringBuffer sb = new StringBuffer();
//            for (int i = 0; i < files.length; i++) {
//                File child = files[i];
//                System.out.println(child.getName());
//                sb.append(FileUtils.readFileToString(child, "gbk"));
//            }
//            FileUtils.writeStringToFile(new File("/Users/zhengkaixin/Downloads/sss/new.txt"),sb.toString(),"utf-8");
//        }
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//        for (Integer integer : integers) {
//            if (integer == 2) {
//                continue;
//            }
//            System.out.println(integer);
//        }

        integers.forEach(i -> {
            if (i == 2) {
                return;
            }
            System.out.println(i);
        });
    }
}
