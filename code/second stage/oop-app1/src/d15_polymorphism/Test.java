package d15_polymorphism;

public class Test {
    public static void main(String[] args) {
        // 认识多态： 对象多态，行为多态
        // 1、对象多态
        People p1=new Teacher();
        p1.run();
        System.out.println(p1.name);
        // 2、行为多态
        People p2=new Student();
        p2.run();
        System.out.println(p2.name);
    }
}
