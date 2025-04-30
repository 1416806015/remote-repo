package d57_stream;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores, 88.5, 100.0, 60.0, 99.0, 9.5, 99.6, 25.0);
        //需求1：找出成绩大于等于60分的数据，并升序后，再输出
        scores.stream().filter(s -> s >= 60).sorted().forEach(s -> System.out.println(s));

        List<Student> students = new ArrayList<>();
        Collections.addAll(students,
                new Student("蜘蛛精", 26, 172.5),
                new Student("紫霞", 23, 167.6),
                new Student("白晶晶", 25, 169.0),
                new Student("牛魔王", 35, 183.3),
                new Student("牛夫人", 34, 168.5)
        );
        //需求2：找出年龄大于等于23，且年龄小于等于30岁的学生，并按照年龄降序输出。
        students.stream().filter(s -> s.getAge() >= 23 && s.getAge() <= 30)
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())   // 此时的 s 过滤完 直接sorted它不知道要怎么排序，在Students重写compareTo ，或者在sorted重写
                .forEach(s -> System.out.println(s));

        //需求3：取出身高最高的前3名学生，并输出。
        students.stream().sorted(((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight())))
                .limit(3).forEach(s -> System.out.println(s));
        System.out.println("-------------------------------");

        //需求4：取出身高倒数的2名学生，并输出。
        students.stream().sorted(((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight())))
                .skip(students.size() - 2).forEach(s -> System.out.println(s));

        //需求5：找出身高超过168的学生叫什么名字，要求去除重复的名字，再输出。
        students.stream().filter(s -> s.getHeight() > 168)
                .map(s -> s.getName()) // 把过滤好的映射成为他的名字
                .distinct()  // 去重 ,自定义类型的对象（希望内容一样就认为重复，需要重写hashCode，equals）
                .forEach(s -> System.out.println(s));

        // 合并流
        Stream<String> st1 = Stream.of("展示", "李四");
        Stream<String> st2 = Stream.of("展示1", "李四1", "威威");
        Stream<String> allSt = Stream.concat(st1, st2);
        allSt.forEach(s -> System.out.println(s));


    }
}
