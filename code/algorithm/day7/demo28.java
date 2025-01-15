package algorithm.day7;

import java.util.Scanner;

public class demo28 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个数：");
            int n = scanner.nextInt();
            System.out.println(isUgLy(n));
        }

    }

    public static boolean isUgLy(int n) {
        if (n <= 0) {
            return false;   //丑数必须是正整数
        }
        while (n > 1) {
            if (n % 5 == 0) {
                n = n / 5;
            } else if (n % 3 == 0) {
                n = n / 3;
            } else if (n % 2 == 0) {
                n = n / 2;
            } else {
                return false;
            }
        }
        return n == 1;
    }
}
