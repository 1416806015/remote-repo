package algorithm.day4;

import java.util.Random;
import java.util.Scanner;

public class demo15 {
    public static void main(String[] args) {
        while (true) {
            int[] userNumbers = userSelectNumbers();
            System.out.println("您投注的号码：");
            printArray(userNumbers);
            System.out.println();
            int[] luckNumbers = createLuckNumbers();
            System.out.println("中奖号码：");
            printArray(luckNumbers);
            System.out.println();
            judge(userNumbers, luckNumbers);
            System.out.println("------------------------------------");
        }
    }

    //设计一个方法，用于用户投注一组号码并返回（前6个红球，最后一个蓝球），并返回用户投注的号码
    public static int[] userSelectNumbers() {
        int[] numbers = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length - 1; i++) {
            while (true) {
                //开始让用户为当前位置投注一个红球号码（1-33）不能重复
                System.out.println("请输入第" + (i + 1) + "个红球号码（不能重复）");
                int number = sc.nextInt();
                //先判断红球号码是否在1-33之间
                if (number < 1 || number > 33) {
                    System.out.println("对不起，您的输入的红球号码不在1-33之间，请重新输入：");
                } else {
                    //接着判断是否重复,不重复才可以使用
                    if (exist(numbers, number)) {
                        System.out.println("对不起，当前输入的号码和之前的号码重复了，请重新输入：");
                    } else {
                        numbers[i] = number;
                        break;
                    }
                }
            }
        }
        while (true) {
            System.out.println("请您输入最后一个蓝球号码（1-16）");
            int number = sc.nextInt();
            if (number < 1 || number > 16) {
                System.out.println("对不起，您的输入的蓝球号码不在1-16之间，请重新输入:");
            } else {
                numbers[6] = number;
                break;
            }
        }
        return numbers;
    }

    //判断是否重复
    private static boolean exist(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                break;
            }
            if (numbers[i] == number) {
                return true;
            }
        }
        return false;
    }

    //系统随机 一组号码并返回（前6个红球，最后一个蓝球），并返回这组中奖号码
    public static int[] createLuckNumbers() {
        Random r = new Random();
        int[] luckNumbers = new int[7];
        for (int i = 0; i < luckNumbers.length - 1; i++) {
            while (true) {
                int redNumber = r.nextInt(33) + 1;
                //判断这个号码是否之前出现过
                if (!exist(luckNumbers, redNumber)) {
                    //redNumber不重复
                    luckNumbers[i] = redNumber;
                    break;//结束死循环，代表找到了当前这个位置的一个不重复的红球号码
                }
            }
        }
        luckNumbers[6] = r.nextInt(16) + 1;
        return luckNumbers;
    }

    //传入俩组号码判断是否中奖
    public static void judge(int[] userNumbers, int[] luckNumbers) {
        // userNumbers = [11, 12, 13, 14, 15, 16, 10]
        // luckNumbers = [12, 11, 14, 13, 16, 15, 10]
        // 分别定义2个变量用于记住红球命中几个，篮球命中几个
        int redCount = 0;
        int blueCount = 0;
        // 先判断红球命中的数量
        // 遍历用户投注的号码前6个红球
        for (int i = 0; i < userNumbers.length - 1; i++) {
            // 开始遍历中奖号码的前6个红球号码，看用户号码命中了几个
            for (int j = 0; j < luckNumbers.length - 1; j++) {
                if (userNumbers[i] == luckNumbers[j]) {
                    redCount++;
                    break;
                }
            }
        }
        // 判断篮球是否命中
        blueCount = userNumbers[6] == luckNumbers[6] ? 1 : 0;
        System.out.println("您命中的红球数量是：" + redCount);
        System.out.println("您命中的篮球数量是：" + blueCount);
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你中了一等奖：奖金1000万，可以开始享受人生了~~~");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你中了二等奖：奖金500万，可以开始享受人生了~~~");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你中了三等奖：奖金3000元");
        } else if ((redCount == 5 && blueCount == 0) || redCount == 4) {
            System.out.println("恭喜你中了四等奖：奖金200元");
        } else if ((redCount == 3 && blueCount == 1) || (redCount == 2 && blueCount == 1)) {
            System.out.println("恭喜你中了五等奖：奖金10元");
        } else if ((redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜你中了六等奖：奖金5元");
        } else {
            System.out.println("感谢您对福利事业做出的巨大贡献~~~");
        }

    }

    //打印
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.print("]");
    }
}
