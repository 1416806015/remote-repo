package algorithm.day7;

import java.util.HashSet;
import java.util.Set;

public class demo29 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 1};
        boolean b = containsDuplicate1(nums1);
        System.out.println(b);
        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(containsDuplicate2(nums2));
    }

    public static boolean containsDuplicate1(int[] nums) {
        //创建一个哈希集合 set，用于存储已经遍历过的元素
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // 尝试将当前元素添加到哈希集合中
            if (!set.add(num)) {
                // 如果添加失败（即元素已存在哈希表），说明数组中包含重复元素，返回 true
                return true;
            }
        }
        // 如果遍历完数组后没有发现重复元素，返回 false
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        //for增强
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
