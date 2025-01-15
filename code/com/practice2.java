package com;

public class practice2 {
    public static void main(String[] args) {
        //比较俩个数组是否一样，是返回true 否返回false
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {10, 20, 20};
        boolean arr = judge(arr1, arr2);
        System.out.println(arr);
    }

    public static boolean judge(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0, j = 0; i < arr1.length && j < arr2.length; i++, j++) {
            if (arr1[i] != arr2[j]) {
                return false;
            }
        }
        return true;
    }
}
