package day2;

import java.util.Random;
import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
//        需求：随机生成一个1-100之间的数据，提示用户猜测，
//        猜大提示过大，猜小提示过小，直到猜中结束游戏。
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        while (true) {
            System.out.println("请猜一个数字：");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            if (num == x) {
                System.out.println("恭喜你猜到了：" + num);
                break;
            } else if (x > num) {
                System.out.println("你猜的数过大");

            } else {
                System.out.println("你猜的数字过小");
            }
        }
    }
}
