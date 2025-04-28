package d50_parameter;

import java.util.Arrays;

//   可变参数
public class ParamTest {
    public static void main(String[] args) {
        // 特点：
        test();  // 不传数据给他
        test(10); //传1个数据
        test(10, 20, 30); //传多个数据
        test(new int[]{10, 20, 30}); //传1个数组

    }

    //注意： 一个形参列表中，只能有一个可变参数
    //      可变参数必须放在形参列表的最后面
    public static void test(int... nums) {
        // 可变参数在方法内部，本质就是一个数组
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println("----------------------");
    }
}
