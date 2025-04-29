package d51_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        // 1、public static<T> boolean addAll(Collection<? super T> c, T... elements)：为集合批量添加元素
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三", "李四", "张麻子");
        System.out.println(names);

        // 2、public static void shuffle(List<?> list)：打乱List集合中的元素顺序
        Collections.shuffle(names);
        System.out.println(names);

        // 3、public static <T> void sort(List<T> list): 对List集合中的元素进行升序排序
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(2);
        Collections.sort(list);
        System.out.println(list); // [2, 3, 5]

        List<Student> students = new ArrayList<>();
        students.add(new Student("蜘蛛精", 23, 169.7));
        students.add(new Student("紫霞", 22, 169.8));
        students.add(new Student("紫霞", 22, 169.8));
        students.add(new Student("至尊宝", 26, 165.5));
        //Collections.sort(students);
        System.out.println(students);

        // 4、public static <T> void sort(List<T> List, comparator<? super T> c):
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });
        System.out.println(students);
    }
}
