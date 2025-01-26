package d6_singleinstance;

import java.util.SplittableRandom;

public class A {
    // 2、定义一个类变量记住类的一个对象
    private static A a=new A();

    // 1、把类的构造器私有化
    private A(){

    }

    // 3、定义一个类方法，返回对象
    public static A getObject(){
        return a;
    }
}
