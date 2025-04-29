package d54_Map_traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2_entry {
    public static void main(String[] args) {
        // 1. 创建Map集合
        Map<String, Double> map = new HashMap<>();

        // 2. 添加键值对
        map.put("蜘蛛精", 169.8);
        map.put("紫霞", 165.8);
        map.put("至尊宝", 169.5);
        map.put("牛魔王", 183.6);

        // 3. 打印整个Map集合
        System.out.println(map); // {蜘蛛精=169.8, 牛魔王=183.6, 至尊宝=169.5, 紫霞=165.8}
        // map = {蜘蛛精=169.8, 牛魔王=183.6, 至尊宝=169.5, 紫霞=165.8}
        // entries = [(蜘蛛精=169.8), (牛魔王=183.6),( 至尊宝=169.5), (紫霞=165.8)]
        //                entry
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + "-->" + value);
        }
    }
}
