package com.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //创建一个ArrayList集合
        ArrayList<String> list = new ArrayList<>();
        list.add("java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        System.out.println(list);
        //批量删除，找出包含枸杞的删除
        // [java入门, 宁夏枸杞, 黑枸杞, 人字拖, 特级枸杞, 枸杞子]
        // [java入门, 黑枸杞, 人字拖, 枸杞子]
        //出bug 应该改为
        /*for (int i = 0; i < list.size(); i++) {
            //取出当前遍历到的数据
            String ele = list.get(i);
            if (ele.contains("枸杞")) {
                list.remove(ele);
            }
        }*/
        //方法一：每次删除一个数据后，i往左退一步
       /* for (int i = 0; i < list.size(); i++) {
            //取出当前遍历到的数据
            String ele = list.get(i);
            if (ele.contains("枸杞")) {
                list.remove(ele);
                i--;
            }
        }*/
        //方法二：从集合的后面倒着遍历即可
        for (int i = list.size() - 1; i >= 0; i--) {
            //取出当前遍历到的数据
            String ele = list.get(i);
            //判断这个数据中包含枸杞
            if (ele.contains("枸杞")) {
                //从集合中删除
                list.remove(ele);
            }
        }
        System.out.println(list);

    }
}
