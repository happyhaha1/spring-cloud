package cn.kxlove.eurekaserver;

import org.junit.Test;

/**
 * @author zhengkaixin
 * @Description:
 * @Date 2017-08-24 09:59
 */
public class File {


    @Test
    public void test(){
//        FileReader fr = new FileReader()
        String batchNo = "2017-07-26-玛瑙湾-12个月-02";
        String[] split = batchNo.split("-");
        String str = split[split.length - 2];
        str=str.trim();
        String str2="";
        if(!"".equals(str)){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>=48 && str.charAt(i)<=57){
                    str2+=str.charAt(i);
                }
            }
        }
        System.out.println(str2);
    }
}
