package d17_final;

public class Test {
    public static  final String schoolName = "haha";
    public static void main(String[] args) {

        // 目标：认识final的作用
        // final关键字是最终的意思，可以修饰(类、方法、变量)

        // 3、修饰变量:该变量只能被赋值一次。
        // 变量：
        //     局部变量:
        //     成员变量:
        //             1、静态成员变量
        //             2、实例成员变量
        final int a;
        a = 12;
        // a = 23;  第二次赋值 报错
        final double r=3.14;


    }

    public  static void buy(final double z){
        // z = 0.1; 第二次赋值 出错了
    }
}

// 1、修饰类:该类被称为最终类，特点是不能被继承了
final class A{ }
//class B extends A{}

// 2、修饰方法:该方法被称为最终方法，特点是不能被重写了，
class C{
    public final void test(){

    }
}
class D extends C{
//    @Override
//    public void test() {
//        super.test();
//    }
}


