package d55_Map_impl;

import java.util.HashMap;
import java.util.Map;

public class Test1_HashMap {
    public static void main(String[] args) {

        Map<Student, String> map = new HashMap<>();
        map.put(new Student("蜘蛛精", 25, 168.5), "盘丝洞");
        map.put(new Student("蜘蛛精", 25, 168.5), "盘丝洞");
        map.put(new Student("紫霞", 20, 165.5), "水帘洞");
        map.put(new Student("至尊宝", 27, 167.5), "花果山");
        map.put(new Student("牛魔王", 25, 166.5), "牛头山");
        System.out.println(map);
    }
}
