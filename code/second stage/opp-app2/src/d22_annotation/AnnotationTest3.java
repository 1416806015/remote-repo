package d22_annotation;


import org.junit.Test;

import java.lang.reflect.Method;

public class AnnotationTest3 {
    @Test
    public void parseClass() {
        // 1、先得到class对象
        Class c = Demo.class;
        // 2、解析类上的注解
        // 判断类上是否包含了某个注解
        if (c.isAnnotationPresent(MyTest4.class)) {
            MyTest4 myTest4 = (MyTest4) c.getDeclaredAnnotation(MyTest4.class);
            System.out.println(myTest4.value());
            System.out.println(myTest4.aaa());
            System.out.println(myTest4.bbb());
        }
    }

    @Test
    public void parseMethod() throws Exception {
        // 1、先得到class对象
        Class c = Demo.class;
        Method m = c.getDeclaredMethod("test1");
        // 2、解析方法上的注解
        // 判断方法对象上是否包含了某个注解
        if (m.isAnnotationPresent(MyTest4.class)) {
            MyTest4 myTest4 = (MyTest4) m.getDeclaredAnnotation(MyTest4.class);
            System.out.println(myTest4.value());
            System.out.println(myTest4.aaa());
            System.out.println(myTest4.bbb());
        }
    }
}
