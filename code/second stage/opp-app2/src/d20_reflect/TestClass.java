package d20_reflect;

/**
 * 获取Class对象的三种方式
 * Class c1 =类名.class
 * 调用Class提供方法:public static Class forName(String package);
 * Object提供的方法: public Class getClass(); Class c3 =对象.getclass()
 */
public class TestClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Student.class;
        System.out.println(c1.getName());//全类名
        System.out.println(c1.getSimpleName());//简名: Student

        Class c2 = Class.forName("d20_reflect.Student ");
        System.out.println(c1 == c2);

        Student student = new Student();
        Class c3 = student.getClass();
        System.out.println(c2 == c3);
    }
}
