package d57_stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Collections.addAll(students,
                new Student("蜘蛛精", 26, 172.5),
                new Student("蜘蛛精", 26, 172.5),
                new Student("紫霞", 23, 167.6),
                new Student("白晶晶", 25, 169.0),
                new Student("牛魔王", 35, 183.3),
                new Student("牛夫人", 34, 168.5)
        );
        //需求1：请计算出身高超过168的学生有几人。
        long size = students.stream().filter(s -> s.getHeight() > 168).count();
        System.out.println(size);

        //需求2：请找出身高最高的学生对象，并输出。
        Student s = students.stream().max(((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight()))).get();
        System.out.println(s);
        //需求3：请找出身高最矮的学生对象，并输出。
        Student s1 = students.stream().max(((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight()))).get();
        System.out.println(s1);

        //需求4：请找出身高超过170的学生对象，并放到一个新集合中去返回。
        List<Student> collect = students.stream().filter(a -> a.getHeight() > 170).collect(Collectors.toList());
        System.out.println(collect);
        Set<Student> collect1 = students.stream().filter(a -> a.getHeight() > 170).collect(Collectors.toSet());
        System.out.println(collect1);

        //需求5：请找出身高超过170的学生对象，并把学生对象的名字和身高，存入到一个Mαp集合返回。
        Map<String, Double> map = students.stream().filter(a -> a.getHeight() > 170)
                .distinct()
                .collect(Collectors.toMap(a -> a.getName(), a -> a.getHeight()));
        System.out.println(map);

    }
}
