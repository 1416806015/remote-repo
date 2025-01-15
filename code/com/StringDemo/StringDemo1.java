package com.StringDemo;

public class StringDemo1 {
    public static void main(String[] args) {
        String s = "李华Java";
        System.out.println(s.length());

        // 提取字符串中某个索引位置处的字符
        char c = s.charAt(1);
        System.out.println(c);
        //字符串的遍历
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch);
        }
        System.out.println("---------------------------");
        //把字符串转成字符数组，再进行遍历
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        //判断字符串内容一样就返回true
        String s1 = new String("哈哈");
        String s2 = new String("哈哈");
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true
        System.out.println("---------------------------");
        //忽略大小写比较内容是否一样
        String c1 = "223Ddsf";
        String c2 = "223DdsF";
        System.out.println(c1.equals(c2));
        System.out.println(c1.equalsIgnoreCase(c2));
        
    }
}
