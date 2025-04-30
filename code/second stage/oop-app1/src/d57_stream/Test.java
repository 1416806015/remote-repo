package d57_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "张无忌", "周芷若", "赵敏", "小强");
        System.out.println(names);

        List<String> list = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("张") && name.length() == 3) {
                list.add(name);
            }
        }
        System.out.println(list);


        // 用stream流来解决
        List<String> list1 = names.stream().filter(s -> s.startsWith("张"))
                .filter(a -> a.length() == 3).collect(Collectors.toList());
        // collect 收集  collect(Collectors.toList()) 把过滤好的数据收集到list集合中
        System.out.println(list1);
    }
}
