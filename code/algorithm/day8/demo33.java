package algorithm.day8;

import java.util.Arrays;

public class demo33 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int[] result = moveZeroes(nums);
        //System.out.println(result);
        //[I@10f87f48  输出数组的哈希码 需要使用 Arrays.toString() 方法
        System.out.println(Arrays.toString(result));
    }

    public static int[] moveZeroes(int[] nums) {
        // 指向当前非零元素应该存放的位置
        int left = 0;
        // 将非零元素移动到数组的前面
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
        }
        // 将剩余位置置为 0
        for (int i = left; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}
