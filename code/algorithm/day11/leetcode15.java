package algorithm.day11;

import java.util.*;

public class leetcode15 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = Solution.threeSum(nums);
        System.out.println(result);
    }

    class Solution {
        public static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            if (nums == null || nums.length < 3) {
                return result;
            }
            // 用于去重的 Set  通过将三元组存入 Set，可以自动去重，确保结果中每个三元组只出现一次。
            Set<List<Integer>> set = new HashSet<>();
            //  List<Integer> 用于存储一个三元组（三个整数）。
            //  Set<List<Integer>> 表示一个存储 List<Integer> 的集合，且这个集合中的元素（即 List<Integer>）是唯一的，不会重复。

            // 三重循环枚举所有三元组
            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            // 将三元组排序后加入 Set
                            List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                            Collections.sort(triplet); // 排序
                            set.add(triplet); // 去重
                        }
                    }
                }
            }

            // 将 Set 转换为 List
            result.addAll(set);
            return result;
        }
    }
}
