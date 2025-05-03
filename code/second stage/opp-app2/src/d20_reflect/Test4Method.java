package d20_reflect;

import org.junit.Test;

import java.lang.reflect.Method;

public class Test4Method {

    @Test
    public void testGetMethod() throws Exception {
        // 1、反射第一步，先得到类的Class对象
        Class c = Cat.class;
        // 2、获取全部的成员方法
        Method[] methods = c.getDeclaredMethods();
        // 3、遍历这个数组中的每个方法对象
        for (Method method : methods) {
            System.out.println(method.getName() + "-->"
                    + method.getParameterCount() + "-->"
                    + method.getReturnType());
        }

        // 4、获取某个方法对象
        Method run = c.getDeclaredMethod("run");
        System.out.println(run.getName() + "-->"
                + run.getParameterCount() + "-->"
                + run.getReturnType());

        Method eat = c.getDeclaredMethod("eat", String.class);
        System.out.println(eat.getName() + "-->"
                + eat.getParameterCount() + "-->"
                + eat.getReturnType());

        Cat cat = new Cat();
        run.setAccessible(true);
        Object rs = run.invoke(cat);  // 调用无参数的run方法，用cat对象触发调用
        System.out.println(rs);

        eat.setAccessible(true);
        Object rs2 = (String) eat.invoke(cat, "鱼儿");

        System.out.println(rs2);

    }
}
