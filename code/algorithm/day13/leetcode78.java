package algorithm.day13;

import java.util.ArrayList;
import java.util.List;

public class leetcode78 {
    public static void main(String[] args) {
        Subsets solution = new Subsets();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = solution.subsets(nums);
        // 输出所有子集
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}

class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        // 用于存储所有子集的结果
        List<List<Integer>> result = new ArrayList<>();
        // 从空集开始回溯
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        // 将当前子集添加到结果中
        result.add(new ArrayList<>(tempList));
        // 从start位置开始遍历数组
        for (int i = start; i < nums.length; i++) {
            // 将当前元素加入临时子集
            tempList.add(nums[i]);
            // 递归处理下一个元素
            backtrack(result, tempList, nums, i + 1);
            // 回溯，移除最后一个元素
            tempList.remove(tempList.size() - 1);
        }
    }
}

