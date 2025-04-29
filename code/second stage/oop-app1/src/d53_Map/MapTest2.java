package d53_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
    public static void main(String[] args) {

        // 1. 创建HashMap并添加元素（无序、不重复、无索引）
        Map<String, Integer> map = new HashMap<>();

        map.put("手表", 100);
        map.put("手表", 220);  // 重复键会覆盖前值
        map.put("手机", 2);
        map.put("Java", 2);    // 值可以重复
        map.put(null, null);   // 允许null键和null值

        System.out.println(map);  // 输出: {null=null, 手表=220, Java=2, 手机=2}

        // 2. 常用方法演示
        System.out.println("\n===== HashMap常用方法 =====");

        // public int size()：获取集合大小
        System.out.println("集合大小: " + map.size());  // 4

        // public boolean isEmpty()：判断是否为空
        System.out.println("集合是否为空: " + map.isEmpty());  // false

        // public V get(Object key)：根据键获取值
        System.out.println("获取'手表'的值: " + map.get("手表"));  // 220

        // public V remove(Object key)：根据键删除元素
        System.out.println("删除'Java': " + map.remove("Java"));  // 返回被删除的值: 2
        System.out.println("删除后集合: " + map);  // {null=null, 手表=220, 手机=2}

        // public boolean containsKey(Object key)：判断是否包含键
        System.out.println("是否包含'手机': " + map.containsKey("手机"));  // true

        // public boolean containsValue(Object value)：判断是否包含值
        System.out.println("是否包含值220: " + map.containsValue(220));  // true

        // public Set<K> keySet()：获取所有键的集合
        Set<String> keys = map.keySet();
        System.out.println("所有键: " + keys);  // [null, 手表, 手机]

        // public Collection<V> values(); 获取Map集合的全部值
        Collection<Integer> values = map.values();
        System.out.println("values = " + values);

        // 把其他Map集合的数据倒入自己的Map集合
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("java1", 10);
        map1.put("java2", 20);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("java3", 30);
        map2.put("java2", 222);
        map1.putAll(map2); // putAll  把map2集合的数据倒入map1集合
        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        // public void clear()：清空集合
//        map.clear();
//        System.out.println("清空后集合: " + map);  // {}
//        System.out.println("清空后是否为空: " + map.isEmpty());  // true
    }
}
