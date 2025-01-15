package algorithm.day2;

import java.util.Scanner;

public class demo10 {
    public static void main(String[] args) {
        System.out.println("当前选手得分是：" + getAverageScore(6));
    }

    public static double getAverageScore(int number) {
        int[] scores = new int[number];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请第" + (i + 1) + "位评委打分：");
            int score = sc.nextInt();
            scores[i] = score;
        }
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            sum += scores[i];
            if (max < score) {
                max = score;
            } else if (min > score) {
                min = score;
            }
        }
        return 1.0 * (sum - max - min) / (number - 2);
    }
}
