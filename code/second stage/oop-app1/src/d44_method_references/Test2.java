package d44_method_references;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String[] names = {"boby", "angela", "Andy", "dlei", "caocao", "Babo", "jack", "Cici"};

        //进行排序（默认是按照字符串的首字符编号进行升序排序的）
        // Arrays.sort(names);
        //要求忽略首字符大小写进行排序。
//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                // 制定规则：o1 = "Andy"  o2 = "angerla”
//                return o1.compareToIgnoreCase(o2);
//            }
//        });

        // Arrays.sort(names,(o1, o2) -> o1.compareToIgnoreCase(o2));
        // 特定类型的引用
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));
    }
}
