package d42_arrays;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class ArraysTest1 {
    public static void main(String[] args) {

        // 1、public staticString toString(类型[]arr):返回数组的内容
        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(arr));

        //2、public static int[]copyOfRange(类型[]arr，起始索引，结束索引)：拷贝数组（指定范围，包前不包后）
        int[] arr2 = Arrays.copyOfRange(arr, 1, 4);
        System.out.println(Arrays.toString(arr2));

        // 3、public static copyof(类型[]arr,intnewLength):拷贝数组，可以指定新数组的长度。
        int[] arr3 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arr3));

        //4、public static setAll(double[]array，IntToDoubleFunctiongenerator):把数组中的原数据改为新数据又存进去。
        double[] prices = {99.8, 128, 100};
        //                  0    1    2
        // 把所有的价格都打八折，然后又存进去
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                // value = 0 1 2
                return prices[value] * 0.8;
            }
        });
        System.out.println(Arrays.toString(prices));
        //5、public static void sort(类型[]arr):对数组进行排序(默认是升序排序)
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));
    }
}
