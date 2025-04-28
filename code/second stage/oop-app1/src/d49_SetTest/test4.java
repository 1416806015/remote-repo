package d49_SetTest;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class test4 {
    public static void main(String[] args) {

        // 目标：掌握TreeSet集合的使用
        Set<Integer> set1 = new TreeSet<>();
        set1.add(6);
        set1.add(5);
        set1.add(5);
        set1.add(7);
        System.out.println(set1);

        Set<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 按照升高升序排序
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });
        students.add(new Student("蜘蛛精", 23, 169.9));
        students.add(new Student("紫霞", 22, 169.8));
        students.add(new Student("至尊宝", 23, 165.9));
        students.add(new Student("牛魔王", 22, 188.9));
        System.out.println(students);
    }
}
