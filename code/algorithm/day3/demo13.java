package algorithm.day3;

import java.util.Random;
import java.util.Scanner;

public class demo13 {
    public static void main(String[] args) {
        int[] moneys = {9, 66, 188, 520, 99999};
        start(moneys);
    }

    public static void start(int[] moneys) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.print("请您输入任意内容进行抽奖：");
            sc.next();
            while (true) {
                int index = r.nextInt(moneys.length);
                int money = moneys[index];
                if (money != 0) {
                    System.out.println("恭喜你，您抽中了红包：" + money);
                    moneys[index] = 0;
                    break;
                }
            }
        }
        System.out.println("活动结束！");

    }
}
