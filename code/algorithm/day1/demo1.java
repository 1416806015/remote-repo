package algorithm.day1;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {

        /*需求：求是否为回文数
         *如果一个数是回文数，打印true 否则返回false
         *解释：回文数指正序和倒序读都是一样的整数
         * 例如：121 是回文数，1234 不是回文数
         */
        //从键盘输入一个数判断是否为回文数
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个整数：");
            int x = sc.nextInt();
            int temp1 = x;
            int temp2 = 0;
            while (x != 0) {
                //从右往左获取每一位数
                int ge = x % 10;
                //修改记录num的值
                x = x / 10;
                //把当前获取到的数字拼接到最右边
                temp2 = temp2 * 10 + ge;
            }
            System.out.println(temp2);
            System.out.println(temp2 == temp1);
        }
    }
}

