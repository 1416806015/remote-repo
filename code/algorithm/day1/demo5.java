package algorithm.day1;

import java.util.Scanner;

public class demo5 {
    public static void main(String[] arges) {
//        需求：从键盘输入一个数，判断是否为质数
//        规则：一个整数只能被1和自身整除则就是质数
//        例如：7 = 1 * 7 ， = 1 * 8 2 * 4 合数

        //思路：写一个循环从2开始判断，一直到x-1为止
//        看在这个循环之内是否存在可以被整除的数
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个整数：");
            int x = sc.nextInt();
            //定义一个变量表示标记
            //标记着x是否为一个质数
            //true:是一个质数
            //false:不是一个质数
            boolean flag = true;
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(x + "是质数");
            } else {
                System.out.println(x + "不是质数");
            }
        }

    }
}
