package com.UserLogin;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1.开发一个登陆界面

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入登录名：");
            String loginName = sc.next();
            System.out.println("请输入登录密码");
            String passWord = sc.next();
            //5.开始用登陆方法，判断是否登录成功
            boolean rs = login(loginName, passWord);
            if (rs) {
                System.out.println("登录成功~");
                break;
            } else {
                System.out.println("登录名或者密码错误，请重新输入~");

            }
        }

    }

    //2.开发一个登录方法，接受用户名和密码，返回认证的结果
    public static boolean login(String loginName, String passWord) {
        //3.准备一份正确的登录名和密码
        String okLoginName = "itemcc";
        String okPassWord = "123456";

        //4.开始判断用户是否登陆成功
        if (okLoginName.equals(loginName) && okPassWord.equals(passWord)) {
            return true;
        } else {
            return false;
        }
    }
}
