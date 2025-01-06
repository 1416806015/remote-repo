package day1;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] arge) {

        /*需求：给定俩个整数，被除数和除数
         *将俩数相除，不能使用乘除法和%运算符
         * 得到商和余数
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int x1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int x2 = sc.nextInt();
        int temp;

        if (x2 == 0) {
            System.out.println("除数不能为 0！");
            return; // 结束程序
        }
        int sign = 1; // 符号位，用于处理负数
        if (x1 < 0) {
            x1 = -x1; // 将被除数转为正数
            sign = -sign; // 符号取反
        }
        if (x2 < 0) {
            x2 = -x2; // 将除数转为正数
            sign = -sign; // 符号取反
        }
//        商
        int count = 0;
        while (x1 >= x2) {
            x1 -= x2;
            count++;
        }
        int remainder = x1;
        if (sign < 0) {
            count = -count;
        }
        System.out.println("商: " + count);
        System.out.println("余数: " + remainder);
    }
}
