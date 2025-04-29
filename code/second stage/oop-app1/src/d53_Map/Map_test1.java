package d53_Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_test1 {
    public static void main(String[] args) {
        // 示例1：LinkedHashMap（有序、不重复、无索引）
        Map<String, Integer> map = new LinkedHashMap<>();
        // Map<String, Integer> map = new HashMap<>(); // 经典代码：按照键无序，不重复，无索引

        map.put("手表", 100);
        map.put("手表", 220); // 后面重复的数据会覆盖前面的数据（键）
        map.put("手机", 2);
        map.put("Java", 2);
        map.put(null, null); // 允许null键和null值

        System.out.println("LinkedHashMap示例：");
        System.out.println(map); // 输出顺序与插入顺序一致

        // 示例2：TreeMap（可排序、不重复、无索引）
        Map<Integer, String> map1 = new TreeMap<>();

        map1.put(23, "Java");
        map1.put(23, "MySQL"); // 键重复会覆盖值
        map1.put(19, "李四");
        map1.put(20, "王五");

        System.out.println("\nTreeMap示例：");
        System.out.println(map1); // 按键的自然顺序排序输出
    }
}
