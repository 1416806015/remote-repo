package d47_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Iterator_Test {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("小米");
        c.add("上课");
        c.add("搜索");
        c.add("三数");
        System.out.println(c);

        // 1、从集合对象中获取迭代器对象
        Iterator<String> it = c.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        // 2、使用循环结合迭代器遍历
        while (it.hasNext()) {
            String ele = it.next();
            System.out.println(ele);
        }
        System.out.println("------------------------");
        for (String ele1 : c) {
            System.out.println(ele1);
        }

        System.out.println("-----------------------------");

        // default void forEach(Consumer<? super T> action):  结合Lambda表达式遍历
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(c);
            }
        });

        c.forEach((String s) -> {
            System.out.println(c);
        });

        c.forEach(s -> System.out.println(c));

        c.forEach(System.out::println);
    }
}
