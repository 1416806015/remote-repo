package algorithm.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leetcode118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
        List<List<Integer>> triangle = generate(numRows);
        System.out.println("生成的杨辉三角:");
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        // 创建一个二维列表，用于存储杨辉三角
        List<List<Integer>> triangle = new ArrayList<>();
        // 如果 numRows 为 0，直接返回空列表
        if (numRows == 0) {
            return triangle;
        }
        // 生成每一行
        for (int i = 0; i < numRows; i++) {
            // 创建一个新行
            List<Integer> row = new ArrayList<>();
            // 每一行的第一个元素总是 1
            row.add(1);
            // 生成中间的元素
            if (i > 0) {
                // 获取上一行
                List<Integer> prevRow = triangle.get(i - 1);
                // 计算中间的元素
                for (int j = 1; j < i; j++) {
                    row.add(prevRow.get(j - 1) + prevRow.get(j));
                }
                // 每一行的最后一个元素总是 1
                row.add(1);
            }
            // 将当前行添加到杨辉三角中
            triangle.add(row);
        }
        return triangle;
    }
}
