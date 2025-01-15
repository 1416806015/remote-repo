package algorithm.day6;

public class demo25 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        bubbleSort(nums1);
        printArray(nums1);
    }

    // 合并方法
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 将 nums2 的元素放入 nums1
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
    }

    // 冒泡排序
    public static void bubbleSort(int[] nums1) {
        int temp = 0;
        for (int i = 0; i < nums1.length - 1; i++) {
            for (int j = 0; j < nums1.length - 1 - i; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }
        }
    }

    // 打印数组
    public static void printArray(int[] nums1) {
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}