package day2;

import java.util.Scanner;

public class demo8 {
    public static void main(String[] args) {
        //买飞机票 机票按照季节、头等舱、经济舱的情况进行优惠
        //方案如下：5-10月为旺季，头等舱9折；11月到来年4月为淡季，头等舱7折、经济舱6.5折

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入机票原价: ");
            double OrignalPrice = sc.nextDouble();
            System.out.print("请输入月份 (1-12): ");
            int Moth = sc.nextInt();
            System.out.print("请输入舱位类型 (头等舱/经济舱): ");
            String Mold = sc.next();
            double price = calculate(OrignalPrice, Moth, Mold);
            System.out.println("最终价格为: " + price);
        }
    }

    public static double calculate(double OrignalPrice, int Moth, String Mold) {
        if (Moth >= 5 && Moth <= 10) {
            System.out.println("当前为旺季:");
            switch (Mold) {
                case "头等舱":
                    OrignalPrice *= 0.9;
                    break;
                case "经济舱":
                    OrignalPrice *= 0.85;
                    break;
            }
        } else {
            switch (Mold) {
                case "头等舱":
                    OrignalPrice *= 0.7;
                    break;
                case "经济舱":
                    OrignalPrice *= 0.65;
                    break;
            }
        }
        return OrignalPrice;
    }
}
