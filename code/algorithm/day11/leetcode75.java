package algorithm.day11;

import java.util.Arrays;

public class leetcode75 {
    public static void main(String[] args) {
        SortColors solution = new SortColors();
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static class SortColors {
        public void sortColors(int[] nums) {
            if (nums == null || nums.length == 0) {
                return;
            }

            int left = 0; // 红色部分的右边界
            int right = nums.length - 1; // 蓝色部分的左边界
            int current = 0; // 当前遍历的指针

            while (current <= right) {
                if (nums[current] == 0) {
                    // 如果是红色，交换到左边
                    swap(nums, current, left);
                    left++;
                    current++;
                } else if (nums[current] == 2) {
                    // 如果是蓝色，交换到右边
                    swap(nums, current, right);
                    right--;
                    // 注意：这里不移动 current，因为交换后的元素可能是 0 或 1，需要再次检查
                } else {
                    // 如果是白色，直接跳过
                    current++;
                }
            }
        }

        // 交换数组中两个元素的位置
        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
