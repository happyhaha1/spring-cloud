package cn.kxlove.zhuishu.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>SearchServiceTest</p>
 *
 * @author zhengkaixin
 * @since 2017-11-29 13:46
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SearchServiceTest {
    @Test
    public void getChapters() throws Exception {
//        List<Chapters> chapters = searchService.getChapters("577b85e0ccb7bf00499d0798");
//        searchService.download(chapters);
        System.out.println(System.getProperty("user.home"));
    }


    @Autowired
    private SearchService searchService;

    @Test
    public void search() throws Exception {
        String sdfasd = searchService.search("神级仙医");
        System.out.println(sdfasd);
    }

    @Test
    public void chapters() throws Exception {
//        String content = searchService.chapters();
//        content = content.replace("\n","\n    ");
//        String[] split = content.split("\n");
//        Integer witdh = 345;
//        Integer height = 655;
//        Integer line_txt_num = witdh / (3+18);
//        Double max_hang_num_double = (height / (18*1.5));
//        int max_hang_num = max_hang_num_double.intValue();
//        List<String> list = Lists.newArrayList();
//        for (String s : split) {
////            System.out.println(s);
//            if (s.length() > line_txt_num) {
//                int count = (s.length() / line_txt_num) + 1;
//                for (int i = 0; i < count; i++) {
//                    int end = (i+1) * line_txt_num;
//                    if (i == count - 1) {
//                        if (s.length() % line_txt_num == 0) {
//                            continue;
//                        }
//                        end = s.length() - 1;
//                    }
//                    String line = s.substring(i * line_txt_num, end);
//                    list.add(line);
//                }
//            }else {
//                list.add(s);
//            }
////            list.add()
//        }
//        for (String s : list) {
//            if (!StringUtils.isEmpty(s)) {
//                System.out.println(s);
//            }
//        }

    }

    public void test() throws Exception {
//        String contetn = "浩瀚宇宙某个偏僻星域中，一点朦胧金光以某种固定速度在漆黑星空中徐徐飞行着，并不时从中传出阵阵啼鸣之声，若断若续，若有若无，仿佛泣血之音，又如九幽狞笑。 不知过了多少年后，前方蓦然出现一颗蔚蓝色巨大星球。 “轰”的一声巨响！ 金光在星球引力作用下，以惊人速度向巨大星球直冲而去，并在接触星球表面大气的瞬间，化为一团汹汹燃烧流星，向下方一片海域坠落而去。 …… 大齐天元九年，有灵官上禀朝廷，有天外异物落入东海之内，化为滔天巨浪淹没二十余岛屿，越府沿海数县被巨浪波及，毁房屋万间，百姓家畜死伤无数——《东洲记》 浩瀚宇宙某个偏僻星域中，一点朦胧金光以某种固定速度在漆黑星空中徐徐飞行着，并不时从中传出阵阵啼鸣之声，若断若续，若有若无，仿佛泣血之音，又如九幽狞笑。 不知过了多少年后，前方蓦然出现一颗蔚蓝色巨大星球。 “轰”的一声巨响！ 金光在星球引力作用下，以惊人速度向巨大星球直冲而去，并在接触星球表面大气的瞬间，化为一团汹汹燃烧流星，向下方一片海域坠落而去。 …… 大齐天元九年，有灵官上禀朝廷，有天外异物落入东海之内，化为滔天巨浪淹没二十余岛屿，越府沿海数县被巨浪波及，毁房屋万间，百姓家畜死伤无数——《东洲记》 (本章完)";

    }
}