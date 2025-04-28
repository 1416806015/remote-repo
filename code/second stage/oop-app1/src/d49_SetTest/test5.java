package d49_SetTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test5 {
    public static void main(String[] args) {
        /**
         * 目标：理解集合的并发修改异常问题，并解决。
         */

        List<String> list = new ArrayList<>();
        list.add("王麻子");
        list.add("小李子");
        list.add("李爱花");
        list.add("张全蛋");
        list.add("晓李");
        list.add("李玉刚");
        System.out.println(list); // [王麻子，小李子，李爱花，张全蛋，晓李，李玉刚]

//        // 需求：找出集合中全部带"李"的名字，并从集合中删除
//        并发修改异常!!!!
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String name = it.next();
//            if (name.contains("李")) {
//                list.remove(name);  // 这里会导致并发修改异常
//            }
//        }
//        System.out.println(list);

        //需求：找出集合中全部带"李”的名字，并从集合中删除。
        // 修改后避免并发修改异常
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.contains("李")) {
                //list.remove(name);//并发修改异常的错误。
                it.remove();//删除迭代器当前遍历到的数据，每删除一个数据后，相当于也在底层做了i--
                System.out.println(list);
            }
        }
    }
}
