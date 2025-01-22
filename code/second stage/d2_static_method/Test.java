package d2_static_method;

public class Test {
    public static void main(String[] args) {

        //掌握有无static修饰方法的用法
        // 1、类方法的用法
        //类名.类方法(推荐)
        Student.printHelloWorld();

        // 对象.类方法（不推荐）
        Student student=new Student();
        student.printHelloWorld();

        // 2、实例方法的用法
        // 对象.实例方法
        student.printPass();
        //Student.printPass();  报错
    }
}
