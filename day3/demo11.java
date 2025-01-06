package day3;

import java.util.Scanner;

public class demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请输入一个4位整数：");
            int num = sc.nextInt();
            System.out.println("加密后的密码：" + encrypt(num));
        }
    }

    public static String encrypt(int number) {
        //把这个密码拆分成一个个数字
        int[] numbers = split(number);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] + 5) % 10;
        }
        //对数组反转
        reverse(numbers);
        //返回结果
        String data = "";
        for (int i = 0; i < numbers.length; i++) {
            data += numbers[i];
        }
        return data;
    }

    public static int[] split(int number) {
        //1983
        int[] numbers = new int[4];
        numbers[0] = number / 1000;
        numbers[1] = (number / 100) % 10;
        numbers[2] = (number / 10) % 10;
        numbers[3] = number % 10;
        return numbers;
    }

    public static void reverse(int[] numbers) {
        //反正数组
        int temp;
        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
            //交换i和j位置处的值
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

    }
}
