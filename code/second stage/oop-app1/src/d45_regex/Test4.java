package d45_regex;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {

        // 1、public String replaceAll(String regex,String newStr)：按照正则表达式匹配的内容进行替换
        //需求1：请把古力娜扎1888迪丽热巴999aa5566马尔扎哈fsfs42425卡尔扎哈的内容进行替换
        String s1 = "古力娜扎1888迪丽热巴999aa5566马尔扎哈fsfs42425卡尔扎哈";
        System.out.println(s1.replaceAll("\\w+", "-"));

        //需求2(拓展)：某语音系统，收到一个口吃的人说的"我我我喜欢编编编编编辑编程程！"，需要优化成"我喜欢编程！"。
        String s2 = "我我我喜欢编编编编编辑编程程";
        /**
         * (.) 组：匹配任意字符的。
         * \\1 : 声明必须是重复的字
         * $1 : 可以去第1组代表的那个重复的字
         */
        System.out.println(s2.replaceAll("(.)\\1*", "$1"));

        // 2、public String[] split(String regex)：按照正则表达式匹配的内容进行分割字符串，返回一个字符串数组。
        //需求1：请把古力娜扎1888迪丽热巴999aa5566马尔扎哈fsfs42425卡尔扎巴中的人名获取出来。
        String s3 = "古力娜扎1888迪丽热巴999aa5566马尔扎哈fsfs42425卡尔扎巴";
        String[] names = s3.split("\\w+");
//        for (String name : names) {
//            System.out.println(name);
//        }
        System.out.println(Arrays.toString(names));
    }
}
