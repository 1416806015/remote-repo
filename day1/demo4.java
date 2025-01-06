package day1;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
//        需求：键盘录入一个大于等于2的整数x，计算并返回x的平方根。
//        结果只保留整数部分，小数部分舍去
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于2的整数");
        int x = sc.nextInt();
        if (x < 2) {
            System.out.println("输入的整数必须大于等于2");
            return;
        }
        //暴力枚举法
//        int result = 0;
//        for (int i = 1; i <= x; i++) {
//            if (i * i <= x) {
//                result = i;
//            } else {
//                break;
//            }
//        }
//        System.out.println("平方根是：" + result);

        //二分查找法
        int left = 1;
        int right = x;
        int result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2; // 中间值
            if (mid <= x / mid) { // 避免 mid * mid 溢出
                left = mid + 1;
                result = mid; // 更新结果
            } else {
                right = mid - 1;
            }
        }
        System.out.println(x + " 的平方根是: " + result);
    }
}
