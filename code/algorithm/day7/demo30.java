package algorithm.day7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class demo30 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入数组的长度: ");
            int length = scanner.nextInt();
            int[] nums = new int[length];
            System.out.println("请输入数组元素（用空格分隔）: ");
            for (int i = 0; i < length; i++) {
                nums[i] = scanner.nextInt();
            }
            System.out.print("请输入 k 的值: ");
            int k = scanner.nextInt();
            System.out.println(containsNearbyDuplicate(nums, k));
        }
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // 创建一个哈希表，用于存储元素及其最近一次出现的下标
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // 如果当前元素已经存在于哈希表中，且下标之差不超过 k
            if (map.containsKey(num) && i - map.get(num) <= k) {
                return true;
            }
            map.put(num, i);
        }
        return false;
    }
}
