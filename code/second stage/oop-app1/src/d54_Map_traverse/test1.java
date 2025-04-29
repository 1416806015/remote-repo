package d54_Map_traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test1 {
    public static void main(String[] args) {

        /*
             键找值的遍历方式
        */

        // 准备一个Map集合
        Map<String, Double> map = new HashMap<>();

        // 向Map中添加键值对（注意："蜘蛛精"的值会被覆盖）
        map.put("蜘蛛精", 162.5);
        map.put("蜘蛛精", 169.8); // 重复键会覆盖前值
        map.put("紫霞", 165.8);
        map.put("至尊宝", 169.5);
        map.put("牛魔王", 183.6);

        // 打印整个Map集合
        System.out.println(map); // 输出: {蜘蛛精=169.8, 牛魔王=183.6, 至尊宝=169.5, 紫霞=165.8}

        // 1. 获取Map集合的全部键（返回Set集合）
        Set<String> keys = map.keySet();
        System.out.println("所有键: " + keys); // 输出: [蜘蛛精, 牛魔王, 至尊宝, 紫霞]

        // 2. 遍历全部的键，根据键获取对应的值
        System.out.println("\n键值对遍历结果:");
        for (String key : keys) {
            // 根据键获取对应的值
            double value = map.get(key);
            System.out.println(key + " ====> " + value);
        }
    }
}
