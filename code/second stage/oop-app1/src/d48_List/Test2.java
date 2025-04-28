package d48_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        // 创建ArrayList并添加元素
        List<String> list = new ArrayList<>();
        list.add("糖宝宝");
        list.add("蜘蛛精");
        list.add("至尊宝");

        // (1) for循环遍历
        System.out.println("--- for循环遍历 ---");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        // (2) 迭代器遍历
        System.out.println("--- 迭代器遍历 ---");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // (3) 增强for循环(foreach遍历)
        System.out.println("--- 增强for循环遍历 ---");
        for (String s : list) {
            System.out.println(s);
        }

        // 4、JDK 1.8开始之后的Lambda表达式
        list.forEach(s -> {
            System.out.println(s);
        });
    }
}
