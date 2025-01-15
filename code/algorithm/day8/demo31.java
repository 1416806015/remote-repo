package algorithm.day8;

import java.util.ArrayList;
import java.util.List;

public class demo31 {
    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        System.out.println(summaryRanges(nums).toString());
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        int start = nums[0];  //当前区间的起始值
        int end = nums[0];   // 当前区间的结束值
        for (int i = 0; i < nums.length; i++) {
            // 如果当前元素与下一个元素连续，扩展当前区间
            if (nums[i] == end + 1) {
                end = nums[i];
            } else {
                // 如果不连续，结束当前区间，并将其添加到结果列表中
                if (start == end) {
                    result.add(Integer.toString(start));
                } else {
                    result.add(start + "->" + end);
                }
                // 开始一个新的区间
                start = nums[i];
                end = nums[i];
            }
        }
        // 添加最后一个区间
        if (start == end) {
            result.add(Integer.toString(start));
        } else {
            result.add(start + "->" + end);
        }
        return result;
    }
}
