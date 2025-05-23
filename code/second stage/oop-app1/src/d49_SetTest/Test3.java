package d49_SetTest;

import java.util.HashSet;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        // 目标：自定义的类型的对象，比如两个内容一样的学生对象，如果让HashSet集合能够去重复！

        Set<Student> students = new HashSet<>();

        Student s1 = new Student("至尊宝", 28, 169.6);
        Student s2 = new Student("蜘蛛精", 23, 169.6);
        Student s3 = new Student("蜘蛛精", 23, 169.6);
        Student s4 = new Student("牛魔王", 48, 169.6);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        System.out.println(students);
    }
}
