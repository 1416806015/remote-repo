package d25_interface_jdk8;

public interface A {
    /*
    * 1、默认方法:必须使用default修饰，默认会被public修饰
    * 实例方法：对象的方法，必须使用实现类的对象访问。
    * */
    default void test1(){
        System.out.println("====默认方法====");
    }
    /*
    * 私有方法:必须使用private修饰。(JDK 9开始才支持的)
    * 实例方法:对象的方法。
    * */
    private void test2(){
        System.out.println("====私有方法====");
    }
    /*
     * 静态方法:必须使用static修饰,默认会被public修饰
     * */
    static void test3(){
        System.out.println("====静态方法====");
    }

}
