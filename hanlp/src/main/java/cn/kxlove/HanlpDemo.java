package cn.kxlove;

import com.hankcs.hanlp.HanLP;

/**
 * <p>HanlpDemo</p>
 *
 * @author zhengkaixin
 * @since 2017-10-25 11:05
 */
public class HanlpDemo {

    public static void main(String[] args) {
//        String[] testCase = new String[]{
//                "我在上海林原科技有限公司兼职工作，",
//                "我经常在台川喜宴餐厅吃饭，",
//                "偶尔去地中海影城看电影。",
//        };
//        Segment segment = HanLP.newSegment().enableOrganizationRecognize(true);
//        for (String sentence : testCase)
//        {
//            List<Term> termList = segment.seg(sentence);
//            System.out.println(termList);
//        }
        System.out.println(HanLP.convertToSimplifiedChinese("憑藉筆記簿型電腦寫程式HanLP"));

    }
}
