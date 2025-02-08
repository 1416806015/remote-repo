package d12_extends_override;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        // 方法重写
        /*
        * 方法重写的其它注意事项
        * 使用Override注解，他可以指定java编译器，检查我们方法重写的格式是否正确，代码可读性也会更好。
        * 子类重写父类方法时，访问权限必须大于或者等于父类该方法的权限（public>protected>缺省）。
        * 重写的方法返回值类型，必须与被重写方法的返回值类型一样，或者范围更小。私有方法、静态方法不能被重写，如果重写会报错的。
        */
        B b=new B();
        b.print1();
        b.print2(1,2);
        System.out.println("-------------------");
        Student student=new Student("波妞",19);
        System.out.println(student.toString());
        System.out.println(student);
    }
}
