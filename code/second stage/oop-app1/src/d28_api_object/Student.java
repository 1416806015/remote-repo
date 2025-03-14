package d28_api_object;

import java.util.Objects;

public class Student extends Object{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //重写equals方法，比较两个对象的内容一样就返回true
    //比较者:s2 == this
    //被比较者:s1==0
    @Override
    public boolean equals(Object o) {
        // 1、判断两个对象是否地址一样，一样直接返回true.
        if (o == null || getClass() != o.getClass()) return false;
        // 2、判断o是null直接返回false，或者比较者的类型与被比较者的类型不一样，返回false
        Student student = (Student) o;
        // 3、o不是null，且o一定是学生类型的对象。开始比较内容了!
        return age == student.age && Objects.equals(name, student.name);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
