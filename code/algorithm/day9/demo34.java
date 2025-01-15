package algorithm.day9;

import java.util.Scanner;

public class demo34 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入一个整数: ");
            int x = scanner.nextInt();
            System.out.println(isPowerOfThree(x));
        }
    }

    public static boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        // 循环将 n 除以 3
        while (n % 3 == 0) {
            n /= 3;
        }
        // 如果最终 n 等于 1，说明是 3 的幂次方
        return n == 1;
    }
}
