package d37_StringJoiner;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {

        StringJoiner s=new StringJoiner(", "); // 间隔符
        StringJoiner s2=new StringJoiner(", ", "[", "]");
        s.add("java1");
        s.add("java2");
        s.add("java3");
        System.out.println(s);
        s2.add("java1");
        s2.add("java2");
        s2.add("java3");
        System.out.println(s2);
        System.out.println(getArrayData(new int[]{11, 22, 33}));
    }

    public static String getArrayData(int[] arr) {
        // 1、判断arr是否为null
        if (arr == null) {
            return null;
        }

        // 2、arr数组对象存在。格式示例：[11, 22, 33]
        StringJoiner sb = new StringJoiner(", ","[","]");
        for (int i = 0; i < arr.length; i++) {
            sb.add(arr[i] + "");
        }
        return sb.toString();
    }
}
