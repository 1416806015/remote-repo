package d49_SetTest;

import java.util.Set;
import java.util.TreeSet;

public class SetTest1 {
    public static void main(String[] args) {

        // 1、创建一个Set集合的对象
        // Set<Integer> set = new HashSet<>(); // 无序 不重复 无索引
        // Set<Integer> set = new LinkedHashSet<>(); // 有序 不重复 无索引
        Set<Integer> set = new TreeSet<>(); // 可排序(升序) 不重复 无索引

        set.add(666);
        set.add(555);
        set.add(555);
        set.add(888);
        set.add(666);
        set.add(777);
        set.add(777);

        System.out.println(set); // 输出结果会根据Set实现类不同而不同
    }
}
