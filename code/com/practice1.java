package com;

public class practice1 {
    public static void main(String[] args) {

        //按这个格式输出数组的值：[10, 29, 34, 55, 66]

        int[] arr = new int[]{10, 29, 34, 55, 66};
        printArr(arr);

        int[] arr2 = null;
        printArr(arr2);
    }

    public static void printArr(int[] arr) {
        if (arr == null) {
            System.out.println(arr);
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1) {
//                System.out.print(arr[i]);
//            } else {
//                System.out.print(arr[i] + ", ");
//            }
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
}
