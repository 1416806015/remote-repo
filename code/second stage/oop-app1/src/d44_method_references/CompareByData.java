package d44_method_references;

import d42_arrays.Student;

public class CompareByData {
    public static int compareByAge(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();  // 升序
    }

    public int compareByAgeDesc(Student o1, Student o2) {
        return o2.getAge() - o1.getAge();  // 降序
    }
}

