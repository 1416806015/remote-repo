package d54_Map_traverse;

import java.util.HashMap;
import java.util.Map;

public class Test3_Lambda {
    public static void main(String[] args) {
        // 1. 创建Map集合
        Map<String, Double> map = new HashMap<>();

        // 2. 添加键值对
        map.put("蜘蛛精", 169.8);
        map.put("紫霞", 165.8);
        map.put("至尊宝", 169.5);
        map.put("牛魔王", 183.6);

        map.forEach((k, v) -> {
            System.out.println(k + "-->" + v);
        });
    }
}
