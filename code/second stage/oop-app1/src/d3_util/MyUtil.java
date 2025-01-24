package d3_util;

import java.util.Random;

public class MyUtil     {

    //私有化
    private MyUtil(){

    }

    public static String createCode(int n  ){
        // 1、定义2个变量 一个记住最终产生的随机验证码 一个记住可能用到的全部字符
        String code="";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLNMOPQRSTUVWXYZ";
        Random r=new Random();
        for (int i = 0; i < n; i++) {
            int index=r.nextInt(data.length());
            code+=data.charAt(index);
        }
        return code;
    }
}
