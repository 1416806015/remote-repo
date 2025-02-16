package d16_polymorphism_2;

public class Test {
    public static void main(String[] args) {
        // 认识多态： 对象多态，行为多态
        // 1、解耦合，右边对象是解耦合的，便于扩展和维护
        People p1=new Student();
        p1.run();
        //p1.test();   多要下不能使用子类的独有功能
        // 强制类型转换
        Student s1=(Student)p1;
        s1.test();

        // 运行时，如果发现对象的真实类型与强转后的类型不同，就会报类型转换异常(ClassCastException)的错误出来
        // Teacher t1=(Teacher)p1;  // 运行时，出现ClassCastException错误
        if(p1 instanceof Student){
            Student s2=(Student)p1;
            s2.test();
        }else if (p1 instanceof Teacher){
            Teacher t2=(Teacher)p1;
            t2.teach();
        }
        System.out.println("------------");


        // 2、可以使用父类类型的变量作为形参，可以接受一切子类对象
        Student student=new Student();
        go(student);
        Teacher teacher=new Teacher();
        go(teacher);
    }

    public static void go(People p ){
        if(p instanceof Student){
            Student s=(Student)p;
            s.test();
        }else if (p instanceof Teacher){
            Teacher t=(Teacher)p;
            t.teach();
        }
    }
}
