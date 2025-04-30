package d55_Map_impl;

import java.util.HashMap;
import java.util.Map;

public class Test2LinkedHashMap {
    public static void main(String[] args) {
        // Map<String, Integer> map = new LinkedHashMap<>();
        Map<String, Integer> map = new HashMap<>(); // 经典代码：按照键无序，不重复，无索引

        map.put("手表", 100);
        map.put("手表", 220); // 后面重复的数据会覆盖前面的数据（键）
        map.put("手机", 2);
        map.put("Java", 2);
        map.put(null, null); // 允许null键和null值
        System.out.println(map);
    }
}
