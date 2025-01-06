package day2;


import java.util.Random;
import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        int[] codes = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个员工工号：");
            int job = sc.nextInt();
            codes[i] = job;
        }
        System.out.print("原来的顺序：");
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + " ");
        }
        Random r = new Random();
        for (int i = 0; i < codes.length; i++) {
            //每遍历到的一个数据，都随机一个数组索引范围内的值，然后让当前遍历的数据与该索引位置的值互换
            int index = r.nextInt(codes.length);
            //定义一个临时变量记录index的值
            int temp = codes[index];
            //把i位置处的值赋值给index位置处
            codes[index] = codes[i];
            //把index位置原来的值赋值给i位置处
            codes[i] = temp;
        }
        System.out.println();
        System.out.print("随机后的顺序：");
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + " ");
        }
    }
}
