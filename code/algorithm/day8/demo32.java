package algorithm.day8;

public class demo32 {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println("缺失的数为：" + missNumber(nums));
    }

    public static int missNumber(int[] nums) {
        // 计算 [0, n] 范围内所有数字的和
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        // 计算数组 nums 中所有数字的和
        int numsSum = 0;
        for (int i = 0; i < nums.length; i++) {
            numsSum += nums[i];
        }
        return sum - numsSum;
    }

}
