package algorithm.day9;

public class leetcode27 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(nums, val));
        int newnums = removeElement(nums, val);
        System.out.print("新数组：[");
        for (int i = 0; i < newnums - 1; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(nums[i]);
        }
        System.out.print("]");
    }

    public static int removeElement(int[] nums, int val) {
        // 记录不等于 val 的元素的个数
        int count = 0;
        // 遍历数组
        for (int i = 0; i < nums.length; i++) {
            // 如果当前元素不等于 val，将其移动到数组的前面
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        // 返回新数组的长度
        return count;
    }
}
