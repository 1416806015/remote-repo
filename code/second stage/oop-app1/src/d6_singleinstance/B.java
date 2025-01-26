package d6_singleinstance;

public class B {
    // 2、定义一个类变量，用于存储这个类的一个对象
    private static B b;
    // 1、
    private B(){

    }
    // 3、定义一个类方法，这个方法要保证第一次调用时才创建一个对象
    public static B getInstance(){
        if (b==null){
            System.out.println("第一次创建对象~~");
            b=new B();
        }
    return b;
    }
}
